package com.company;

import java.util.ArrayList;

public class Sum {

    public int sum(ArrayList numbers) {
        int result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            result = result + (int) numbers.get(i);
        }
        return result;
    }

}
