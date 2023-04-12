package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Example22 {

    private Example11 example11;

    public Example22(Example11 example11) {
        this.example11 = example11;
    }

    public void playGame(){
        example11.playMusic();
    }
}
