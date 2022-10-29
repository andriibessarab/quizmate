package fileManagement;

// Global imports 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

// Local Imports
import quiz.*;

public class fileManager {

    // Check if quiz w/ this name exists
    public static boolean objectExists(String quizName) {

        // TODO

        return true;
    }

	// Add quiz to file
	public static void writeObject(String quizName, Quiz quiz) {

        String path = "./quizData/" + quizName + ".txt"; // Path to file

        try(ObjectOutputStream write = new ObjectOutputStream (new FileOutputStream(path)))
        {
            write.writeObject(quiz); // Store object of class Quiz in file
        }
        catch(NotSerializableException nse)
        {
            System.out.println("dfg");
            // TODO
        }
        catch(IOException eio)
        {
            System.out.println("dfgd");
            // TODO
        }
    }

	// Read quiz from file
    public static Question[] readObject(String quizName) {

        String path = "./quizData/" + quizName + ".txt"; // Path to file

		// TODO

		return new Question[]{};
	}

}