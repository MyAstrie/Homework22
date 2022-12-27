package homework1.recipes;

public class Product {
    private String name;
    private Double price;
    private Integer weight;

    public Product(String name, Double price, Integer weight) {
        setName(name);
        setPrice(price);
        setWeight(weight);
    }

    public Product(String name, Double price) {
        setName(name);
        setPrice(price);
        this.weight = 1;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не должно быть пустым");
        }

        this.name = name;
    }

    public void setPrice(Double price) {
        if(price == null || price <= 0) {
            throw new IllegalArgumentException("Цена не должна быть меньше нуля или пустой");
        }

        this.price = price;
    }

    public void setWeight(Integer weight) {
        if(weight == null || weight <= 0) {
            throw new IllegalArgumentException("Количество не должно быть меньше нуля или пустой");
        }

        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getWeight() {
        return weight;
    }
}