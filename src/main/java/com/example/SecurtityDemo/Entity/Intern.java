package com.example.SecurtityDemo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Intern")
public class Intern {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY)
    private int intern_id;
    private String intern_name;
    private int age;
    private String school_name;
    private String group_name;
    private String email;
    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private Mentor mentor;


    public Intern() {
    }

    public Intern(int intern_id,
                  String intern_name,
                  int age,
                  String school_name,
                  String group_name ,
                  String email ,
                  String phone_number,
                  Mentor mentor) {
        this.intern_id = intern_id;
        this.intern_name = intern_name;
        this.age = age;
        this.school_name = school_name;
        this.group_name = group_name;
        this.email = email;
        this.phone_number = phone_number;
        this.mentor = mentor;

    }

    public int getIntern_id() {
        return intern_id;
    }


    public String getIntern_name() {
        return intern_name;
    }

    public void setIntern_name(String intern_name) {
        this.intern_name = intern_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "intern_id=" + intern_id +
                ", intern_name='" + intern_name + '\'' +
                ", age=" + age +
                ", school_name='" + school_name + '\'' +
                ", group_name='" + group_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", mentor=" + mentor +
                '}';
    }
}
