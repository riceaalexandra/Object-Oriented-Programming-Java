package h1_2;

public class Car {
    protected int speed;
    protected boolean engineStat;

    public void start() {
        if (engineStat == false) {
            System.out.println("Start car");
            startEngine();
        } else {
            accelerate();
        }
    }

    public void accelerate() {
        speed = speed + 5;
        System.out.println("Accelerate! Speed is: "+ speed);
    }

    public void stop() {
        System.out.println("Stop car.");
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startEngine() {
        System.out.println("Start engine");
        engineStat = true;
    }

    public void stopEngine() {
        System.out.println("Stop engine");
        engineStat = false;
    }

}
