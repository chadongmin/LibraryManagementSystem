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
<script>
    let msg = "${msg}";
    if (msg == "REG_OK") alert("성공적으로 등록되었습니다.")
    if (msg == "MOD_OK") alert("고객정보가 수정되었습니다.")
</script>
<div>
    <h1 class="text-center">도서관 고객 & 대여 관리 프로그램</h1>
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
            <a class="nav-link" href="<c:url value ='/rent-price-list'></c:url>">고객 대여 금액 조회</a>
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
            <th>대여번호</th>
            <th>도서코드</th>
            <th>대여금액</th>
            <th>대여일자</th>
        </tr>
        <c:forEach var="rentDto" items="${list}">
            <tr>
                <td>${rentDto.cust_no}</td>
                <td>${rentDto.rent_no}</td>
                <td>${rentDto.book_code}</td>
                <td>${rentDto.rent_price}</td>
                <td>${rentDto.rent_date}</td>
            </tr>
        </c:forEach>
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
