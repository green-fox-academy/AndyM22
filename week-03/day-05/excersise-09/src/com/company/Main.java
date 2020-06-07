package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> introduction = new HashMap<>();

        introduction.put("978-1-60309-452-8", "A Letter to Jo");
        introduction.put("978-1-60309-459-7", "Lupus");
        introduction.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        introduction.put("978-1-60309-461-0", "The Lab");

        for (String i : introduction.keySet()) {
            System.out.println(introduction.get(i) + " (" + "ISBN: " + i + ")");
        }

        introduction.remove("978-1-60309-444-3");

        introduction.remove("978-1-60309-461-0", "The Lab");

        introduction.put("978-1-60309-450-4", "They Called Us Enemy");
        introduction.put("978-1-60309-453-5", "Why Did We Trust Him?");


        if ((introduction.get("478-0-61159-424-8") == null)) {
            System.out.println("There is no associated value");
        } else {
            System.out.println("There is associated value");
        }

        System.out.println(introduction.get("978-1-60309-453-5"));

    }
}
