package DBCommunication;

import DataObjects.Market;
import DataObjects.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DAOProductInfo {

    private MysqlConnect connect;

    public List<DataObjects.Product> getProducts(final int productId) {
        connect.connect();
        String query = "select * from products left join product_market on products.product_id = " +
                "product_market.product_id where products.product_id= ?";

        VereinfachtesResultSet vereinfachtesResultSet = connect.issueSelectStatement(query, productId);
        ArrayList<DataObjects.Product> products = new ArrayList<DataObjects.Product>();;

        while (vereinfachtesResultSet.next()) {
            int productIdReturn = vereinfachtesResultSet.getInt(0);
            String name = vereinfachtesResultSet.getString("product_name");
            int marketId = vereinfachtesResultSet.getInt(2);
            int amount = vereinfachtesResultSet.getInt(4);
            java.sql.Timestamp timeStamp = vereinfachtesResultSet.getTimestamp(5);

            Product product = new Product(productId, marketId, name, amount, timeStamp);
            products.add(product);
        }

        connect.close();

        return products;
    }

    public List<DataObjects.Product> getAllProducts() {
        connect.connect();
        String query = "select * from products left join product_market on products.product_id = " +
                "product_market.product_id";

        VereinfachtesResultSet vereinfachtesResultSet = connect.issueSelectStatement(query);
        ArrayList<DataObjects.Product> products = new ArrayList<DataObjects.Product>();;

        while (vereinfachtesResultSet.next()) {
            int productIdReturn = vereinfachtesResultSet.getInt(0);
            String name = vereinfachtesResultSet.getString("product_name");
            int marketId = vereinfachtesResultSet.getInt(2);
            int amount = vereinfachtesResultSet.getInt(4);
            java.sql.Timestamp timeStamp = vereinfachtesResultSet.getTimestamp(5);

            Product product = new Product(productIdReturn, marketId, name, amount, timeStamp);
            products.add(product);
        }

        connect.close();

        return products;
    }
}
