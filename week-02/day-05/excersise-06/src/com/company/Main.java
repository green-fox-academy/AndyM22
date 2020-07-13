package com.company;

public class Main {

    public static void main(String[] args) {

        int dailyHours = 6;
        int semesterHour = (17 * 5 * 6);

        System.out.println("Attendee working on workdays: " + semesterHour);

        float weeklyHours = 52f;
        float allHours = (24 * 7 * 17f);
        System.out.println("Percentage of coding hours: " + ((weeklyHours * 100) / allHours) + "%");

    }
}
