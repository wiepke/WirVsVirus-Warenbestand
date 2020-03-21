package DBCommunication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DAOProductInfo {

    public DataObjects.Product getProducts(final int productId) throws Exception {
        String query = "select * from product where product_id=" + Integer.toString(productId);
        SQLConnector con = new SQLConnector();
        ResultSet resultSet = con.readDatabase(query);

        //todo need to parse the result set into the Market class
        DataObjects.Product product = new DataObjects.Product(productId);

        try {
            while (resultSet.next()) {
                int productIdReturn = resultSet.getInt(0);
                String product_name = resultSet.getString(1);
                Timestamp time = resultSet.getTimestamp(2);

                product.setName(product_name);
                product.setAmount(0); //we dont know the market yet
                product.setTimeStamp(time);
            }
        } catch (SQLException e) {
            throw e;
        }
        return product;
    }
}
