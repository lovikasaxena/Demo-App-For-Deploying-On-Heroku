package com.lovika.heroku.firstapp.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstControllerTest {

    private FirstController firstController = new FirstController();
    @Test
    public void shouldReturnStringTEST(){
        assertEquals(firstController.justForTest(), "TEST");
    }
}