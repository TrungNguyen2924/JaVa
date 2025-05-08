<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách sinh viên</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    
    .custom-table {
        color: #1a1a1a; /* Màu chữ */
        background-color: #f2f2f2; /* Màu nền bảng */
        border: 2px solid #007bff; /* Màu viền ngoài bảng */
        width: 60%;
    }

    .custom-table th,
    .custom-table td {
        border: 1px solid #007bff; 
        padding: 10px;
    }

    .custom-table th {
        background-color: #007bff;
        color: white;
    }
</style>

</head>
<body>

<div class="container mt-3">
    <h2 class="text-center mb-4">Danh sách sinh viên</h2>
    
    <table class="table custom-table text-center">
        <thead>
            <tr>
                <th>STT</th>
                <th>Mã SV</th>
                <th>Họ và tên</th>
                <th>Quê quán</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>SV001</td>
                <td>Nguyễn Văn A</td>
                <td>Hà Nội</td>
            </tr>
            <tr>
                <td>2</td>
                <td>SV002</td>
                <td>Nguyễn B</td>
                <td>Đà Nẵng</td>
            </tr>
            <tr>
                <td>3</td>
                <td>SV003</td>
                <td>Nguyễn C</td>
                <td>Hồ Chí Minh</td>
            </tr>
        </tbody>
    </table>
</div>

</body>
</html>
