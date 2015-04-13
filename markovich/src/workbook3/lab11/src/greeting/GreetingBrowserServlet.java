package greeting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Сделать сервлет, который по содержимому User-Agent будет определять
 * с помощью какого браузера зашел пользователь, и выводить сообщение вида: Приветствую пользователя Firefox
 */

@WebServlet(name = "GreetingBrowserServlet")
public class GreetingBrowserServlet extends HttpServlet {
    private static String headTemplate = "<html><head><title>Servlet Example</title></head>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userAgent = request.getHeader("user-agent");

        PrintWriter out = response.getWriter();
        out.println(headTemplate);
        out.println("<body><div align='center' style='margin-top: 300px;'>");
        if (userAgent.contains("MSIE") || userAgent.contains("IE")) {
            out.println("Welcome IE user" + "<br>");
        } else if (userAgent.contains("Safari")) {
            out.println("Welcome Safari user" + "<br>");
        } else if (userAgent.contains("Opera") || userAgent.contains("OPR")) {
            out.println("Welcome Opera user" + "<br>");
        } else if (userAgent.contains("Chrome")) {
            out.println("Welcome Google Chrome user" + "<br>");
        } else if (userAgent.contains("Firefox")) {
            out.println("Welcome Mozilla Firefox user" + "<br>");
        }
        out.println("</div></body></html>");
    }
}
