package com.example.SecurtityDemo.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "mentor")
public class Mentor {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY )
    private Long mentor_id;
    private String mentor_name;
    private int age;
    private String groupName_manage;
    private String email;
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL)
    protected List<Intern> internManaged ;

    public Mentor() {
    }

    public Mentor(Long mentor_id, String mentor_name, int age, String groupName_manage, String email, String phoneNumber) {
        this.mentor_id = mentor_id;
        this.mentor_name = mentor_name;
        this.age = age;
        this.groupName_manage = groupName_manage;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Mentor(String mentor_name,
                  int age,
                  String groupName_manage,
                  String email,
                  String phoneNumber) {
        this.mentor_name = mentor_name;
        this.age = age;
        this.groupName_manage = groupName_manage;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getMentor_id() {
        return mentor_id;
    }

    public void setMentor_id(Long mentor_id) {
        this.mentor_id = mentor_id;
    }

    public String getMentor_name() {
        return mentor_name;
    }

    public void setMentor_name(String mentor_name) {
        this.mentor_name = mentor_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroupName_manage() {
        return groupName_manage;
    }

    public void setGroupName_manage(String groupName_manage) {
        this.groupName_manage = groupName_manage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Mentor{" +
                "mentor_id=" + mentor_id +
                ", mentor_name='" + mentor_name + '\'' +
                ", age=" + age +
                ", groupName_manage='" + groupName_manage + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
