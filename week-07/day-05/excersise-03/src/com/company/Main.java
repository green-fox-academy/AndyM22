package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        Student student1 = new Student("John", 20, "male", "BE");

        student1.introduce();

        Object johnTheClone = new Student();

        johnTheClone = (Student) student1.clone();

        ((Student) johnTheClone).introduce();

    }
}
