package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Thing> things = new ArrayList<>();

    public Fleet() {
        things = new ArrayList<>();
    }

    public void add(Thing thing) {
        things.add(thing);
    }

    public List<Thing> getThings() {
        return things;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < things.size(); i++) {
            result += (i + 1) + ". " + things.get(i) + "\n";
        }
        return result;
    }

}