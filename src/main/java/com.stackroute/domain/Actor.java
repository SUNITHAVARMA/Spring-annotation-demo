package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    private int age;
    private String name;
    private String gender;

    public Actor(){

    }
    public void setGender(String gender) {
        this.gender=gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor Information" +" "+
                "name=" + name +" "+
                "age=" + age +" "+
                "gender=" + gender
                ;
    }
}
