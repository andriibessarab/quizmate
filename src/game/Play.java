package game;

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
        Quiz quiz = fileManager.readObject("");
    }
} 
