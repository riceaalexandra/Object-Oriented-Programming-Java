package ComplexNumber;

public class ComplexNumber { // The class was created to be able to display the imaginary solutions of the quadratic equation.
    private double real, imaginary;

    public ComplexNumber() { //Implicit constructor
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public void showComplexNumber() { //Display the complex number in format a+bi
        if (this.imaginary == 0) {
            System.out.println(this.real);
        } else {
            if(this.imaginary>0) {
                System.out.println(this.real + " + " + this.imaginary + "i");
            }
            else {
                System.out.println(this.real + " " + this.imaginary + "i");

            }
        }
    }

    public void set_real(double r) { //Set the real part
        this.real = r;
    }

    public void set_imaginary(double i) { //Set the imaginary part
        this.imaginary = i;
    }
}

