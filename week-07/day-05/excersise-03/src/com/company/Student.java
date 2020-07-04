package com.company;

public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }

    public void setSkippedDays(int skippedDays) {
        this.skippedDays = skippedDays;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays = this.skippedDays + numberOfDays;
    }

    Student(String name, int age, String gender, String previousOrganization) {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    Student() {
        super.setName("Jane Doe");
        super.setAge(30);
        super.setGender("female");
        this.previousOrganization = "he School of Life";
        this.skippedDays = 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}