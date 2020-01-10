public class Customer {

    private String name;
    private String email;
    private Order order;

    public Customer(String name, String email, Order order) {

        this.name = name;
        this.email = email;
        this.order = order;

    }

    public Customer(String name, String email) {

        this.name = name;
        this.email = email;

    }

}