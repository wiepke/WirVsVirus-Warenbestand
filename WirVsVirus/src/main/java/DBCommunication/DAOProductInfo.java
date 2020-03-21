package DBCommunication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class DAOProductInfo {

    public ArrayList<DataObjects.Product> getProducts(final int productId) throws Exception {
        String query = "select * from product where product_id=" + Integer.toString(productId);
        SQLConnector con = new SQLConnector();
        ResultSet resultSet = con.readDatabase(query);

        //todo need to parse the result set into the Market class

        DataObjects.Product product = new DataObjects.Product(productId);
        ArrayList<DataObjects.Product> products = new ArrayList<DataObjects.Product>();;
        try {
            while (resultSet.next()) {
                int productIdReturn = resultSet.getInt(0);
                String product_name = resultSet.getString(1);
                int marketId = resultSet.getInt(2);

                product.setName(product_name);
                product.setMarketId(marketId);
            }
        } catch (SQLException e) {
            throw e;
        }


        return product;
    }
}
