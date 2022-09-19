package com.example.springbootaopsample.controller;

import com.example.springbootaopsample.model.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class PersonApi {
    @PostMapping("/check")
    public String checkPerson(@Valid @RequestBody Person person){
        return "person firstName is good!";
    }
}
