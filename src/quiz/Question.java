package quiz;

// Global Imports
import java.util.List;
import java.util.ArrayList;

public class Question {
    public String question; // Question
    public List<String> answers = new ArrayList<String>(); // List of answers
    public String correctAnswer; // Correct Answer (only set through setCorrectAnswer method)

    // Set correct answer
    public boolean setCorrectAnswer(String ans) {
        boolean corAnsSet = false; // Keep track if correct answer set
        for(String a : answers) {
            if (a.equals(ans)) {
                correctAnswer = ans;
                corAnsSet = true;
            }
        }
            return corAnsSet ? true : false; // Returns status if correct answer was set
    }

    //Check if answer is correct
    public boolean isCorrectAnswer(String ans) {
        return ans.equals(correctAnswer) ? true : false; // Returns true if user's answer matches correct answer
    }
}

