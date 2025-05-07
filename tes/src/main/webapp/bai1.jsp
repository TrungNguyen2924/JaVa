<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Giải phương trình bậc 2</title>
</head>
<body>
    <h2>Giải phương trình bậc 2: ax² + bx + c = 0</h2>
    <form method="post">
        a: <input type="text" name="a" value="<%= request.getParameter("a") != null ? request.getParameter("a") : "" %>" required><br><br>
        b: <input type="text" name="b" value="<%= request.getParameter("b") != null ? request.getParameter("b") : "" %>" required><br><br>
        c: <input type="text" name="c" value="<%= request.getParameter("c") != null ? request.getParameter("c") : "" %>" required><br><br>
        <input type="submit" value="Giải phương trình">
    </form>

    <%
        String sa = request.getParameter("a");
        String sb = request.getParameter("b");
        String sc = request.getParameter("c");

        if (sa != null && sb != null && sc != null) {
            try {
                double a = Double.parseDouble(sa);
                double b = Double.parseDouble(sb);
                double c = Double.parseDouble(sc);

                DecimalFormat df = new DecimalFormat("#.##");

                out.println("<h3>Kết quả:</h3>");
                if (a == 0) {
                    if (b == 0) {
                        out.println("<p>Phương trình vô nghiệm.</p>");
                    } else {
                        double x = -c / b;
                        out.println("<p>Phương trình có nghiệm: x = " + df.format(x) + "</p>");
                    }
                } else {
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        out.println("<p>Phương trình vô nghiệm thực.</p>");
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        out.println("<p>Phương trình có nghiệm kép: x = " + df.format(x) + "</p>");
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        out.println("<p>Phương trình có hai nghiệm phân biệt:</p>");
                        out.println("<p>x₁ = " + df.format(x1) + "</p>");
                        out.println("<p>x₂ = " + df.format(x2) + "</p>");
                    }
                }
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Vui lòng nhập số hợp lệ!</p>");
            }
        }
    %>

</body>
</html>
