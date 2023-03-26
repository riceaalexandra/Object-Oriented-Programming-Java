package h1_13AndH14;

import java.io.FileNotFoundException;

import static h1_13AndH14.Calculate.calculate;
import static h1_13AndH14.CreateFile.createFile;
import static h1_13AndH14.ReadConsole.readConsole;
import static h1_13AndH14.ReadFile.readFile;

public class Main {
    public static void main(String[] args) throws FileNotFoundException { //comments are for problem 13
        createFile();
        int a = 0;
        try {
            a = readFile();
        } catch (NumberFormatException e) {
            //System.exit(1);
            try {
                a = readConsole();
            }catch (NumberFormatException ef){
                a=readConsole();
            }

        }
        System.out.println("2*a = "+ calculate(a));
    }
}
