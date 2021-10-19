package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    String word = "";
    String compWords[] = {"variable","binary","hexadecimal","string","real","boolean","java","python","input","output"};
    String hangMan[] = {"|_____","|     ","| / | ","| -|- ","|  0  ","|/ |  ","______"};
    System.out.println("1 or two players");
    int players = input.nextInt();

    if (players == 1) {
        int compWordIndex = random.nextInt(9);
        word = compWords[compWordIndex];
    }
    if (players == 2) {
        word = input.next();
    }

    int wordLength = word.length();

        for (int guesses = 0; guesses < 7; guesses = guesses) {
            String wordHidden[] = new[wordLength];
            for (int i = 0; i < wordLength; i++) {
                wordHidden[i] = ("_");
            }

            for (int i = 0; i < wordLength; i++) {
                System.out.println(wordHidden[i]);
            }

            for (int i = 0; i < guesses; i++) {
                System.out.println(hangMan[i]);
            }

            if (guesses == 6) {
                System.out.println("you lose");
                break;
            }

            System.out.println("guess a letter");
            String charGuess = input.next();
            for (int i = 0; i < wordLength; i++) {

                if (charGuess.charAt(0) == word.charAt(i)) {
                    wordHidden[i] = charGuess;
                }
                else {
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
