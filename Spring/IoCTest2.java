package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IoCTest2 implements CommandLineRunner{

    @Autowired
    private Example11 example11;

    @Autowired
    private Example22 example22;

    public static void main(String[] args) {

        SpringApplication.run(IoCTest.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        example11.playMusic();
        example22.playGame();
    }

    
}
