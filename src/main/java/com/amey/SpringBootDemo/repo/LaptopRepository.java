package com.amey.SpringBootDemo.repo;

import com.amey.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

// FILE FOR DATABASE OPERATIONS (NOT TO WRITE QUERIES IN SERVICE CLASS)
@Repository
public class LaptopRepository {
    public void save(Laptop laptop){
        System.out.println("Saved in database");
    }
}
