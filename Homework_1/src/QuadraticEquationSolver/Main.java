package QuadraticEquationSolver;
import ComplexNumber.ComplexNumber;
public class Main {
    public static void main(String[] args) {
        EquationParameters equationParameters = new EquationParameters();
        equationParameters.readFromConsole();
        Equation equation = new Equation(equationParameters);
        Solution solution = new Solution(equationParameters);
        solution.showSolutions();
    }
}