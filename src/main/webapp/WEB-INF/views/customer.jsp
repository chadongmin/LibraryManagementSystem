<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cha
  Date: 2023/08/25
  Time: 12:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<div>
    <h1 class="text-center">고객정보수정</h1>
</div>
<div class="table_wrap">

    <table class="table table-bordered">
        <tr>
            <th>고객번호</th>
            <th>고객이름</th>
            <th>전화번호</th>
            <th>가입일자</th>
            <th>이메일</th>
            <th>고객등급</th>
        </tr>

        <tr>
            <td>${cust_no}</td>
            <td>${cust_name}</td>
            <td>${phone}</td>
            <td>${join_date}</td>
            <td>${cust_email}</td>
            <td>${grade}</td>
        </tr>

    </table>
</div>


</div>
<div class="p-2 g-col-6">
    <footer>
        <p class="text-center">나도 할 수 있는 Java & Spring 종합반 (차동민)</p>
    </footer>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
