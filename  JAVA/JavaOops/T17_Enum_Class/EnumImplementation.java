enum Weekdays {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

}

enum Color {
    Red("400"),
    Blue("500"),
    Green("600"),
    Yellow("700"),
    Black("800"),
    White("900");

    private final String price; // Field to store the price

    // Constructor to initialize the price
    Color(String price) {
        this.price = price;
    }

    // Getter method to retrieve the price
    public String getPrice() {
        return price;
    }

}

public class EnumImplementation {
    public static void main(String[] args) {
        Weekdays weeks = Weekdays.Monday;
        System.out.println(weeks);

        Color color = Color.Black;
        System.out.println(color.getPrice());

        for (Color color1 : Color.values()) {
            System.out.println(color1 + ": " + color1.getPrice());
        }
    }
}
