import java.util.Random;

public class RandomNumbers {

    public RandomNumbers() {
    }

    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5001) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;}
        return result;
    }
    }


