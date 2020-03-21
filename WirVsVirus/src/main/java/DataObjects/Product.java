package DataObjects;

import java.sql.Timestamp;

public class Product {
    private int productId;
    private int marketId;
    private String name;
    private Integer amount;
    private java.sql.Timestamp timeStamp;

    public Product(int productId, int marketId, String name, int amount, java.sql.Timestamp timeStamp) {
        this.productId = productId;
        this.marketId = marketId;
        this.amount = amount;
        this.timeStamp = timeStamp;
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
}
