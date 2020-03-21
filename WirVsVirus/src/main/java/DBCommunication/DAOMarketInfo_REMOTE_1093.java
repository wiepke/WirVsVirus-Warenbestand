package DBCommunication;

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

}
