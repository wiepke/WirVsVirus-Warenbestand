package DBCommunication;

import java.sql.*;

public class SQLConnector {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public ResultSet readDatabase(final String query) throws Exception {

        try {
            // Setup the connection with the DB
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/sortiertereinkauf?"
                    + "user=hack&password=Virus_1234");
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (Exception e) {
            throw e;
        } finally {
            close();
        }
        return resultSet;
    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }
}
