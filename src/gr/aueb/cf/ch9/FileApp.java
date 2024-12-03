package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("C:/Users/niqos/Desktop/file7.txt");
        String line;
        String[] tokens;

        try (Scanner scanner = new Scanner(fd)){
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token + " ");
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
