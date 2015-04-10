package form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Создать форму с вводом имени, телефона и электронной почты.
 * Создать сервлет, который будет получать эти данные, и распечатывать на странице.
 * Если пользователь не ввел имя, или одновременно пропущены телефон и электронная почта,
 * следует выводить сообщение об ошибке.
 */

@WebServlet(name = "form.FormServlet")
public class FormServlet extends HttpServlet {

    private static String headTemplate = "<html><head><title>Form Servlet Example</title></head>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        if (name.equals("") || (phone.equals("") && email.equals(""))) {
            out.println(headTemplate);
            out.println("<body><div align='center' style='margin-top: 300px;'><h1>Please, enter correct values</h1></div></body></html>");
        } else {
            out.println(headTemplate);
            out.println("<body><div align='center' style='margin-top: 300px;'>");
            out.println("Name: " + name + "<br>");
            out.println("Phone: " + phone + "<br>");
            out.println("E-mail: " + email + "<br>");
            out.println("</div></body></html>");
        }
    }
}
