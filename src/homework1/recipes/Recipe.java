package homework1.recipes;

import java.util.HashMap;
import java.util.Map;

public class Recipe {
    private final Map<Product,Integer> products;
    private String recipeName;
    private Double cost;

    Recipe(String recipeName, Product product, Integer quantity){
        products = new HashMap<>();
        products.put(product, quantity);
        this.cost += product.getPrice() * quantity;
        setRecipeName(recipeName);
        addProduct(product, quantity);
    }

    private boolean validateProduct(Product product) {
        for(Product p : products.keySet()){
            if(p.getName().equals(product.getName())){
                return true;
            }
        }
        return false;
    }

    public void addProduct(Product product, Integer quantity) {
        if(this.products.containsKey(product) || validateProduct(product)) {
            throw new IllegalArgumentException("Вы пытаетесь добавить уже существующий продукт");
        } else {
            this.cost += product.getPrice() * quantity;
            products.put(product, quantity);
        }
    }

    public void setRecipeName(String recipeName) {
        if(recipeName == null || recipeName.isEmpty()) {
            throw new IllegalArgumentException("Название не должно быть пустым");
        }

        this.recipeName = recipeName;
    }

    public Map<Product,Integer> getProducts() {
        return products;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public Double getCost() {
        return cost;
    }
}