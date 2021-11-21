import java.util.Arrays;
import java.util.OptionalDouble;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLast() {
        if (this.size == 0)
            return 0;
        else
            return (grades[this.size--]);
    }

    public double getAverage() {
        if (this.size == 0)
            return 0;
        else
            return (Arrays.stream(grades).sum() / (this.size));


    }
}
