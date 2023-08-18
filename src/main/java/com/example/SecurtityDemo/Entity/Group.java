package com.example.SecurtityDemo.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "group_id")
    private int group_id;
    @Column(name = "group_name")
    private String group_name;
    private String mentor_name;


    @OneToMany (mappedBy = "group" , cascade = {CascadeType.PERSIST , CascadeType.MERGE
            ,CascadeType.DETACH , CascadeType.REFRESH})
    @JsonManagedReference
    private List<Intern> internGroup;


    public Group() {
    }

    public Group(int group_id, String group_name, String mentor_name) {
        this.group_id = group_id;
        this.group_name = group_name;
        this.mentor_name = mentor_name;
    }

    public Group(int group_id, String group_name) {
        this.group_id = group_id;
        this.group_name = group_name;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getMentor() {
        return mentor_name;
    }

    public void setMentor(String mentor) {
        this.mentor_name = mentor;
    }

    public List<Intern> getInternGroup() {
        return internGroup;
    }

    public void setInternGroup(List<Intern> internGroup) {
        this.internGroup = internGroup;
    }


    @Override
    public String toString() {
        return "Group{" +
                "group_id=" + group_id +
                ", group_name='" + group_name + '\'' +
                ", mentor='" + mentor_name + '\'' +
                '}';
    }

    public void addIntern(Intern tempIntern){
        if(internGroup == null){
            internGroup = new ArrayList<>();
        }

        internGroup.add(tempIntern);
        tempIntern.setGroup(this);
    }


}
