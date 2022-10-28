package quiz;

// Global imports
import java.util.Scanner;

// Local imports
import fileManagement.*;
import question.*;

public class Quiz {
    public static final Scanner scan = new Scanner(System.in);

    //Create Quiz
    public static void create() {
        Question a = new Question();
        a.question = "gfhdjfghjgfd";

        Question b = new Question();
        b.question = "gfhdjfghjgfd";

        Question c = new Question();
        c.question = "gfhdjfghjgfd";

        System.out.print("Quiz Name: ");
        String quizName = scan.nextLine();
        fileManager.writeToFile(quizName, new Question[]{a, b, c}); // Create file




    }

    // Play Quiz
    public static void play() {

    }
} 
