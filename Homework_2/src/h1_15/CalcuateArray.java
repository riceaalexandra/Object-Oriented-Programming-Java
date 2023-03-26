package h1_15;

public class CalcuateArray {
    public static int calculate(int []x) {
        int s = 0;
        try {
            for (int i = 0; i < x.length; i++) {
                s = s + 100 / x[i];
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception thrown  :" + e);
            System.exit(-1);
        }
        return s;
    }
}
