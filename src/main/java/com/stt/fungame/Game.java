package com.stt.fungame;

public class Game {

    public void playGame() {
        for (int num = 1; num <= 100; num++) {
            if(num % 3==0 && num % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if(num % 3 ==0  || String.valueOf(num).indexOf("3")!=-1) {
                System.out.println("Fizz");
            } else if (num % 5 ==0  || String.valueOf(num).indexOf("5")!=-1) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}
