package fileManagement;

// Global imports
import java.io.*;

// Local imports
import question.Question;

public class fileManager {
    // Create & write to file
    public static void writeToFile(String quizName, Question[] data)
    {

        String path = "./Quizes/" + quizName + ".dat"; // Path to file

        try(ObjectOutputStream write = new ObjectOutputStream (new FileOutputStream(path)))
        {
            write.writeObject(data);
        }
        catch(NotSerializableException nse)
        {
            //do something
        }
        catch(IOException eio)
        {
            //do something
        }
    }
    
    // Read file
    public static Object readFromFile(String quizName)
    {
        String path = "./Quizes/" + quizName + ".dat"; // Path to file
        Object data = null; // File's data
    
        try(ObjectInputStream inFile = new ObjectInputStream(new FileInputStream(path)))
        {
            data = inFile.readObject(); // Read file
            inFile.close(); // Close File
            return data; // Return contents
        }
        catch(ClassNotFoundException cnfe)
        {
            //do something
        }
        catch(FileNotFoundException fnfe)
        {
            //do something
        }
        catch(IOException e)
        {
            //do something
        }
        return data;
    }  
}
