
package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class file {

    public static void main(String[] args) throws Exception {
        File file = new File("abc.txt");

        // this show the file that u want to access it availbe in directory or not
        System.out.println(file.exists());
        file.createNewFile();
        // now this will give the ture
        System.out.println(file.exists());

        /*
         * But we can not perfom any operation like read or write
         * and update .
         * 
         * for performing those operations we have to make the the object of
         * FileWriter for writing and FileReader for reading ..
         */

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello World");
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        /*
         * why this is giving number insted of text?
         * The read() method of FileReader does not directly return the text. Instead,
         * it reads one character at a time as an integer, representing the character's
         * Unicode value (ASCII for basic characters). If you want to read the whole
         * content of the file as a string, you need to use a loop or a buffer.
         */
        System.out.println(fileReader.read());

        int character; // To store the Unicode value of each character
        while ((character = fileReader.read()) != -1) { // Read until end-of-file (-1)
            System.out.print((char) character); // Convert Unicode value to character
        }
        fileReader.close();

        

    }
}