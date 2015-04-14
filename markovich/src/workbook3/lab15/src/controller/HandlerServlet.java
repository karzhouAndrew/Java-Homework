package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static jdbc.DBUtils.*;

/**
 * Добавить к созданному в предыдущем задании сервлету JSP и заменить сервлет таким образом,
 * чтобы работа с базой выполнялась сервлетом, а отображение результатов на странице - JSP.
 */

@WebServlet(name = "HandlerServlet")
public class HandlerServlet extends HttpServlet {

    private static String dbUrl;
    private static String jdbcDriver;
    private static String dbUsername;
    private static String dbPassword;
    private static String sqlShowQuery;

    private ServletConfig servletConfig;

    @Override
    public void init() throws ServletException {
        servletConfig = getServletConfig();
        dbUrl = servletConfig.getInitParameter("dbUrl");
        jdbcDriver = servletConfig.getInitParameter("jdbcDriver");
        dbUsername = servletConfig.getInitParameter("dbUsername");
        dbPassword = servletConfig.getInitParameter("dbPassword");
        sqlShowQuery = servletConfig.getInitParameter("sqlShowQuery");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        List dataList = null;

        response.setContentType("text/html; charset=UTF-8");

        try {
            connection = getDBConnection(jdbcDriver, dbUrl, dbUsername, dbPassword);
            statement = connection.createStatement();
            result = statement.executeQuery(sqlShowQuery);
            dataList = getDataList(result);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, statement, result);
        }

        request.setAttribute("data", dataList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pages/database.jsp");
        if (requestDispatcher != null) {
            requestDispatcher.forward(request, response);
        }
    }

    private List getDataList(ResultSet resultSet) throws SQLException {
        List dataList = new ArrayList<>();
        while (resultSet.next()) {
            dataList.add(resultSet.getString("idExpense"));
            dataList.add(resultSet.getString("paydate"));
            dataList.add(resultSet.getString("value"));
            dataList.add(resultSet.getString("nameReceiver"));
        }
        return dataList;
    }
}
