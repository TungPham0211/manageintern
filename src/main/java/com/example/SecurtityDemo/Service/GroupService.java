package com.example.SecurtityDemo.Service;


import com.example.SecurtityDemo.Entity.Group;
import com.example.SecurtityDemo.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {


    private final GroupRepository groupRepository;


    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<Group> GetListGroup(){
        return groupRepository.findAll();
    }

    public void addGroup(Group group){
        groupRepository.save(group);
        System.out.println(group);
    }

    public void deleteGroup(int group_id){
        boolean exists = groupRepository.existsById(group_id);
        if(!exists){
            throw new IllegalStateException("Group doesn't exists");
        }else{
            groupRepository.deleteById(group_id);
        }
    }
}
