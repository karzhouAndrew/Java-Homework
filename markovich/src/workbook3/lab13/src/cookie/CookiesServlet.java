package cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Изменить счетчик из задания 9 так, чтобы подсчитывались только уникальные посещения за сутки.
 * Для контроля, был ли данный пользователь в течение последних суток на сайте использовать куки.
 */

public class CookiesServlet extends HttpServlet {
    private int counter;

    @Override
    public void init() throws ServletException {
        counter = 0;

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><title>Cookies Demo</title></head>");
        out.println("<body>");

        Cookie[] myCookies = request.getCookies();
        String cookieName = "uid";
        String cookieValue = null;
        for (int i = 0; i < myCookies.length; i++) {
            Cookie cookie = myCookies[i];
            if (cookieName.equals(cookie.getName())) {
                cookieValue = cookie.getValue();
                break;
            }
        }
        if (cookieValue==null){
            Cookie myCookie = new Cookie("uid", "92cd270e-5ef6-4903-a704-3af8dafabdb8");
            myCookie.setMaxAge(5);
            response.addCookie(myCookie);
            counter++;
        }

        out.println("<p align = center> Cookie value - " + cookieValue + "</p>");
        out.println("<p align = center> Total counter - " + counter + "</p>");
        out.println("</body></html>");
        out.close();

    }
}
