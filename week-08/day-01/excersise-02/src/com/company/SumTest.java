package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    Sum sum;
    ArrayList numbers;

    @BeforeEach
    public void init() {
        sum = new Sum();
        numbers = new ArrayList();
    }

    @Test
    public void sumEmptyArrayListTest() {
        int expected = 0;
        int actual = sum.sum(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void sumOneElementInArrayListTest() {
        int expected = 2;
        numbers.add(2);
        int actual = sum.sum(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void sumMultipleElementsInArrayListTest() {
        numbers.add(2);
        numbers.add(4);
        int expected = 6;
        int actual = sum.sum(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void sumNullArrayListTest() {
        numbers = null;
        assertNull(numbers);
    }

}