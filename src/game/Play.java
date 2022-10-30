package game;

import java.util.List;
// Global imports
import java.util.Scanner;

// Local imports
import fileManagement.fileManager;
import quiz.Quiz;
import quiz.Question;

public class Play {
    public static final Scanner scan = new Scanner(System.in);
    // Play Quiz
    public static void play() {
        List<String> allQuizes = fileManager.listAllObjects(); // list of all quizes. if none, return null

        Quiz quiz = fileManager.readObject(""); // get Quiz object for specific quiz


    }
} 
