package highlowevenoddgame;

import java.util.Scanner;

public class HighLowEvenOddGame {

    public static void main(String[] args) {
        Scanner computerKeyboardInput = new Scanner(System.in);
        String highLow, evenOdd, repeat = "";
        int die1, die2, total;
        boolean appropriateLetters = false;
        System.out.println("High-Low Even-Odd Game by Kevin Bell \n");
        while (!repeat.equalsIgnoreCase("n")) {
            do {
                System.out.print("Will the next total be High (h) or Low (l)? ");
                highLow = computerKeyboardInput.nextLine();
                if (highLow.equalsIgnoreCase("h") || highLow.equalsIgnoreCase("l")) {
                    appropriateLetters = true;
                }
            } while (!appropriateLetters);
            appropriateLetters = false;
            do {
                System.out.print("Will the next total be Even (e) or Odd (o)? ");
                evenOdd = computerKeyboardInput.nextLine();
                if (evenOdd.equalsIgnoreCase("e") || evenOdd.equalsIgnoreCase("o")) {
                    appropriateLetters = true;
                }
            } while (!appropriateLetters);
            appropriateLetters = false;
            die1 = rollDie();
            die2 = rollDie();
            total = die1 + die2;
            results(total, evenOdd, highLow);
            do {
                System.out.print("Do you want to play again? (y/n) ");
                repeat = computerKeyboardInput.nextLine();
                if (repeat.equalsIgnoreCase("n") || repeat.equalsIgnoreCase("y")) {
                    appropriateLetters = true;
                }
            } while (!appropriateLetters);
            appropriateLetters = false;
        }
    }

    public static int rollDie() {
        return (int) (Math.random() * 6 + 1);
    }

    public static boolean rangeTest(int diceTotal, String highLow) {
        boolean correct;
        if (diceTotal > 7 && highLow.equalsIgnoreCase("h")) {
            correct = true;
        } else if (diceTotal < 7 && highLow.equalsIgnoreCase(("h"))) {
            correct = false;
        } else if (diceTotal > 7 && highLow.equalsIgnoreCase("l")) {
            correct = false;
        } else {
            correct = true;
        }
        return correct;
    }

    public static boolean evenOddTest(int diceTotal, String evenOdd) {
        boolean correct;
        if (diceTotal % 2 == 1 && evenOdd.equalsIgnoreCase("o")) {
            correct = true;
        } else if (diceTotal % 2 == 1 && evenOdd.equalsIgnoreCase("e")) {
            correct = false;
        } else if (diceTotal % 2 == 0 && evenOdd.equalsIgnoreCase("e")) {
            correct = true;
        } else {
            correct = false;
        }
        return correct;
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
