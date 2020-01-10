public class OrderTracker {

    public static void main(String[] args) {
        
        Customer customer1 = new Customer("Bob", "bob@gmail.com");
        Item item1 = new Item("Oranges", 11111, 500);
        Item item2 = new Item("Apples", 11112, 4010);
        Item[] itemList = {item1, item2};
        Order order1 = new Order(itemList, customer1);

        System.out.println(order1.totalPrice());

    }

}