package part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Write 100 random ints to a text file; one int per line. Use a try with
 * resources and a catch block as needed. Add a finally block that prints the
 * words "All done". 
 *
 * @author Your name
 */
public class T1P3 {

    public static void main(String[] args) {
        Random rand = new Random();
        File file = new File("TestP3.txt");
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < 100; i++) {
                output.append(rand.nextInt() + "\n");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("The file was not found.");
        } finally {
            System.out.println("All done");
        }
    }
}
