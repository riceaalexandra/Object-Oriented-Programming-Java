package QuadraticEquationSolver;
import ComplexNumber.ComplexNumber;
public class Equation { //only for equation
    private double a, b, c;

    public Equation(EquationParameters equationParameters) { // constructor that sets a,b,c based on the given EquationParameters object
        a = equationParameters.get_a();
        b = equationParameters.get_b();
        c = equationParameters.get_c();
    }

    public ComplexNumber[] solve() {
        ComplexNumber[] solutions; //create an array to hold the solutions
        double delta = b * b - 4 * a * c;
        System.out.println("Delta is: " + delta);
        if (delta == 0) {
            solutions = new ComplexNumber[1]; // create an array with 1 element
            solutions[0] = new ComplexNumber(); // create a ComplexNumber object for the solution
            solutions[0].set_real(-b / (2 * a));
            solutions[0].set_imaginary(0);
        } else if (delta > 0) {
            solutions = new ComplexNumber[2];// create an array with 2 elements
            solutions[0] = new ComplexNumber();
            solutions[1] = new ComplexNumber();
            solutions[0].set_real((-b + Math.sqrt(delta)) / (2 * a));
            solutions[1].set_real((-b - Math.sqrt(delta)) / (2 * a));
            solutions[0].set_imaginary(0);
            solutions[1].set_imaginary(0);

        } else {
            solutions = new ComplexNumber[2];
            delta = -delta;
            solutions[0] = new ComplexNumber();
            solutions[1] = new ComplexNumber();
            solutions[0].set_real((-b / (2 * a)));
            solutions[1].set_real((-b / (2 * a)));
            solutions[0].set_imaginary(Math.sqrt(delta) / (2 * a));
            solutions[1].set_imaginary(-Math.sqrt(delta) / (2 * a));
        }
        return solutions; //return the solutions array
    }
}
