package com.amey.SpringBootDemo.model;

import org.springframework.stereotype.Component;

@Component
//@Service  // WORKS SIMILAR TO COMPONENT
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compile in laptop...");
    }
}
