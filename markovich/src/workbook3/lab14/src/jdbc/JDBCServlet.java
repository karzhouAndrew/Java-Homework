package jdbc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import static jdbc.DBUtils.*;

/**
 * Создать сервлет, который будет отображать на странице содержимое базы платежей, из модуля 2.
 * Информацию о URL базы, имени пользователя и пароле хранить в начальных данных сервлета.
 */

public class JDBCServlet extends HttpServlet {
    private static String db_url;
    private static String jdbc_driver;
    private static String db_username;
    private static String db_password;
    private static String sql_show_query;

    @Override
    public void init() throws ServletException {
        ServletConfig servletConfig = getServletConfig();
        db_url = servletConfig.getInitParameter("db_url");
        jdbc_driver = servletConfig.getInitParameter("jdbc_driver");
        db_username = servletConfig.getInitParameter("db_username");
        db_password = servletConfig.getInitParameter("db_password");
        sql_show_query = servletConfig.getInitParameter("sql_show_query");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Cookies Demo</title></head>");
        out.println("<body>");
        out.println("<table align=center border=2>");
        out.println("<caption>Expenses table</caption>");

        try {
            connection = getDBConnection(jdbc_driver, db_url, db_username, db_password);
            statement = connection.createStatement();

            result = statement.executeQuery(sql_show_query);

            out.println("<th>");
            out.println("<td>Date</td>");
            out.println("<td>Sum</td>");
            out.println("<td>Receiver</td>");
            out.println("</th>");

            while (result.next()) {
                out.println("<tr>");
                out.println("<td>" + result.getString(1) + "</td>");
                out.println("<td>" + result.getString(2) + "</td>");
                out.println("<td>" + result.getString(3) + "</td>");
                out.println("<td>" + result.getString(4) + "</td>");
                out.println("</tr>");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, statement, result);
        }
        out.println("</table>");
        out.println("</body></html>");
        out.close();
    }
}
