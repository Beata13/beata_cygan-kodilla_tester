public class Aplication1 {

    public Aplication1(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    String name;
    double age;
    double height;


    public void usersQuality() {
        boolean isNotNameEmpty = name != null;

        if (isNotNameEmpty = true && (this.age > 30 && this.height > 160)) {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}