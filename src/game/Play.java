package game;

import java.util.List;
// Global imports
import java.util.Scanner;

// Local imports
import fileManagement.fileManager;
import quiz.Quiz;
import quiz.Question;

import javax.swing.*;

public class Play {
    public static final Scanner scan = new Scanner(System.in);

    // Play Quiz
    public static void play() {
        boolean runCondition = true;
        int ans;
        int i = 0;
        List<String> allQuizes = fileManager.listAllObjects(); // list of all quizes. if none, return null
        if (allQuizes == null) {
            System.out.println("No quizzes made... Go create some!");
            
        }
        else {
            while (runCondition = true)
            {
                System.out.println("Enter quiz you wish to play: ");
                ans = scan.nextInt();
                if (ans != allQuizes.indexOf(i+1))
                {
                    System.out.println("Not a valid quiz.");
                }
                else
                {
                    Quiz quiz = fileManager.readObject(allQuizes.get(ans)); // get Quiz object for specific quiz // I figured this would work, but I doubt it - Jack
                }
            }





        }
    }
}

