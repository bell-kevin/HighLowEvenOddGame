package highlowevenoddgame;

import java.util.Scanner;

public class HighLowEvenOddGame {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        String highLow, evenOdd = "z", playAgain = "y";
        int die1, die2, diceTotal;
        boolean validInput = false;
        System.out.println("High-Low Even-Odd Game by Kevin Bell \n");
        while (!playAgain.equalsIgnoreCase("n")) {
            do {
                System.out.print("Will the next total be High (h) or Low (l)? ");
                highLow = computerKeyboardInput.next();
                if (highLow.equalsIgnoreCase("h") || highLow.equalsIgnoreCase("l")) {
                    validInput = true;
                }
            } while (!validInput);
            validInput = false;
            do {
                System.out.print("Will the next total be Even (e) or Odd (o)? ");
                evenOdd = computerKeyboardInput.next();
                if (evenOdd.equalsIgnoreCase("e") || evenOdd.equalsIgnoreCase("o")) {
                    validInput = true;
                }
            } while (!validInput);
            validInput = false;
            die1 = rollDie();
            die2 = rollDie();
            diceTotal = die1 + die2;
            results(diceTotal, evenOdd, highLow);
            do {
                System.out.print("Do you want to play again? (y/n) ");
                playAgain = computerKeyboardInput.next();
                if (playAgain.equalsIgnoreCase("n") || playAgain.equalsIgnoreCase("y")) {
                    validInput = true;
                }
            } while (!validInput);
            validInput = false;
        }
    }

    public static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }

    public static boolean rangeTest(int diceTotal, String highLow) {
        boolean correctGuess;
        if (diceTotal > 7 && highLow.equalsIgnoreCase("h")) {
            correctGuess = true;
        } else if (diceTotal < 7 && highLow.equalsIgnoreCase(("h"))) {
            correctGuess = false;
        } else if (diceTotal > 7 && highLow.equalsIgnoreCase("l")) {
            correctGuess = false;
        } else {
            correctGuess = true;
        }
        return correctGuess;
    }

    public static boolean evenOddTest(int diceTotal, String evenOdd) {
        boolean correctGuess;
        if (diceTotal % 2 == 1 && evenOdd.equalsIgnoreCase("o")) {
            correctGuess = true;
        } else if (diceTotal % 2 == 1 && evenOdd.equalsIgnoreCase("e")) {
            correctGuess = false;
        } else if (diceTotal % 2 == 0 && evenOdd.equalsIgnoreCase("e")) {
            correctGuess = true;
        } else {
            correctGuess = false;
        }
        return correctGuess;
    }

    public static void results(int diceTotal, String evenOdd, String highLow) {
        System.out.printf("The total is %d%n", diceTotal);
        if (diceTotal == 7) {
            System.out.println("It's the dreaded 7, no way to win");
        } else if (evenOddTest(diceTotal, evenOdd) && rangeTest(diceTotal, highLow)) {
            System.out.println("You are totally correct!");
        } else if (!evenOddTest(diceTotal, evenOdd) && !rangeTest(diceTotal, highLow)) {
            System.out.println("You are totally wrong!");
        } else if (rangeTest(diceTotal, highLow) && !evenOddTest(diceTotal, evenOdd)) {
            System.out.println("You didn't get the even/odd right");
        } else if (evenOddTest(diceTotal, evenOdd) && !rangeTest(diceTotal, highLow)) {
            System.out.println("You didn't get the range right");
        }
    }
}
