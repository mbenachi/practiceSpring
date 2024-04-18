package com.codeinnova.practiceSpring.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class primerController {
    @GetMapping("/app/foo")
    public Map<String, String> foo(){

        Map<String, String> json = new HashMap<>();
        json.put("message", "Hi crazy");
        json.put("date", new Date().toString());

        return json;
    }
}
