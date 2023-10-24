/*
Authors: Logan Sanchez, Bailey Kwok, Blake Mosley, Rianne Papa, David Diaz, Matthew Bui, Ryan Reeves, Rafael Papa
Project Name: Trunk-Or-Treat-Trivia
Comppletion Date: 10/23/2023
Description: This project is a halloween-themed trivia game featuring 10 questions, and a score at the end. 
             After answering the 10 questions, the amount of answers correct is counted using the numCorrect variable, and the correct 
             number of correct answers will be displayed along with an end message.

***EDITORS NOTE***
- When presenting the project:
  - Zoom out website to 80% to make the CODE presentable.
  - Drag Console window to the side when presenting code.
  - Zoom in website to 125% to make the CONSOLE presentable.
  - Press "Maximize" on the top right corner of the console when running the code.
*/

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    // ALLOWS INPUT
    Scanner scnr = new Scanner(System.in);

    // VARIABLES
    String answer; // Stores answer inputted by user
    String continueEnter; // Leaves the question up until user presses enter
    int numCorrect = 0; // Counts how many answers the user got right

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Title Screen

    System.out.println("\n AVC STEM Club Computer Science Committee presents:");
    System.out.println("\t\t   _____      _________     ________         _      _      ");
    System.out.println("\t\t  /     \\         |         |               / \\    / \\  ");
    System.out.println("\t\t  \\_____          |         |_______       /   \\  /   \\ ");
    System.out.println("\t\t        \\         |         |             /     \\/     \\");
    System.out.println("\t\t  \\_____/         |         |_______      |            |  ");
    System.out.println(" _________     ______       _________                   _________        _       ");
    System.out.println("     |         |     \\          |         \\      /          |           / \\   ");
    System.out.println("     |         |_____/          |          \\    /           |          /___\\   ");
    System.out.println("     |         |    \\           |           \\  /            |         /     \\ ");
    System.out.println("     |         |     \\      ____|____        \\/         ____|____    /       \\");
    System.out.println("\n\n\t\t- A Triva Game featuring STEM and non-STEM related questions ");

    System.out.println("\nPress enter to start:"); // Prompts user to press enter to go to next question
    continueEnter = scnr.nextLine();

    // Clear screen code
    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 1

    // Outputs Question
    System.out.println("QUESTION 1");
    System.out.println("The first computer bug ever found was an actual bug,");
    System.out.println("which one was it?");

    // Outputs Choices
    System.out.println("A. Fly ");
    System.out.println("B. Bee");
    System.out.println("C. Moth");
    System.out.println("D. Ant");

    answer = scnr.nextLine(); // Answer is the variable that recieves input value from the user

    // If-Else Statement
    if (answer.equalsIgnoreCase("C")) { // Asks if answer equals capital or lowercase letter
      numCorrect++;
      System.out.println("Correct Answer! The first bug was in fact a moth!"); // Prints out correct if above statement is
                                                                           // true
    } else {
      System.out.println("Wrong Answer! The right answer is - wait I'm not telling."); // the else statement will be
                                                                                       // used when answer is wrong
    }

    System.out.println("Press enter to continue."); // Prompts user to press enter to go to next question
    continueEnter = scnr.nextLine();

    // Clear screen code
    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 2

    System.out.println("QUESTION 2");
    System.out
        .println("Who is your best choice as a survival partner in a zombie apocalypse?( There is a correct answer)");

    System.out.println("A. Mike Tyson");
    System.out.println("B. OJ Simpson");
    System.out.println("C. Hannibal");
    System.out.println("D. Michael Jackson");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("D")) {
      numCorrect++;
      System.out.println(
          "Correct! While the others are good at killing or eating living people, Michael Jackson is the only one with the ability to control                         zombies; doing so by dancing in the street.");
    } else {
      System.out.println("Unfortunately, you would...   die.");
    }

    System.out.println("Press enter to continue.");
    continueEnter = scnr.nextLine();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 3

    System.out.println("QUESTION 3");
    System.out.println("In which country did Halloween start?");

    System.out.println("A. Brazil");
    System.out.println("B. Ireland");
    System.out.println("C. India");
    System.out.println("D. Germany");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("B")) {
      numCorrect++;
      System.out.println("Correct!");
    } else {
      System.out.println("Incorrect. It began as a festival, Samhain, in Ireland");
    }

    System.out.println("Press enter to continue.");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 4

    System.out.println("QUESTION 4");
    System.out.println("What was candy corn originally called?");

    System.out.println("A. Chicken Feed");
    System.out.println("B. Pumpkin corn");
    System.out.println("C. Chicken wings");
    System.out.println("D. Air heads");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("A")) {
      numCorrect++;
      System.out.println("Correct!");
    } else {
      System.out.println("Incorrect. It was originally called chicken feed ");
    }

    System.out.println("Press enter to continue.");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 5

    System.out.println("QUESTION 5");
    System.out.println("What was the first computer system that used color display?");

    System.out.println("A. IBM 650");
    System.out.println("B. Apple 1");
    System.out.println("C. Atanasoff-Berry Computer");
    System.out.println("D. Hewlett-Packard");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("B")) {
      numCorrect++;
      System.out.println("Coooooorrect! Apple's a goat");
    } else {
      System.out.println("wrong!! you're so dumb lol. It's obvi the Apple 1");
    }
    System.out.println("Press enter to continue.");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 6

    System.out.println("QUESTION 6");
    System.out.println("What's 9 + 10?");

    System.out.println("A. 9");
    System.out.println("B. 21");
    System.out.println("C. 19");
    System.out.println("D. 56");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("C")) {
      numCorrect++;
      System.out.println("Good job!");
    } else if (answer.equalsIgnoreCase("B")) {
      System.out.println("You are quite dense.");
    } else {
      System.out.println("Incorrect");
    }

    System.out.println("Press enter to continue.");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 7

    System.out.println("QUESTION 7");
    System.out.println("Which famous author wrote the classic Gothic novel \"Dracula\"?");
    System.out.println("A. Mary Shelley");
    System.out.println("B. Edgar Allan Poe");
    System.out.println("C. Bram Stoker");
    System.out.println("D. H.P. Lovecraft");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("C")) {
      numCorrect++;
      System.out.println("That is correct! You sure know your books! :)");
    } else {
      System.out.println("Wrong! The author of \"Dracula\" is Bram Stoker.");
    }
    System.out.println("Press enter to continue");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 8
    System.out.println("QUESTION 8");
    System.out.println("Who brought the Halloween tradition to the United States?");
    System.out.println("A. The Irish");
    System.out.println("B. The Mexicans");
    System.out.println("C. The Chinese");
    System.out.println("D. The British");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("a")) {
      numCorrect++;
      System.out.println("Correct. It was the Irish, during the potato famine!");
    } else {
      System.out.println("That is the wrong answer. It was the Irish!");
    }
    System.out.println("Press enter to continue");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 9

    System.out.println("QUESTION 9 \nTrue or False? \nA. True \nB. False\n C. Both");
    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("C")) {
      numCorrect++;
      System.out.println("This is the way.");
    } else {
      System.out.println("Ur Dogwater kid... get better");
    } // tyler was here
    System.out.println("Press enter to continue");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 10

    System.out.println("QUESTION 10");
    System.out.println("Who broke the sound barrier and when?");

    System.out.println("A. Chuck Yeager; October 14, 1947");
    System.out.println("B. Charles Lindbergh; May 21, 1927");
    System.out.println("C. Jimmy Doolittle; April 18, 1942");
    System.out.println("D. Howard Hughes; July 7, 1946");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("A")) {
      numCorrect++;
      System.out.println("HAHAHA NERD!!! You must really have an appreciation for military history! ");
    } else {
      System.out.println("I guess you're not a major history nerd then!");
    }

    System.out.println("Press enter to continue.");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    
    // System.out.println();
    printEndScreen(numCorrect); // Excecutes method that prints the end screen

    System.out.println("\nPress enter to end:");
    continueEnter = scnr.nextLine();
    scnr.close();

    System.out.println("\nBye!!!");

  } // End of Main

  /*-------------------------------------------------------------------------------------------------------------------------*/
  // End Screen Method

  static void printEndScreen(int numCorrect) { // Definition of printEndScreen Method

    String border = ""; // Declares string variable
    String score = "Final Score: "; // Declares string variable
    score += Integer.toString(numCorrect); // Adds number of correct answers into "Final Score" string

    for (int i = 0; i < score.length(); ++i) { // Adjusts length of box to length of final score statement

      border += "-";

    }

    // Outputs final score surrounded in a box graphic
    System.out.println("+-" + border + "-+");
    System.out.println("| " + score + " |");
    System.out.println("+-" + border + "-+");

    // Switch statement based on how many questions right
    switch (numCorrect) {
      case 0:
        System.out.println("- It seems you actually got zero, but don't let that hurt your ego! -");
        break;
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("- You managed only " + numCorrect + ", nothing to scream about! -");
        break;
      case 5:
        System.out.println("- You got five, halfway to your prize! -");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("- You got " + numCorrect + " correct! Greater than all those who tried before! -");
        break;
      case 9:
        System.out.println("- You have gotten nine, being so close to the end must send a chill down your spine! -");
        break;
      case 10:
        System.out.println("- Wow you got a perfect ten, think of the treats you will now attain! -");
        break;
    }
  }
  /*-------------------------------------------------------------------------------------------------------------------------*/

} // End of Main Class
