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

    public List<DataObjects.Product> getProducts(final int productId) throws Exception {
        connect.connect();
        String query = "select * from products left join product_market on products.product_id = " +
                "product_market.product_id where products.product_id= ?";

        VereinfachtesResultSet vereinfachtesResultSet = connect.issueSelectStatement(query, productId);
        ArrayList<DataObjects.Product> products = new ArrayList<DataObjects.Product>();;

        while (vereinfachtesResultSet.next()) {
            int productIdReturn = vereinfachtesResultSet.getInt(0);
            int marketId = vereinfachtesResultSet.getInt(1);
            String name = vereinfachtesResultSet.getString("product_name");
            int amount = vereinfachtesResultSet.getInt(3);
            java.sql.Timestamp timeStamp = vereinfachtesResultSet.getTimestamp(4);

            Product product = new Product(productId, marketId, name, amount, timeStamp);
            products.add(product);
        }

        connect.close();

        return products;
    }
}
