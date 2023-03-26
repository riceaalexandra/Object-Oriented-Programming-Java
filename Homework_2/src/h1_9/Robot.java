package h1_9;

public class Robot implements Computer, Mechanism { //All methods
    public boolean stat;

    @Override
    public void boot() {
        if (stat == false) {
            this.on();
            System.out.println("Robot is booting up");
        } else {
            System.out.println("Robot is booting up");
        }
    }

    @Override
    public void off() {
        if (stat == true) {
            stat = false;
            System.out.println("The robot is turned off");
        } else {
            System.out.println("The robot was turned off");
        }
    }

    @Override
    public void on() {
        if (stat == false) {
            stat = true;
            System.out.println("The robot is turned on");
        } else {
            System.out.println("The robot was turned on");
        }
    }

    @Override
    public void move() {
        if (stat == false) {
            this.on();
            this.boot();
            System.out.println("Robot is moving");
        } else {
            System.out.println("Robot is moving");

        }
    }
}
