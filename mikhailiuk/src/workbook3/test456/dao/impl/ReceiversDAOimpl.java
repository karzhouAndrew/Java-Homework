package workbook3.test456.dao.impl;

import workbook3.test456.dao.ReceiversDAO;
import workbook3.test456.entity.Receiver;
import workbook3.test456.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Natashka on 07.04.2015.
 */
public class ReceiversDAOimpl implements ReceiversDAO {
    private final String SQL_ADD_RECEIVER = "insert into receivers (receivername) values(?)";
    private final String SQL_GET_RECEIVER = "select receivername from receivers where id=(?)";
    private final String SQL_GET_RECEIVERS = "select * from receivers";

    @Override
    public Receiver getReceiver(int id) {
        DBUtils dbUtils = new DBUtils();
        Connection connection = dbUtils.getDBConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Receiver receiver = null;
        try {
            preparedStatement = connection.prepareStatement(SQL_GET_RECEIVER);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            receiver = initReceiver(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.closeConnection(connection, preparedStatement);
        }
        return receiver;
    }

    @Override
    public void addReceiver(Receiver receiver) {
        DBUtils dbUtils = new DBUtils();
        Connection connection = dbUtils.getDBConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL_ADD_RECEIVER);
            preparedStatement.setString(1, receiver.getReceiverName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.closeConnection(connection, preparedStatement);
        }
    }

    @Override
    public ArrayList<Receiver> getReceivers() {
        ArrayList<Receiver> receivers = new ArrayList<Receiver>();
        DBUtils dbUtils = new DBUtils();
        Connection connection = dbUtils.getDBConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL_GET_RECEIVERS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                receivers.add(initReceiver(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.closeConnection(connection, preparedStatement);
        }
        return receivers;
    }

    public Receiver initReceiver(ResultSet resultSet) {
        Receiver receiver = new Receiver();
        try {
            receiver.setId(resultSet.getInt(1));
            receiver.setReceiverName(resultSet.getString(2));
        } catch (SQLException e) {
            System.out.println("Problem during receiver initialization");
            e.printStackTrace();
        }
        return receiver;
    }
}
