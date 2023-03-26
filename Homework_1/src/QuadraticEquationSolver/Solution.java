package QuadraticEquationSolver;
import ComplexNumber.ComplexNumber;

public class Solution {// only to display/manage solutions
    private EquationParameters parameters = new EquationParameters();
    private Equation equation = new Equation(parameters);

    public Solution(EquationParameters parameters) {
        this.parameters = parameters;
        this.equation = new Equation(parameters);
    }

    public void showSolutions() {
        ComplexNumber[] solutions = equation.solve();
        System.out.println("Solutions:");
        for (int i = 0; i < solutions.length; i++) {
            System.out.print("x" + i + " = ");
            solutions[i].showComplexNumber();
            // System.out.println("\n");
        }
    }
}