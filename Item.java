public class Item {

    private String name;
    private int sku;
    private int price;

    public static int currentSKU = 0;

    public Item(String name, int price) {

        this.name = name;
        this.price = price;
        
        this.sku = currentSKU;
        currentSKU++;

    }

    public int getPrice() {
        return this.price;
    }

    public void sale(double percent) {

        this.price *= (1.0 - percent);

    }

    public String toString() {

        return ("Item Name: " + this.name + " SKU ID: " + sku + " Price: " + price);

    }

}