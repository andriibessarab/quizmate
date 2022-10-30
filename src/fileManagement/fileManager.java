package fileManagement;

// Global imports
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;

// Local imports
import quiz.Quiz;

public class fileManager {

    // Check if quiz w/ this name exists
    public static boolean objectExists(String quizName) {

        // TODO

        return true;
    }

    // Get list of all quizes
    public static List<String> listAllObjects() {
        List<String> results = new ArrayList<String>();


        File[] files = new File("./quizData").listFiles(); //If this pathname does not denote a directory, then listFiles() returns null. 

        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }
        }

        return results;
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