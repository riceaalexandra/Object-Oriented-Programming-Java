package h1_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static h1_24.CreateFile.createFile;

public class Main {
    public static void main(String[] args) {
        createFile();
        String fileName = "filename.txt";

        int sum = 0;
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    sum += scanner.nextInt();
                } else {
                    scanner.next();
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        }

        System.out.println("The sum of all integers in the file is: " + sum);
    }
}