package FileHandling;

import java.io.*;

public class filehandling_Buffer {
    public static void main(String[] args) throws Exception {
        File file = new File("bufferreader.txt");

        file.createNewFile();

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("Hello World");
        writer.newLine(); // Adds a new line
        writer.write("This is an example of BufferedWriter.");
        writer.close(); // Close the writer to save changes

        // Reading the file using BufferedReader
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) { // Read line by line
            System.out.println(line);
        }
        reader.close();         




       }
}
