package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  /*  Main main;

    @BeforeEach
    public void setUp(){
        this.main = new Main();
    }*/

    @Test
    public void anagramShouldReturnTrue(){
        assertTrue(Main.anagram("Ahoj", "jo ha"));
    }

    @Test
    public void anagramShouldReturnFalse(){
        assertFalse(Main.anagram("jahoda", "achjo"));
    }

}