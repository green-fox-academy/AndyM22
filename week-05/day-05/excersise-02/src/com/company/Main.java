package com.company;

import PostIt.PostIt;

public class Main {

    public static void main(String[] args) {

        PostIt object1 = new PostIt();
        object1.setBackgroundColor("ORANGE");
        object1.setText("Idea 1");
        object1.setTextColor("BLUE");
        object1.create();

        PostIt object2 = new PostIt();
        object2.setBackgroundColor("PINK");
        object2.setText("Awesome");
        object2.setTextColor("BLACK");
        object2.create();

        PostIt object3 = new PostIt();
        object3.setBackgroundColor("YELLOW");
        object3.setText("Superb!");
        object3.setTextColor("GREEN");
        object3.create();
    }
}
