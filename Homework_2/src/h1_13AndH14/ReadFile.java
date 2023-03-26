package h1_13AndH14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static h1_13AndH14.ReadConsole.readConsole;

public class ReadFile {
    public static int readFile() throws NumberFormatException,FileNotFoundException { //comments are for problem 13
        // try {
        String data = null;
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
        }
        myReader.close();
        //   try {
        int number = Integer.parseInt(data);
        return number;
           /* }catch (NumberFormatException e){ //comments are for problem 13
                int a;
                a=readConsole();
                return a;
            }
        } catch (FileNotFoundException e) {
            return 1;
        }*/
    }
}
