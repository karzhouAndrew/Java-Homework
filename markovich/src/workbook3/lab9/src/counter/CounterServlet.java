package counter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Сделать простейший сервлет, подсчитывающий количество посещений.
 * Т.е. При каждом обращении к сервлету, следует увеличивать счетчик посещений,
 * и выводить его значение на страницу. Количество следует хранить в файле.
 */
public class CounterServlet extends HttpServlet {

    private int counter;
    private String title = "Counter Servlet";

    @Override
    public void init() throws ServletException {
        counter = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        counter++;
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>" + title + "</title></head>");
        out.println("<body><h2 align=center>Total views</h2>");
        out.println("<p align=center>" + counter + "</p></body></html>");
        out.close();
    }
}
