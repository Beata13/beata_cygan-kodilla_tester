public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight == "600g") {
            System.out.println("This notebook is light");
        } else if (this.weight == "1500g") {
            System.out.println("The price is quite heavy");
        } else {
            System.out.println("This notebook is very heavy");

        }
    }

    public void checkYear() {
        if (this.year >= 2020 && this.price >= 1000) {
            System.out.println("The notebook isn't old and have a good price");
        } else if (this.year  >= 2000 && this.price == 500 ) {
            System.out.println("This notebook is old and cheap");
        } else {
            System.out.println("This notebook is quite good");
        }
    }
}