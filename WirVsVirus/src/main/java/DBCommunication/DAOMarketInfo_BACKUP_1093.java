package DBCommunication;

<<<<<<< HEAD
import DataObjects.Market;
import DataObjects.Product;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DAOMarketInfo {

    private MysqlConnect connect;

    public Market getMarketDetails(int marketId) {
        connect.connect();
        String query =
                "SELECT * FROM market WHERE id = ?";
        VereinfachtesResultSet vereinfachtesResultSet =
                connect.issueSelectStatement(query, marketId);
        vereinfachtesResultSet.next();
        String name = vereinfachtesResultSet.getString("name");
        String googleTrack = vereinfachtesResultSet.getString("googleTrack");
        String address = vereinfachtesResultSet.getString("address");
        //List<Product> products = vereinfachtesResultSet.getString("products");
        List<Product> products = new ArrayList<>();
        float ltdtude = vereinfachtesResultSet.getFloat("ltdtude");
        float lngtude = vereinfachtesResultSet.getFloat("lngtude");
        Market market = new Market(
                marketId, googleTrack, name,
                address, products,
                ltdtude, lngtude);
        connect.close();
        return market;
    }

    public List<Product> getAllProducts(){
        List<Product> result = new ArrayList<>();
        connect.connect();
        String query =
                "SELECT * FROM products WHERE id = ?";
        VereinfachtesResultSet vereinfachtesResultSet =
                connect.issueSelectStatement(query);
        while(vereinfachtesResultSet.next()){
            Product product = new Product(
                    vereinfachtesResultSet.getString("product_name"),
                    1,
                    new Timestamp(System.currentTimeMillis()));
        }
        return result;
    }
=======
import java.sql.ResultSet;
import java.sql.SQLException;


public class DAOMarketInfo {

    public DataObjects.Market getMarket(final int marketId) throws Exception {
        String query = "select * from market where market_id=" + Integer.toString(marketId);
        SQLConnector con = new SQLConnector();
        ResultSet resultSet = con.readDatabase(query);

        //todo need to parse the result set into the Market class
        DataObjects.Market market = new DataObjects.Market(marketId);

        try {
            while (resultSet.next()) {
                int marketIdReturn = resultSet.getInt(0);
                String googleTrack = resultSet.getString(1);
                String name = resultSet.getString(2);
                String address = resultSet.getString(3);

                market.setAddress(address);
                market.setName();
            }
        } catch (SQLException e) {
            throw e;
        }
        return market;
    }

>>>>>>> 023344048f75edb63155f4d925a70699ddb107ff
}
