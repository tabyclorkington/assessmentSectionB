package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the top limit. Min is 1, Max is 1000");
        Scanner input = new Scanner(System.in);
        int maxNumber = input.nextInt();
        while (maxNumber < 1 | maxNumber > 1000) {
            System.out.println("Not a valid choice, please enter another number: ");
            maxNumber = input.nextInt();
        }
        Random random = new Random();
        int guess = 0;
        int numberOfGuesses = 0;

            int numberToGuess = random.nextInt(maxNumber);


        while (((guess == numberToGuess)== false) & numberOfGuesses < 5) {
            System.out.println("Have a guess");
            guess = input.nextInt();
            numberOfGuesses = numberOfGuesses + 1;
        }

        if (guess == numberToGuess){
            System.out.println("You win");
        }else System.out.println("You lose");
        System.out.println("The random number was " + numberToGuess);
    }
}
