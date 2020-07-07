package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplesTest {

    private Apples apples;

    @BeforeEach
    public void setUp() {
        apples = new Apples();
    }

    @Test
    public void getAppleTest() {
        String expected = "apple";
        String actual = apples.getApple();
        assertEquals(expected, actual);
    }

}