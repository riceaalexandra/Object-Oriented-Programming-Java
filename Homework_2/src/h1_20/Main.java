package h1_20;

public class Main {
    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        Integer nr1, nr2, sum;
        sum = 0;
        System.out.println("Enter the first number: ");
        nr1 = sumOfNumbers.readNumber();
        if (nr1 != null) {
            sum += nr1;
        } else {
            System.err.println("Value is bot a number");
        }
        System.out.println("Enter the second number: ");
        nr2 = sumOfNumbers.readNumber();
        if (nr2 != null) {
            sum += nr2;
        } else {
            System.err.println("Value is bota number");
        }
        System.out.println("Sum:" + sum);
    }

}