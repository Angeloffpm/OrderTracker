import java.text.DecimalFormat;

public class Order {

    private Item[] items;
    private Customer customer;

    public Order(Item[] items, Customer customer) {

        this.items = items;
        this.customer = customer;

    }

    public String totalPrice() {

        int totalPrice = 0;

        for (int i = 0; i < this.items.length; i++) {

            totalPrice += items[i].getPrice();

        }

        return "Total Price: $" + (Math.round(totalPrice * 1.08) / 100.0);

    }

}