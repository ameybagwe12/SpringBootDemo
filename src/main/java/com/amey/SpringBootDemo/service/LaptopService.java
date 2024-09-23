package com.amey.SpringBootDemo.service;

import com.amey.SpringBootDemo.model.Laptop;
import com.amey.SpringBootDemo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop laptop){
        repo.save(laptop);
    }
}
