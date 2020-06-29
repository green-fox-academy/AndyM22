package com.company;

public class Mentor extends Person {

    String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender() + " " + level + " mentor.");
    }

    Mentor(String name, int age, String gender, String level) {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.level = level;
    }

    Mentor() {
        super.setName("Jane Doe");
        super.setAge(30);
        super.setGender("female");
        this.level = "intermediate";
    }

}
