package DBCommunication;

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
}
