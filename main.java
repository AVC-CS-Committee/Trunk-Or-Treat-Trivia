/*
Project Lead: Samuel Segovia
Authors: Samuel Segovia, Cristian Herrera,Shane Powell, Jason Yang, Logan Sanchez, Bryan Abrego, Peter Kallos,
         Kevin Flores, Frances Kaufmann, Angelica Holley
Contributions: Shebly Gallegos, CIS 111 Zybooks
Project Name: STEM_Trivia
Comppletion Date: 10/09/2022
Description: This project is a trivia game featuring 10 questions with some being STEM related questions and some being of another topic. 
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
    // Samuel's Question

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
    // Logan's question

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
    // Peter's Question

    System.out.println("QUESTION 3");
    System.out.println("Choose a valid variable assignment: String myStr = ?");

    System.out.println("A. 1");
    System.out.println("B. 'c'");
    System.out.println("C. \"myString\"");
    System.out.println("D. myString");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("C")) {
      numCorrect++;
      System.out.println("Correct!");
    } else {
      System.out.println("Incorrect.");
    }

    System.out.println("Press enter to continue.");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Frances' Question

    System.out.println("QUESTION 4");
    System.out.println("(Who wrote the 1812 Overture?)");

    System.out.println("A.Mozart");
    System.out.println("B.Dvorak");
    System.out.println("C.Tchaikovsky");
    System.out.println("D.Stravinsky");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("C")) {
      numCorrect++;
      System.out.println("Wow! You're so smart! You must have a good taste in music! (and secretly love the Russians)");
    } else {
      System.out.println("Are you kidding me? I guess you don't love the Russians!");
    }

    System.out.println("Press enter to continue.");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Angelica's question

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
    // Sebastian's Question

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
    // Bryan's question

    System.out.println("QUESTION 7");
    System.out.println("What year was Antelope Valley College founded");
    System.out.println("A. 1929");
    System.out.println("B. 2020");
    System.out.println("C. 1895");
    System.out.println("D. 1738");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("A")) {
      numCorrect++;
      System.out.println("GOOD STUFF! You have earned one sheckle dont spend it all in one place :)");
    } else {
      System.out.println("AVC is the best how did you get that wrong! No dinner for you tonight!");
    }
    System.out.println("Press enter to continue");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Jason's question

    System.out.println("QUESTION 8");
    System.out.println("Who is one of the people credited with inventing the Internet?");
    System.out.println("A. Friedrich Nietzsche");
    System.out.println("B. Nikola Tesla");
    System.out.println("C. Robert Khan");
    System.out.println("D. Clifford Stoll");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("C")) {
      numCorrect++;
      System.out.println("Correct. You must be pretty knowledgable!");
    } else {
      System.out.println("Really...? Okay...");
    }
    System.out.println("Press enter to continue");
    continueEnter = scnr.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    /*-------------------------------------------------------------------------------------------------------------------------*/
    // Shelby's Question

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
    // Frances' Second Question

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
    // Cristians Question

    System.out.println("QUESTION 11");
    System.out.println(
        "A Few Good Men was a legal drama released in 1992, starring Tom Cruise, Jack Nicholson, and Demi Moore. This film centers around an alleged murder that takes place at a military base, so now I ask you which base?");

    System.out.println("A. Naval Air Station Miramar");
    System.out.println("B. Guantanamo Bay");
    System.out.println("C. Langley Air Force Base");
    System.out.println("D. Who is Tom Cruise?");

    answer = scnr.nextLine();

    if (answer.equalsIgnoreCase("B")) {
      numCorrect++;
      System.out.println("Correctamundo!! Fun Fact: This movie was actually based on a true story");
    } else {
      System.out.println("YOU CANT HANDLE THE TRUTH!!!!!");
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
        System.out.println("- Wow you got all wrong! Too bad! -");
        break;

      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("- You got " + numCorrect + " correct. Nice! -");
        break;

      case 5:
        System.out.println("- You got half right! Good job! -");
        break;

      case 6:
      case 7:
      case 8:
      case 9:
        System.out.println("- You got " + numCorrect + " correct! Great job! -");
        break;

      case 10:
        System.out.println("Wow you got " + numCorrect
            + " right, thats pretty good! But there are 11 questions... Darn! You were so close to being a perfect human being and being selected for our AVC super soldier program. But since you missed the test by only one you have to live the rest of your life as a boring normal person pondering on what your could have been... Sorry.");
      case 11:
        System.out.println(
            "- Perfect!!! You are a perfect speicimen and have been selected for our AVC super solider program. All we need is just 5 more minutes of your time, your social-security number, bank account number, and your first and last name. Thank You! -");
        break;
    }
  }
  /*-------------------------------------------------------------------------------------------------------------------------*/

} // End of Main Class
