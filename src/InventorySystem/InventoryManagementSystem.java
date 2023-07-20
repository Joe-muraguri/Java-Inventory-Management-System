package InventorySystem;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagementSystem {
    private List<Product> products;

    public InventoryManagementSystem() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateStockLevel(int productId, int quantity){
        Product product = findProduct(productId);
        if (product != null){
            product.updateStockLevels(quantity);
        } else {
            System.out.println("Product not found");
        }
    }

    public void generateInventoryReport(){
        System.out.println("\nInventory Report");
        for (Product product : products){
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Product Price: " + product.getPrice());
            System.out.println("Product Stock: " + product.getStockLevel());
            System.out.println("*-----------------------*");
        }
    }

    private Product findProduct(int productId) {
        for (Product product : products){
            if (product.getProductId()==productId){
                return product;
            }
        }
        return null;
    }
}
