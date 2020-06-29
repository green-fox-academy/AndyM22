package com.company;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getHiredStudents() {
        return hiredStudents;
    }

    public void setHiredStudents(int hiredStudents) {
        this.hiredStudents = hiredStudents;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + super.getName() + ", a " + super.getAge() + " age year old " + super.getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        this.hiredStudents = this.hiredStudents + 1;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    Sponsor(String name, int age, String gender, String company) {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        this.company = company;
    }

    Sponsor() {
        super.setName("Jane Doe");
        super.setAge(30);
        super.setGender("female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

}
