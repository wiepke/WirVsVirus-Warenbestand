package DataObjects;

import java.util.List;

public class Market {
    private int id;
    private String googleTrack; //google tracks IDs of places, which are unique
    private String name;
    private String address;
    private List<Product> products;
    private float averagePresenceTime;  //get data from sensors

    public Market(int id) {
        this.id = id;
    }

    public Market(int id, String googleTrack, String name, String address){
        this.id = id;
        this.googleTrack = googleTrack;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoogleTrack() {
        return googleTrack;
    }

    public void setGoogleTrack(String googleTrack) {
        this.googleTrack = googleTrack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public float getAveragePresenceTime() {
        return averagePresenceTime;
    }

    public void setAveragePresenceTime(float averagePresenceTime) {
        this.averagePresenceTime = averagePresenceTime;
    }
}
