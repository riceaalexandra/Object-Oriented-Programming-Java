package h1_2;

public class MyCuteCar extends Car{
    private boolean rocketEngineStat;
    public void startRocketEngine() {
        if (getSpeed() > 0) {
            System.out.println("Start engine");
            rocketEngineStat = true;
        }
    }
}
