package h1_2;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.accelerate();
        System.out.println("Speed: " + myCar.getSpeed());

        MyCuteCar myCuteCar = new MyCuteCar();
        myCuteCar.setSpeed(100);
        myCuteCar.startRocketEngine();
        System.out.println("Speed: " + myCuteCar.getSpeed());
    }
}