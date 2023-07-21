package com.example.SecurtityDemo.Controller;


import com.example.SecurtityDemo.Entity.Group;
import com.example.SecurtityDemo.Service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v4/group")
public class GroupController {

    @Autowired
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }


    @GetMapping
    public List<Group> getListGroup(){
        return groupService.GetListGroup();
    }

    @PostMapping
    public void addGroup(@RequestBody Group group){
        groupService.addGroup(group);
    }

    @DeleteMapping
    public void deleteGroup(int group_id){
        groupService.deleteGroup(group_id);
    }

}
