package DBCommunication;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;


public class VereinfachtesResultSet {

    private ResultSet resultSet;

    /**
     * creates a more verbose error message that actually tells you whats wrong
     *
     * @param columnLabel
     * @return
     */
    private String errorMessage(String columnLabel) {
        return String.format(
                "error in VereinfachtesResultSet: Spalte %s konnte nicht gefunden werden",
                columnLabel
        );
    }

    /**
     * creates a more verbose error message that actually tells you whats wrong
     *
     * @param columnIndex
     * @return
     */
    private String errorMessage(int columnIndex) {
        return String.format(
                "error in VereinfachtesResultSet: Zeile %d konnte nicht gefunden werden",
                columnIndex
        );
    }

    public VereinfachtesResultSet(ResultSet resultset) {
        if (resultset == null) {
            throw new Error("kein Resultset");
        }
        this.resultSet = resultset;
    }

    public boolean next() {
        try {
            return resultSet.next();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }


    public int getInt(int columnIndex) {
        try {
            return resultSet.getInt(columnIndex);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnIndex));
    }

    public float getFloat(int columnIndex) {
        try {
            return resultSet.getFloat(columnIndex);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnIndex));
    }

    public double getDouble(int columnIndex) {
        try {
            return resultSet.getDouble(columnIndex);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnIndex));
    }


    public Date getDate(int columnIndex) {
        try {
            return resultSet.getDate(columnIndex);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnIndex));
    }


    public Timestamp getTimestamp(int columnIndex) {
        try {
            return resultSet.getTimestamp(columnIndex);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnIndex));
    }

    public Timestamp getTimestamp(String columnLabel) {
        try {
            return resultSet.getTimestamp(columnLabel);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnLabel));
    }

    public Timestamp getTimestampIgnoreError(String columnLabel) {
        try {
            return resultSet.getTimestamp(columnLabel);
        } catch (SQLException ex) {
        }
        throw new Error(errorMessage(columnLabel));
    }

    public String getString(String columnLabel) {
        try {
            return resultSet.getString(columnLabel);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnLabel));
    }

    public boolean getBoolean(String columnLabel) {
        try {
            return resultSet.getBoolean(columnLabel);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnLabel));
    }

    public int getInt(String columnLabel) {
        try {
            return resultSet.getInt(columnLabel);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnLabel));
    }

    public long getLong(String columnLabel) {
        try {
            return resultSet.getLong(columnLabel);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnLabel));
    }

    public float getFloat(String columnLabel) {
        try {
            return resultSet.getFloat(columnLabel);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnLabel));
    }

    public double getDouble(String columnLabel) {
        try {
            return resultSet.getDouble(columnLabel);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnLabel));
    }

    public ResultSetMetaData getMetaData() {
        try {
            return resultSet.getMetaData();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }

    public Object getObject(int columnIndex) {
        try {
            return resultSet.getObject(columnIndex);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnIndex));
    }

    public Object getObject(String columnLabel) {
        try {
            return resultSet.getObject(columnLabel);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnLabel));
    }

    public int findColumn(String columnLabel) {
        try {
            return resultSet.findColumn(columnLabel);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error(errorMessage(columnLabel));
    }

    public boolean isBeforeFirst() {
        try {
            return resultSet.isBeforeFirst();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }

    public boolean isAfterLast() {
        try {
            return resultSet.isAfterLast();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }

    public boolean isFirst() {
        try {
            return resultSet.isFirst();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }

    public boolean isLast() {
        try {
            return resultSet.isLast();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }

    public void beforeFirst() {
        try {
            resultSet.beforeFirst();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }

    public void afterLast() {
        try {
            resultSet.afterLast();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }

    public boolean first() {
        try {
            return resultSet.first();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }

    public boolean last() {
        try {
            return resultSet.last();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }

    public int getRow() {
        try {
            return resultSet.getRow();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        throw new Error("error in VereinfachtesResultSet");
    }
}