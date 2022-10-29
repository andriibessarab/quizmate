package fileManagement;

// Global imports
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

// Local Imports
import quiz.Quiz;

public class fileManager {

    // Check if quiz w/ this name exists
    public static boolean objectExists(String quizName) {

        // TODO

        return true;
    }

	// Add quiz to file
	public static void writeObject(String quizName, Quiz quiz) {

        String path = "./quizData/" + quizName + ".xml"; // Path to file

        try
        {
            XMLEncoder e = new XMLEncoder(
                new BufferedOutputStream(
                    new FileOutputStream(path)));
            e.writeObject(quiz);
            e.close();
        }
        catch(IOException eio)
        {
            // TODO
        }
    }

	// Read quiz from file
    public static Quiz readObject(String quizName) {

        String path = "./quizData/" + quizName + ".xml"; // Path to file
        Quiz data = null;

        try
        {
            XMLDecoder d = new XMLDecoder(
                      new BufferedInputStream(
                          new FileInputStream(path)));
            data = (Quiz) d.readObject();
            d.close();
            return data;
        }
        catch(FileNotFoundException fnfe)
        {
            // TODO
        }

        return data;
	}
}