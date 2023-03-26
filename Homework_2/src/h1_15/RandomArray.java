package h1_15;

import java.util.Scanner;

import static h1_15.GenerateRandom.generateRandomInt;

public class RandomArray {
    public static int[] generateArray(int n){
        int x[]=new int[n];
        try {
            for (int i = 0; i < n; i++) {
                x[i] = generateRandomInt();
            }
          /*  System.out.println("Random numbers: ");
            for(int i=0;i<n;i++){
                System.out.println(x[i]);
            }*/
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :"+ e);
            System.exit(-1);
        }
        return x;
    }

}
