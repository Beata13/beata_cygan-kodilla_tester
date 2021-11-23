import java.util.Random;

public class RandomNumbers {

    public RandomNumbers() {
    }

    public int getCountOfRandomNumber() {


        Random random = new Random();
        int min = 30;
        int max = 0;
        int sum = 0;

        while (sum < 5001) {
            int a = random.nextInt(31);
            if (a > max) max = a;
            if (a < min) min = a;
            sum = sum + a;}

            System.out.println("Najwyższa wartość to" + " " + max);
            System.out.println("Najniższa wartość to" + " " + min);
        return sum;
    }
    }
