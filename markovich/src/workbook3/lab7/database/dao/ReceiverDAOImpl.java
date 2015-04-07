package workbook3.lab7.database.dao;

import workbook3.lab7.entity.Receiver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static workbook3.lab7.utils.UtilsDB.*;

public class ReceiverDAOImpl implements ReceiverDAO {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/workbook3ver1";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "admin";

    private static final String SQL_QUERY_ADD_RECEIVER = "INSERT INTO receivers (idReceiver, nameReceiver) VALUES (?, ?)";
    private static final String SQL_QUERY_DELETE_RECEIVER = "DELETE FROM receivers WHERE nameReceiver = ? ";
    private static final String SQL_QUERY_UPDATE_RECEIVER = "UPDATE receivers SET nameReceiver = ? WHERE idReceiver = ?";
    private static final String SQL_QUERY_GET_RECEIVERS = "SELECT * FROM receivers";

    @Override
    public void addReceiver(Receiver receiver) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getDBConnection(JDBC_DRIVER, DB_URL, DB_USERNAME, DB_PASSWORD);
            preparedStatement = connection.prepareStatement(SQL_QUERY_ADD_RECEIVER);
            preparedStatement.setInt(1, receiver.getIdReceiver());
            preparedStatement.setString(2, receiver.getNameReceiver());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, preparedStatement);
        }
    }

    @Override
    public void deleteReceiver(Receiver receiver) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getDBConnection(JDBC_DRIVER, DB_URL, DB_USERNAME, DB_PASSWORD);
            preparedStatement = connection.prepareStatement(SQL_QUERY_DELETE_RECEIVER);
            preparedStatement.setString(1, receiver.getNameReceiver());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, preparedStatement);
        }
    }

    @Override
    public void updateReceiver(Receiver receiver) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getDBConnection(JDBC_DRIVER, DB_URL, DB_USERNAME, DB_PASSWORD);
            preparedStatement = connection.prepareStatement(SQL_QUERY_UPDATE_RECEIVER);
            preparedStatement.setString(1, receiver.getNameReceiver());
            preparedStatement.setInt(2, receiver.getIdReceiver());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, preparedStatement);
        }
    }

    @Override
    public List<Receiver> getReceivers() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Receiver> receiverList = null;
        try {
            connection = getDBConnection(JDBC_DRIVER, DB_URL, DB_USERNAME, DB_PASSWORD);
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_RECEIVERS);
            resultSet = preparedStatement.executeQuery();
            receiverList = initReceivers(resultSet);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, preparedStatement, resultSet);
        }
        return receiverList;
    }

    private List<Receiver> initReceivers(ResultSet resultSet) throws SQLException {
        List<Receiver> receiverList = new ArrayList<Receiver>();
        while (resultSet.next()) {
            Receiver receiver = new Receiver();
            receiver.setIdReceiver(resultSet.getInt(1));
            receiver.setNameReceiver(resultSet.getString(2));
            receiverList.add(receiver);
        }
        return receiverList;
    }
}
