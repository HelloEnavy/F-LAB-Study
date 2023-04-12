package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Example11 {

    private Example22 example22;

    public Example11(Example22 example22) {
        this.example22 = example22;
    }

    public void playMusic(){
        example22.playGame();
    }
}
