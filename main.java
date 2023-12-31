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
    System.out.print("\033[H\033[2J");
    String asciiArt  = "ooooo   ooooo           oooo  oooo                                                                  ooooooooooooo           o8o               o8o            \n"
                + "`888'   `888'           `888  `888                                                                  8'   888   `8           `\"'               `\"'            \n"
                + " 888     888   .ooooo.   888   888   .ooooo.  oooo oooo    ooo  .ooooo.   .ooooo.  ooo. .oo.             888      oooo d8b oooo  oooo    ooo oooo   .oooo.   \n"
                + " 888ooooo888  d88' `88b  888   888  d88' `88b  `88. `88.  .8'  d88' `88b d88' `88b `888P\"Y88b            888      `888\"8P `888   `88.  .8'  `888  `P  )88b  \n"
                + " 888     888  888   888  888   888  888   888   `88..]88..8'   888ooo888 888ooo888  888   888            888       888      888    `88..8'    888   .oP\"888  \n"
                + " 888     888  888   888  888   888  888   888    `888'`888'    888    .o 888    .o  888   888            888       888      888     `888'     888  d8(  888  \n"
                + "o888o   o888o `Y8bod8P' o888o o888o `Y8bod8P'     `8'  `8'     `Y8bod8P' `Y8bod8P' o888o o888o          o888o     d888b    o888o     `8'     o888o `Y888\"8o";
        System.out.println(asciiArt);

    System.out.print("\nPress enter to start:"); // Prompts user to press enter to go to next question
    continueEnter = scnr.nextLine();

    // Clear screen code
    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    
    // Outputs Question
    System.out.println("QUESTION 1");
    System.out.println("What was the most commercially succesful horror movie of all time?");

    // Outputs Choices
    System.out.println("A. Smile");
    System.out.println("B. IT");
    System.out.println("C. The Boogeyman");
    System.out.println("D. Insidous");
    System.out.println(" ");

    System.out.print("Enter your choice: ");
    answer = scnr.nextLine(); // Answer is the variable that recieves input value from the user

    // If-Else Statement
    if (answer.equalsIgnoreCase("B")) { // Asks if answer equals capital or lowercase letter
      numCorrect++;
      System.out.println("Correct Answer!"); // Prints out correct if above statement is
                                                                           // true
    } else {
      System.out.println("Wrong Answer! The correct answer was IT "); // the else statement will be
                                                                                       // used when answer is wrong
    }
    System.out.println(" ");
    System.out.print("Press enter to continue. "); // Prompts user to press enter to go to next question
    continueEnter = scnr.nextLine();

    // Clear screen code
    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 2

    System.out.println("QUESTION 2");
    System.out.println("What is the most popular Halloween candy in America? ");

    System.out.println("A. M&Ms");
    System.out.println("B. Candy Corn");
    System.out.println("C. Sour Path Kids");
    System.out.println("D. Skittles");
    System.out.println(" ");
    
    System.out.print("Enter your choice: ");
    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("D")) {
      numCorrect++;
      System.out.println(
          "Correct! You Would think it would be Candy Corn.");
    } else {
      System.out.println("Unfortunately the answer was Skittles so your wrong.... And basic... And wrong");
    }
    System.out.println(" ");
    System.out.print("Press enter to continue.");
    continueEnter = scnr.nextLine();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 3

    System.out.println("QUESTION 3");
    System.out.println("What special days is Halloween a part of?");

    System.out.println("A. The 12 days of Christmas");
    System.out.println("B. Hallowtide");
    System.out.println("C. Groundhog Day");
    System.out.println("D. St Valentine and St Patrick’s Day");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("B")) {
      numCorrect++;
      System.out.println("Correct!");
    } else {
      System.out.println("Incorrect. Notice the prefix in Hollowtide.");
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
    System.out.println("What is the name of the famous animated film produced by Tim Burton about a skeleton who discovers a town dedicated to Halloween?");

    System.out.println("A. Corpse Bride");
    System.out.println("B. Frankenweenie");
    System.out.println("C. The Nightmare Before Christmas");
    System.out.println("D. Coraline");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("C")) {
      numCorrect++;
      System.out.println("You are cooking!! Keep Going!");
    } else {
      System.out.println("Cannot believe you failed, welp by the way the answer is C. The Nightmare Before Christmas.");
    }
    System.out.println("Press enter to continue.");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 6

    System.out.println("QUESTION 6");
    System.out.println("In the song \"Monster Mash\", who throws a party for monsters?");

    System.out.println("A. Dr. Frakenstein");
    System.out.println("B. The Mummy");
    System.out.println("C. Igor");
    System.out.println("D. Count Dracula");


    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("A")) {
      numCorrect++;
      System.out.println("I see you, Good Work!");
    } else if (answer.equalsIgnoreCase("B")) {
      System.out.println("Get better, the answer is A. Dr. Frakenstein. Just because you lost heres a fun fact Halowwen is now the second largest commercial holiday in the country!");
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

    System.out.println("QUESTION 9");
    System.out.println("what item or items are banned only during Halloween?");

    // Outputs Choices
    System.out.println("A. Silly string");
    System.out.println("B. Fireworks");
    System.out.println("C. A YoYo");
    System.out.println("D. Shoes");
    System.out.println(" ");

    System.out.print("Enter your choice: ");
    answer = scnr.nextLine(); // Answer is the variable that recieves input value from the user

    if (answer.equalsIgnoreCase("a")) {
      numCorrect++;
      System.out.println("CORRECT!!! Your more gooder then others");
    } else {
      System.out.println("Incorrect! The correct answer was A. Silly string. Sorry ");
    } // tyler was here
    System.out.println(" ");
    System.out.print("Press enter to continue: ");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Question 10

    System.out.println("QUESTION 10");
    System.out.println("What was the name of Wednesday's pet spider in the Addams family?");

    System.out.println("A. Bob");
    System.out.println("B. Homer");
    System.out.println("C. Lucifer");
    System.out.println("D. William");
    System.out.println(" ");
    System.out.print("Enter your choice: ");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("b")) {
      numCorrect++;
      System.out.println("Correct!!! YOU WON 10$!! ask the kind person at the desk for the money.....     SIKE!!!!!  ");
    } else {
      System.out.println("WRONG!! The correct answer was B. Homer");
    }
    System.out.println(" ");
    System.out.print("Press enter to continue: ");
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
