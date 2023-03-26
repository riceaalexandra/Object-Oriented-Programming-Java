package h1_13AndH14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsole {
    private static int a;
    public static int readConsole(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a: ");
            a = scanner.nextInt();
            return a;
        }catch(InputMismatchException e) {
            System.out.println("Error: " + e);
            System.out.println("Please re-enter:");
            a = readConsole();
            return a;
        }
    }
}
