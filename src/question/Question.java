package question;

import java.util.*;

public class Question {
    public String question;
    List<String> options = new ArrayList<String>();
    String correctOption;

    public boolean answerCorrect(String o) {
        return o == correctOption ? true : false;
    }
}

