public class Grades2 {
    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.add(1);
        grades.add(2);
        grades.add(3);
        System.out.println(grades.getLast());
        System.out.println(grades.getAverage());

    }
}