public class LeapYear {
    public static void main(String[] args) {
        int daysOfTheYear = 365;

        if (daysOfTheYear%2 == 0) {
            System.out.println("It's a Leap Year");
        } else if (daysOfTheYear%2 >0) {
            System.out.println("It's not a Leap Year");
        }
    }
}