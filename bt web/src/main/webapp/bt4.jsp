<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Đăng Ký</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h3 class="text-center mb-4">Đăng Ký</h3>
    <form>
        <div class="mb-3">
            <label>Email</label>
            <input type="email" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Password</label>
            <input type="password" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Address</label>
            <input type="text" class="form-control" placeholder="123" required>
        </div>

        <div class="mb-3">
            <label>Address 2</label>
            <input type="text" class="form-control" placeholder="Căn hộ, tầng...">
        </div>

        <div class="mb-3">
            <label>City</label>
            <input type="text" class="form-control">
        </div>

        <div class="mb-3">
            <label>State</label>
            <input type="text" class="form-control">
        </div>

        <div class="mb-3">
            <label>Zip</label>
            <input type="text" class="form-control">
        </div>

        <div class="form-check mb-3">
            <input class="form-check-input" type="checkbox" id="checkme">
            <label class="form-check-label" for="checkme">
                Check me out
            </label>
        </div>

        <button type="submit" class="btn btn-primary">Sign in</button>
    </form>
</div>

</body>
</html>
