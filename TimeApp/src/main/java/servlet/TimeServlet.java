package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class TimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String format = request.getParameter("format");
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String time = sdf.format(new Date());
        request.setAttribute("time", time);
        request.setAttribute("format", format);
        RequestDispatcher rd = request.getRequestDispatcher("time.jsp");
        rd.forward(request, response);
    }
}
