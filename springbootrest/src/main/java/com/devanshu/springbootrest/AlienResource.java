package com.devanshu.springbootrest;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlienResource {

    @Autowired
    AlienRepository repo;

    @GetMapping("aliens")
    public List<Alien> getAliens(){
//        List<Alien> aliens = new ArrayList<>();
//
//        Alien a1 = new Alien();
//
//        a1.setId(101);
//        a1.setName("Devanshu");
//        a1.setPoints(100);
//
//        Alien a2 = new Alien();
//        a2.setId(102);
//        a2.setName("Neha");
//        a2.setPoints(70);
//
//        aliens.add(a1);
//        aliens.add(a2);
//
//        return aliens;

        List<Alien> aliens = (List<Alien>)repo.findAll();

        return aliens;

    }
}
