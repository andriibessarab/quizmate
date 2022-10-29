// Global imports
import java.util.*;

import game.*;

public class App {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Introduction
        System.out.println("\n--> QuizMate <--");
        System.out.println("Welcome to a command line game QuizMate!");
        System.out.println("Type \"help\" for a list of commands");

        while (true) {
            // Prompt user for action
            String action = scan.next().toLowerCase();

            // Perform Action
            if (action.equals("create")) { // Create Quiz
                Create.create();
            }
            else if (action.equals("play")) { // Play Quiz
                Play.play();
            }
            else if (action.equals("help")) { // List commands
                System.out.println("\nList of Commands:");
                System.out.println("\"create\" - Create a new Quiz");
                System.out.println("\"play\" - Play a Quiz");
                System.out.println("\"help\" - Display a List of Commands");
                System.out.println("\"exit\" - Leave the Game");
            }
            else if (action.equals("exit")) { // Terminate Program
                System.out.println("\nExiting...");
                System.exit(0); // Terminate
            }
            else { // If Command Undefined
                System.out.println("\nUndefiend Command");
                System.out.println("Type \"help\" for full list of commands");
            }
        }
    }
}

            