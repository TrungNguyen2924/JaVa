<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kiểm Tra Tam Giác</title>
</head>
<body>
    <h2>Kiểm tra 3 cạnh có phải tam giác không</h2>
    <form method="post">
        Cạnh a: <input type="number" name="a" step="any" required><br><br>
        Cạnh b: <input type="number" name="b" step="any" required><br><br>
        Cạnh c: <input type="number" name="c" step="any" required><br><br>
        <input type="submit" value="Kiểm tra">
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

                if (a > 0 && b > 0 && c > 0 &&
                    a + b > c && a + c > b && b + c > a) {
                    out.println("<p style='color:green;'>Ba số này là độ dài của một tam giác.</p>");
                } else {
                    out.println("<p style='color:red;'>Ba số này KHÔNG phải là độ dài của một tam giác.</p>");
                }
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Vui lòng nhập số hợp lệ.</p>");
            }
        }
    %>
</body>
</html>
