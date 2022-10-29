// Global imports
import java.util.*;

import game.*;

public class App {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Introduction
        System.out.println("--> QuizMate <--");
        System.out.println("Welcome to QuizMate!");
        System.out.println("Type \"help\" for a list of commands");

        while (true) {
            // Prompt user for action
            String action = scan.next();

            // Perform Action
            if (action.equals("Create")) { // Create Quiz
                Game.create();
            }
            else if (action.equals("Play")) { // Play Quiz
                Game.play();
            }
            else if (action.equals("Help")) { // List commands
                System.out.println("List of Commands:");
                System.out.println("Create - Create a new Quiz");
                System.out.println("Play - Play a Quiz");
                System.out.println("Exit - Leave the Game");
            }
            else if (action.equals("Exit")) { // Terminate Program
                System.out.println("Exiting...");
                System.exit(0); // Terminate
            }
            else { // If Command Undefined
                System.out.println("Undefiend Command");
            }
        }
    }
}

            