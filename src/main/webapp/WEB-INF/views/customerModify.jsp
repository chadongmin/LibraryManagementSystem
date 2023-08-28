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
<div class="p-2 g-col-6">
    <ul class="nav justify-content-center">
        <!-- <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Active</a>
        </li> -->
        <li class="nav-item">
            <a class="nav-link" href="<c:url value ='/write'/>">고객 등록</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<c:url value ='/list'></c:url>">고객 목록 조회/수정</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<c:url value ='/rent-list'></c:url>">고객 대여 리스트</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/rent-price-list">고객 대여 금액 조회</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/library">홈으로</a>
        </li>
        <!-- <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li> -->
    </ul>
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
            <td>${customerDto.cust_no}</td>
            <td>${customerDto.cust_name}</td>
            <td>${customerDto.phone}</td>
            <td>${customerDto.join_date}</td>
            <td>${customerDto.cust_email}</td>
            <td>${customerDto.grade}</td>
        </tr>

    </table>

    <button type="button" id="modifyBtn" class="btn btn-primary btn-lg">수정</button>

    <button type="button" id="listBtn" class="btn btn-secondary btn-lg">취소</button>
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
