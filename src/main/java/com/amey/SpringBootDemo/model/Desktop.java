package com.amey.SpringBootDemo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Service  // WORKS SIMILAR TO COMPONENT
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compile in desktop...");
    }
}

