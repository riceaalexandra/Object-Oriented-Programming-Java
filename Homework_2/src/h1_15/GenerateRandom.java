package h1_15;
import java.util.Random;
public class GenerateRandom {
    public static int generateRandomInt(){
        Random random = new Random();
        int x=random.nextInt(20);
        return x;
    }
}
