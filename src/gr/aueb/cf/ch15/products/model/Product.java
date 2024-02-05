package gr.aueb.cf.ch15.products.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * JavaBean -> Data Class
 */
public class Product implements IProduct{
    /**
     * Private: Encapsulation.
     * Final: Not allowed to do new and loose the reference which shows to ArrayList (only the reference is final - not the context).
     * Static: is not an Instance member. Only one List in the class-we cannot do new.
     * products is an Instance type of java interface List
     */
    private final static List<IProduct> products = new ArrayList<>();

    private long id;
    private String productName;
    private String description;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(long id, String productName, String description, double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter & Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Our List products is a private field.
     * The List is modifiable.
     * We need a method Getter in order the other classes can have access to the List.
     * @return an unmodifiable copy List of products.
     */
    public static List<IProduct> getProducts() {
        return Collections.unmodifiableList(products);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    /**
     * Public API.
     * Java class ArrayList has methods like add().
     * this shows to product instance.
     */
    @Override
    public void insert() {
        products.add(this);
    }
}
