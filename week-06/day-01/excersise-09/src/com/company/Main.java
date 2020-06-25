package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(12);
        array.add(250);
        array.add(8);
        array.add(10);
        array.add(432);

        System.out.println(maximumFinder(array));

    }

    public static ArrayList<Integer> maximumFinder(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return null;
        } else if (array.size() == 1) {
            return array;
        } else if (array.get(0) < array.get(1)) {
            array.remove(0);
            return maximumFinder(array);
        } else {
            array.remove(1);
            return maximumFinder(array);
        }
    }

}
