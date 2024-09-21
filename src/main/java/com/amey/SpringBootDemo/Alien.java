package com.amey.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // DECLARATION (COMPONENT ANNOTATION) FOR SPRING FRAMEWORK
public class Alien {

    @Autowired //WIRING BTWN ALIEN AND LAPTOP
    Laptop laptop;
    public void code() {
        laptop.compile();
    }
}
