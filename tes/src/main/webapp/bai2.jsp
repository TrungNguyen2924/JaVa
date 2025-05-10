<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.text.DecimalFormat" %> z
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kiểm Tra Tam Giác</title>
</head>
<body>
    <h2>Kiểm tra tam giác</h2>
    <form method="post">
        a: <input type="text" name="a" required><br><br>
        b: <input type="text" name="b" required><br><br>
        c: <input type="text" name="c" required><br><br>
        <input type="submit" value="Kiểm tra">
    </form>

    <%
        try {
            double a = Double.parseDouble(request.getParameter("a"));
            double b = Double.parseDouble(request.getParameter("b"));
            double c = Double.parseDouble(request.getParameter("c"));

            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                out.println("<p style='color:green;'>Đây là một tam giác hợp lệ.</p>");
            } else {
                out.println("<p style='color:red;'>Không phải là tam giác.</p>");
            }
        } catch (Exception e) {
            // Không xử lý nếu form chưa submit
        }
    %>
</body>
</html>
