public class Users {
    public Users() {

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Users(String name, int year) {
        this.name = name;
        this.year = year;
    }

    String name;
    int year;


    public void userUnderAverage() {

        Users Magda = new Users("Magda", 40);
        Users Dawid = new Users("Dawid", 25);
        Users Monika = new Users("Monika", 15);

        Users[] users = {Magda, Dawid, Monika};

        int i = getYear();
        int result = 0;
        for (i = 0; i < users.length; i++) {
            result = result + users[i].year;


            int usersAverage = (result / users.length);



            for (i = 0; i < users.length; i++) {

                if (getYear() < usersAverage) {
                    System.out.println(getName());
                }
            }
        }
    }
}









