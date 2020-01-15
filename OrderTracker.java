public class OrderTracker {

    public static void main(String[] args) {
        
        Customer customer1 = new Customer("Bob", "bob@gmail.com");
        Item item1 = new Item("Oranges", 500);
        Item item2 = new Item("Apples", 750);
        Item item3 = new Item("Bananas", 1050);
        Item[] itemList = {item1, item2, item3};
        Order order1 = new Order(itemList, customer1);
        customer1.setOrder(order1);

        System.out.println(order1.totalPrice());
        System.out.println(item1);
        System.out.println(item3);
        
        item3.sale(.3);
        
        System.out.println(item3);
        System.out.println(order1.totalPrice());
    }

}