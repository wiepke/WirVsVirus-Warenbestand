package DataObjects;

import java.sql.Timestamp;

public class Product {
    private int productId;
    private String name;
    private Integer amount;
    private java.sql.Timestamp timeStamp;

    public Product(int productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Product(String name, Integer amount, Timestamp timeStamp) {
        this.name = name;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }
}
