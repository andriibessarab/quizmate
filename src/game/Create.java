package game;

// Global imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Local imports
import fileManagement.*;
import quiz.*;

public class Create {
    public static final Scanner scan = new Scanner(System.in);

    //Create Quiz
    public static void create() {

        Quiz newQuiz = new Quiz();

        System.out.println("\n^^^ Create a Quiz ^^^");

        // Aquire quiz name
        System.out.print("Quiz Name: ");
        String newQuizName = scan.nextLine();
        // TODO - check if quiz with this name exists && name is valid
        newQuiz.quizName = newQuizName; // Set variable "name" of a new instance of class Quiz to user's input


        // Aquire # of questions
        System.out.print(String.format("How many questions will quiz \"%s\" have? ", newQuizName));
        int numOfQ = scan.nextInt();
        scan.nextLine(); // skip next line
        // TODO - make sure # > 0 && catch invalid #'s & and 0 < int < 16

        List<Question> questions = new ArrayList<Question>();

        // Get questions
        for (int i = 0; i < numOfQ; i++) {
            Question newQuestion = new Question();
            // Aquire question name
            System.out.print("Question #" + (i + 1) + ": ");
            String newQuestionName = scan.nextLine();
            // TODO - check if name is valid
            newQuestion.question = newQuestionName; // Set variable "question" of a new instance of class Question to user's input

            // Aquire # of answers to question
            System.out.print("How many answers will question #" + (i+ 1) + " have? ");
            int newQuestionNumOfAnswers = scan.nextInt();
            scan.nextLine(); // skip next line
            // TODO - check if valid int & and 1 < int < 6

            // Get answers
            System.out.println("Answers");
            List<String> newQuestionAnswers = new ArrayList<String>(); // Array of answers to a question
            int j = 0;
            while (newQuestionAnswers.size() != newQuestionNumOfAnswers) {

                System.out.print((char)(65+j) + ": ");
                String newAnswer = scan.nextLine();
                // TODO - validate answer
                
                if(newQuestionAnswers.contains(newAnswer)) {
                    System.out.println("This answer already has been added.");
                } else {
                    newQuestionAnswers.add(j, newAnswer);
                    j++;
                }
            }

            newQuestion.answers = newQuestionAnswers; // Set variable "answers" of a new instance of class Question to user's answers

            //Set correct answer
            boolean correctAnswerSetSuccessfully = false;
            while (!correctAnswerSetSuccessfully) {
                System.out.println("Correct answer: ");
                correctAnswerSetSuccessfully =  newQuestion.setCorrectAnswer(scan.nextLine());

                if (!correctAnswerSetSuccessfully) {
                    System.out.println("Line above doesn't match any of the provided answers. Try again!");
                }
            }

            questions.add(i, newQuestion); // Add new question to list
        }

        newQuiz.questions = questions; // Set variable "questions" of a new instance of class Quiz to user's questions 

        fileManager.writeObject(newQuiz.quizName, newQuiz); // Create file
        // TODO - handle file manager errors
        System.out.println("Quiz Created Successfully!");
    }

    //Delete Quiz
    public static void delete() {

        // TODO

    }

} 
