package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main;

    @BeforeAll
    public void setUp(){
        main = new Main();
    }

    @Test
    public void anagramShouldReturnTrue(){
        assertTrue(true, Main.anagram("Ahoj", "joha"));
    }

}