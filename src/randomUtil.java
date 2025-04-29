import java.util.Random;

public class randomUtil {
    public static void main(String[] args) {

        Random rand = new Random();

        int mood = rand.nextInt(10) + 1;

        System.out.println("Mood level: " + mood);

        if (mood >= 8) {
            System.out.println("You seem to be in a great mood.");
        } else if (mood >= 5) {
            System.out.println("You seem to be doing fine.");
        } else {
            System.out.println("You might be feeling a bit down.");
        }
    }
}

