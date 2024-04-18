package P1;

import java.util.ArrayList;


public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String name, int quantity) {
        products.add(new Product(name, quantity));
    }

    public void removeProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                break;
            }
        }
    }

    public void updateQuantity(String name, int newQuantity) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setQuantity(newQuantity);
                break;
            }
        }
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Product product : products) {
            System.out.println(product.getName() + ": " + product.getQuantity());
        }
    }
}
