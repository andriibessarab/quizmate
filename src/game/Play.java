package game;

// Global imports

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;

// Local imports
import fileManagement.fileManager;
import quiz.Quiz;
import quiz.Question;

public class Play {
    public static final Scanner scan = new Scanner(System.in);

    // Play Quiz
    public static void play() {
        List<String> allQuizzes = fileManager.listAllObjects(); // list of all quizzes. if none, return null
        int score = 0;
        if (allQuizzes == null) {
            System.out.println("No quizzes made... Go create some!");
            return;
        }

        System.out.println("Which quiz you wish to play?");
        for (String q : allQuizzes) {
            System.out.println(allQuizzes.indexOf(q) + 1 + " : " + q.replace(".xml", ""));
        }

        Quiz quiz;

        while (true) {
            int q;
            try {
                q = scan.nextInt() - 1;
            } catch (InputMismatchException ime) {
                continue;
            }

            try {
                quiz = fileManager.readObject(allQuizzes.get(q));
            } catch (Exception e) {
                // TODO - raise error in filemanager and handle it
                continue;
            }

            break;
        }

        // Start game
        System.out.println("\n<----" + quiz.quizName + "---->");

        for (Question q : quiz.questions) {
            System.out.println(q.question); // print out question

            // print answers
            for (String a : q.answers) {
                System.out.println("\t" + (char) (q.answers.indexOf(a) + 65) + " : " + a);
            }

            String ans;
            char answer;

            //prompt user for answer
            while (true) {
                System.out.print("Your answer: ");
                ans = scan.next();
                ans = ans.toUpperCase();

                if (ans.length() == 1) {
                    answer = ans.charAt(0);
                    int charAns = answer;
                    if(charAns >= 65 && charAns <= (65 + (q.answers.size()-1))) {
                        break;
                    }

                }
            }

            if (q.isCorrectAnswer(q.answers.get((int)answer - 65))) {
                System.out.println("You got it!!!");
                score++;
            } else {
                System.out.println("Try harder next time :(");
            }
        }
        System.out.println("Your score is " + Math.round((float)score / quiz.questions.size() * 100) + "%");
        System.out.println("(" + ((short)score + "/"+ quiz.questions.size() + " correct)"));
    }
}

