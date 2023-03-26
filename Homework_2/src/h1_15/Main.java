package h1_15;


import java.util.Scanner;

import static h1_15.CalcuateArray.calculate;
import static h1_15.RandomArray.generateArray;

public class Main {
    public static void main(String[] args){
        try {
            System.out.print("Enter n: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] x = generateArray(n);
            System.out.println(calculate(x));
        }catch(Exception e){
            System.out.println("Exception thrown  :" + e);
            System.exit(-1);
        }
    }
}
