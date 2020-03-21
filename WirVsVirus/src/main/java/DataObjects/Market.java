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
}
