package com.knoldus;

public class User {


    private String name;
    private  String syllabus;

    User(){


    }

    public User(String name, String syllabus ){
        this.name = name;
        this.syllabus=syllabus;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", syllabus='" + syllabus + '\'' +
                '}';
    }
}


