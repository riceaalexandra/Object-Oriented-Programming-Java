package h1_20;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SumOfNumbers {
    Integer readNumber() {
        Scanner in = new Scanner(System.in);
        int nr;
        try {
            nr = in.nextInt();
        } catch (InputMismatchException e) {
             e.printStackTrace();
            return null;
        }
        return nr;
    }
}