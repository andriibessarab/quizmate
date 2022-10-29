package fileManagement;

// Global imports 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

// Local Imports
import quiz.*;

public class fileManager {

	// Add quiz to file
	public static void writeObject(String quizName, Quiz quiz) {

        String path = "./Quizes/" + quizName + ".txt"; // Path to file

        try(ObjectOutputStream write = new ObjectOutputStream (new FileOutputStream(path)))
        {
            write.writeObject(quiz); // Store object of class Quiz in file
        }
        catch(NotSerializableException nse)
        {
            // TODO
        }
        catch(IOException eio)
        {
            // TODO
        }
    }

	// Read quiz from file
    public static Question[] readObject(String quizName) {
		// TODO
		return new Question[]{};
	}

}