package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class IoCTest implements CommandLineRunner{

    @Autowired
    private Example1 example1;

    @Autowired
    private Example2 example2;

    public static void main(String[] args) {

        SpringApplication.run(IoCTest.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        example1.playMusic();
        example2.playGame();
    }

    
}
