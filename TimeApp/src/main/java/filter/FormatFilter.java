package filter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FormatFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String format = request.getParameter("format");
        if (format != null) {
            try {
                new SimpleDateFormat(format); // Kiểm tra định dạng
                chain.doFilter(request, response); // Hợp lệ, tiếp tục
            } catch (IllegalArgumentException e) {
                request.setAttribute("error", "Định dạng không hợp lệ!");
                request.getRequestDispatcher("time.jsp").forward(request, response);
            }
        } else {
            chain.doFilter(request, response);
        }
    }
}
