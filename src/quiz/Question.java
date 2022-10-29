package quiz;

import java.util.*;

public class Question {
    public String question; // Question
    public List<String> answers = new ArrayList<String>(); // List of asnwers
    String correctAnswer; // Correct Answer (not public. can only be set through setCorrectAnswer method)

    // Set correct answer
    public boolean setCorrectAnswer(String ans) {
        boolean corAnsSet = false; // Keep trakc if correct answer set
        for(String a : answers) {
            if (a.equals(ans)) {
                correctAnswer = ans;
                corAnsSet = true;
            }
        }
            return corAnsSet ? true : false; // Returns status if correct asnwer was set
    }

    //Check if answer is correct
    public boolean isAnswerCorrect(String ans) {
        return ans == correctAnswer ? true : false; // Returns true if user's answer matches correct asnwer
    }
}

