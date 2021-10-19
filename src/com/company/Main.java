package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    String word = "";
    String compWords[] = {"variable","binary","hexadecimal","string","real","boolean","java","python","input","output"};
    String hangMan[] = {"|_____","| / | ","| -|- ","|  0  ","|/ |  ","______"};
    System.out.println("1 or 2 players:");
    int players = input.nextInt();

    if (players == 1) {
        int compWordIndex = random.nextInt(9);
        word = compWords[compWordIndex];
    }
    if (players == 2) {
        System.out.println("enter a 6 or more letter word:");
        word = input.next();
    }

    int wordLength = word.length();
    int guesses = 0;

        while (guesses < 6) {
            String wordHidden[] = new String[wordLength];
            for (int i = 0; i < wordLength; i++) {
                wordHidden[i] = ("_");
            }

            for (int i = 0; i < wordLength; i++) {
                System.out.print(wordHidden[i]);
            }
            System.out.println(":");

            for (int i = 0; i < guesses-1; i++) {
                System.out.println(hangMan[i]);
            }

            if (guesses == 6) {
                System.out.println("you lose");
                break;
            }

            System.out.println("guess a letter:");
            String charGuess = input.next();
            boolean guessCorrect = false;
            for (int i = 0; i < wordLength; i++) {

                if (charGuess.charAt(0) == word.charAt(i)) {
                    wordHidden[i] = charGuess;
                    guessCorrect = true;
                }
            if (guessCorrect == false) {
                guesses++;
            }

            }

        }



/*
"______"
"|/ |  "
"|  0  "
"| -|- "
"| / | "
"|     "
"|_____"
*/



    }
}
