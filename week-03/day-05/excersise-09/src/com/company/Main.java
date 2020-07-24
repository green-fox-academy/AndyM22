package com.company;

import com.sun.javafx.logging.JFRInputEvent;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> introduction = new HashMap<>();

        introduction.put("978-1-60309-452-8", "A Letter to Jo");
        introduction.put("978-1-60309-459-7", "Lupus");
        introduction.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        introduction.put("978-1-60309-461-0", "The Lab");

        for (String i : introduction.keySet()) {
            System.out.println(introduction.get(i) + " (" + "ISBN: " + i + ")"); //get(i) = get Object key
        }

        //Remove the key-value pair with key 978-1-60309-444-3
        introduction.remove("978-1-60309-444-3");

        //Remove the key-value pair with value The Lab
        for (String string : introduction.keySet()) {
            if (introduction.get(string).contains("The Lab")) {
                introduction.remove(string);
            }
        }

        introduction.put("978-1-60309-450-4", "They Called Us Enemy");
        introduction.put("978-1-60309-453-5", "Why Did We Trust Him?");

        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        if ((introduction.get("478-0-61159-424-8") == null)) {
            System.out.println("There is no associated value");
        } else {
            System.out.println("There is associated value");
        }

        //Print the value associated with key 978-1-60309-453-5
        System.out.println(introduction.get("978-1-60309-453-5"));

    }
}
