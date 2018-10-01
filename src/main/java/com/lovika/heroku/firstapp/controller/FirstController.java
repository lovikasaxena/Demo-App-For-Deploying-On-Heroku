package com.lovika.heroku.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String firstEndPoint(@RequestParam(value = "name", defaultValue = "User") String name) {
        return "Hello " + name + " !";
    }


    String justForTest(){
        return "TEST";
    }
}
