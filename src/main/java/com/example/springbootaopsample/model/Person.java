package com.example.springbootaopsample.model;

import com.example.springbootaopsample.annotation.NameSize;
import org.springframework.stereotype.Component;

public class Person {
    @NameSize(min = 2, max = 12, message = "This is not correct")
    private String firstName;
    private String lastName;

    public String getFirstName() {
        System.out.println(this.getClass().getName() + ".getFirstName()");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println(this.getClass().getName() + ".setFirstName()");
        this.firstName = firstName;
    }

    public String getLastName() {
        System.out.println(this.getClass().getName() + ".getLastName()");
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println(this.getClass().getName() + ".setLastName()");
        this.lastName = lastName;
    }
}
