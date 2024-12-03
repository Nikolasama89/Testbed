package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:/Users/niqos/Desktop/file7.txt");
        File outFd = new File("C:/Users/niqos/Desktop/file7-out.txt");
        String line;
        String[] tokens;

        try (Scanner scanner = new Scanner(inFd);
             PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                tokens = line.split("\\s+");

                for (String token : tokens) {
                    System.out.print(token + " ");
                    ps.printf("%s ", token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
