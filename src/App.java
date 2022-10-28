import java.util.*;
import quiz.*;


public class App {
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (true) {
            // Prompt user for action
            String action = scan.next();

            // Perform Action
            if (action.equals("Create")) {
                Quiz.create();
            }
            else if (action.equals("Play")) {
                Quiz.play();
            }
            else if (action.equals("Exit")) {
                System.out.println("Exiting...");
                System.exit(0); // Terminate
            }
            else {
                System.out.println("Undefiend Command");
            }
        }
    }
}

            