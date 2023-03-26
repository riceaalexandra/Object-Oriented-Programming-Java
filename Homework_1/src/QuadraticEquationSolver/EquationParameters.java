package QuadraticEquationSolver;
import java.util.*;
public class EquationParameters { //take care of equation parameters
    protected double a, b, c;

    public void readFromConsole() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a: "); // a the coefficient of x^2
            a = scanner.nextDouble();
            this.a = a;
            System.out.print("Enter b: ");// b the coefficient of x
            b = scanner.nextDouble();
            this.b = b;
            System.out.print("Enter c: ");// c the constant term
            c = scanner.nextDouble();
            this.c = c;
        } catch(InputMismatchException e){
            System.out.println("Error: "+e);
            System.out.println("Please re-enter:");
            readFromConsole();
        }

    }

    public EquationParameters() {

    }

    public EquationParameters(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double get_a() {
        return this.a;
    }

    public double get_b() {
        return this.b;
    }

    public double get_c() {
        return this.c;
    }
}