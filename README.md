# HighLowEvenOddGame
High Low Even Odd Game. In Competency Exercises, you demonstrate your skill and ability to use the programming principles you've learned in the current and previous modules. You must complete this assignment by yourself, much like a module exam. You can ask instructors for clarification about the project -- you can not ask instructors or other students for help with logic or coding. If you are struggling with the project, you can look at previous assignments where you did similar work, and you can review the pertinent sections in the book.  These are the skills you practiced in this module and will now demonstrate: 

-Selection     
-Loops (FOR, While, Do While)     
-Looping to acquire valid input     
-Random numbers     
-Booleans     
-Logical operators OR and AND  

Module 2 Competency Exercise: High Low / Even Odd Game  

This project is a game, simulating the roll of 2 dice. The user predicts that the next roll combination will be high or low, and even or odd. If both are correctly predicted, the user was totally correct; if both are incorrectly predicted, the user was totally wrong; otherwise, one of the predictions was correct and the other was wrong, and the project will specify which is incorrect.  

If input is invalid, loop and ask the same question again until the input is valid.  

The dice total is high if it is greater than 7; low if it is less than 7; and always a loser when it is exactly 7. The dice total is also either even or odd.

There must be a separate method to "roll the dice" -- generate 2 separate random numbers with numbers from 1 to 6 and add them together  for the total within this method.  There must be separate methods to check the range and the even-odd aspects and determine if the user's prediction for that aspect was correct. One method will test the range: Test if the dice total is high, low, or 7. After determining the range for the dice total, test it against the user's prediction. Return a boolean that is true if the user predicted the range correctly, false if not. The other method will similarly test the even-odd aspect: Test if the dice total is even or odd, then check if the user predicted correctly and return a boolean.  

Create a method to print the results, that uses the boolean results from the two tests for range and even-odd aspect. This must use a single IF structure to test if the predictions are correct. There are 5 possible outcomes -- (1) both tests are true, so the prediction is completely correct, (2) both tests are false, so the prediction is completely wrong, (3) only the range prediction is correct, (4) only the even/odd prediction is correct, (5) the total is 7, so there is no way to win.  

Ask the user if they want to play again, and repeat the process when they reply with "y".
