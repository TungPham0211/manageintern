package com.example.SecurtityDemo.Entity;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Group {

    @Id
    @SequenceGenerator(
            name = "Group_sequence",
            sequenceName = "Group_sequence",
            allocationSize = 1
    )
    @GeneratedValue
            (strategy = GenerationType.SEQUENCE,
                    generator = "Group_sequence")

    private int group_id;
    private String group_name;
    private String mentor;
    private List <String> intern;




    public Group(int group_id, String group_name, String mentor, List intern) {
        this.group_id = group_id;
        this.group_name = group_name;
        this.mentor = mentor;
        this.intern = new ArrayList<>();
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
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public List getIntern() {
        return intern;
    }

    public void setIntern(List intern) {
        this.intern = intern;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group_id=" + group_id +
                ", group_name='" + group_name + '\'' +
                ", mentor='" + mentor + '\'' +
                ", intern=" + intern +
                '}';
    }
}
