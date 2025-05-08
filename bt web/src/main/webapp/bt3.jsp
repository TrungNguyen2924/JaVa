<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Đăng Nhập</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background-color: #f8f9fa;
    }
    .login-form {
        max-width: 400px;
        margin: 80px auto;
        padding: 30px;
        border: 1px solid #dee2e6;
        border-radius: 10px;
        background-color: white;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
</style>
</head>
<body>

<div class="container">
    <div class="login-form">
        <h3 class="text-center mb-4">Đăng Nhập</h3>
        <form action="LoginServlet" method="post">
            <div class="mb-3">
                <label for="username" class="form-label">Tên đăng nhập</label>
                <input type="text" class="form-control" id="username" name="username" required>
            </div>

            <div class="mb-3">
                <label for="password" class="form-label">Mật khẩu</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Đăng nhập</button>
            </div>
        </form>
    </div>
</div>

</body>
</html>
