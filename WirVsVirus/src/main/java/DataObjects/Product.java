package DataObjects;

import java.sql.Timestamp;

public class Product {
    private int productId;
    private int marketId;
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

<<<<<<< HEAD
    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
=======
    public Product(String name, Integer amount, Timestamp timeStamp) {
        this.name = name;
        this.amount = amount;
        this.timeStamp = timeStamp;
>>>>>>> 467a0ed889d866e5d3e4e232192602bc19b6e497
    }
}
