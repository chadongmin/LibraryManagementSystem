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
    <script src="https://code.jquery.com/jquery-1.11.3.js"></script>
</head>
<body>
<div>
    <h1 class="text-center">고객 정보 ${mode=="new" ? "등록" : "수정"}</h1>

</div>

<%--<div class="form-floating">--%>
<%--    <input type="email" class="form-control" id="floatingCustNo" placeholder="">--%>
<%--    <label for="floatingCustNo">고객번호</label>--%>
<%--</div>--%>


<%--<div class="form-floating">--%>
<%--    <input type="text" class="form-control" id="floatingCustName" placeholder="">--%>
<%--    <label for="floatingCustName">고객 이름</label>--%>
<%--</div>--%>
<%--<div class="form-floating">--%>
<%--    <input type="text" class="form-control" id="floatingPhone" placeholder="">--%>
<%--    <label for="floatingPhone">전화번호</label>--%>
<%--</div>--%>
<%--<div class="form-floating">--%>
<%--    <input type="email" class="form-control" id="floatingEmail" placeholder="name@example.com">--%>
<%--    <label for="floatingEmail">E-mail</label>--%>
<%--</div>--%>
<%--<div class="form-floating">--%>
<%--    <input type="text" class="form-control" id="floatingGrade" placeholder="">--%>
<%--    <label for="floatingGrade">고객 등급(P,S,G)</label>--%>
<%--</div>--%>
<%--<div>--%>

<script>
    let msg = "${msg}";
    let mode = "${mode}"

    if(msg=="REG_ERR") alert("고객정보 등록에 실패하였습니다. 다시 시도해 주세요.");
    if(msg=="MOD_ERR") alert("고개정보 수정에 실패하였습니다. 다시 시도해 주세요.");
</script>
<div class="container">
    <h2 class="writing-header">고객정보 ${mode=="new" ? "등록" : "수정"}</h2>
    <form id="form" class="frm" action="" method="post">
        <!-- ... input 태그들 ... -->
        <div class="input-container">
<%--            <input name="cust_no" type="${mode=="new"?"hidden":"text"}" value="${cust_no}" readonly="readonly">--%>
            <p>고객 이름 : <input name="cust_name" type="text" value="<c:out value='${customerDto.cust_name}' />"
            <c:choose>
                <c:when test='${mode == "new"}'>""</c:when>
                <c:when test='${mode == "mod"}'>""</c:when>
                <c:otherwise>"readonly='readonly'"</c:otherwise>
            </c:choose>></p>
            <p>전화번호 : <input name="phone" type="text" value="<c:out value='${customerDto.phone}'/>"
            <c:choose>
                <c:when test='${mode == "new"}'>""</c:when>
                <c:when test='${mode == "mod"}'></c:when>
                <c:otherwise>"readonly='readonly'"</c:otherwise>
            </c:choose>></p>
            <p>이메일 : <input name="cust_email" type="text" value="<c:out value='${customerDto.cust_email}'/>"
            <c:choose>
                <c:when test='${mode == "new"}'>""</c:when>
                <c:when test='${mode == "mod"}'>""</c:when>
                <c:otherwise>"readonly='readonly'"</c:otherwise>
            </c:choose>></p>
            <p>고객 등급(P,G,S) : <input name="grade" type="text" value="<c:out value='${customerDto.grade}'/>"
            <c:choose>
                <c:when test='${mode == "new"}'>""</c:when>
                <c:when test='${mode == "mod"}'>""</c:when>
                <c:otherwise>"readonly='readonly'"</c:otherwise>
            </c:choose>></p>
        </div>


        <button type="button" id="${mode=="new" ? "writeBtn" : "modifyBtn"}" class="btn btn-primary btn-lg" >${mode=="new" ? "등록" : "수정"}</button>

        <button type="button" id="listBtn" class="btn btn-secondary btn-lg">취소</button>
    </form>
</div>
<%--<div class="container">--%>
<%--&lt;%&ndash;    <h2 class="writing-header">게시판 ${mode=="new" ? "글쓰기" : "읽기"}</h2>&ndash;%&gt;--%>
<%--    <form id="form" class="frm" action="" method="post">--%>
<%--        <input type="hidden" name="bno" value="${customerDto.cust_no}">--%>

<%--        <p>고객 이름 : <input name="cust_name" type="text" value="<c:out value=' ${customerDto.cust_name}'/>" ${mode=="new" ? "" : "readonly='readonly'"}></p><br>--%>
<%--        <p>전화번호 : <input name="phone" type="text" value="<c:out value=' ${customerDto.phone}'/>" ${mode=="new" ? "" : "readonly='readonly'"}></p><br>--%>
<%--        <p>이메일 : <input name="cust_email" type="text" value="<c:out value=' ${customerDto.email}'/>" ${mode=="new" ? "" : "readonly='readonly'"}></p><br>--%>
<%--        <p>고객 등급(P,G S) : <input name="grade" type="text" value="<c:out value=' ${customerDto.grade}'/>" ${mode=="new" ? "" : "readonly='readonly'"}></p><br>--%>


<%--        <c:if test="${mode eq 'new'}">--%>
<%--            <button type="button" id="writeBtn" class="btn btn-primary btn-lg">등록</button>--%>
<%--        </c:if>--%>
<%--        <button type="button" id="listBtn" class="btn btn-secondary btn-lg">취소</button>--%>
<%--        &lt;%&ndash;        <button type="hidden" id="page" class=""></i> ${page}</button>&ndash;%&gt;--%>
<%--        &lt;%&ndash;        <button type="hidden" id="pageSize" class=""></i> ${page}</button>&ndash;%&gt;--%>
<%--    </form>--%>

<%--</div>--%>
<div class="p-2 g-col-6">
    <footer>
        <p class="text-center">나도 할 수 있는 Java & Spring 종합반 (차동민)</p>
    </footer>
</div>


<script>
    $(document).ready(function (){
        let formCheck = function() {
            let form = document.getElementById("form");
            if(form.cust_name.value=="") {
                alert("고객이름을 입력해 주세요.");
                form.cust_name.focus();
                return false;
            }

            if(form.phone.value=="") {
                alert("전화번호를 입력해 주세요.");
                form.phone.focus();
                return false;
            }

            if(form.cust_email.value=="") {
                alert("이메일을 입력해 주세요.");
                form.cust_email.focus();
                return false;
            }

            if(form.grade.value=="") {
                alert("고객등급을 입력해 주세요.");
                form.grade.focus();
                return false;
            }

            if (!(form.grade.value=="P"|| form.grade.value=="S"|| form.grade.value=="G")){
                alert("유효하지 않은 양식의 등급입니다. 다시 입력해주세요");
                form.grade.focus();
                return false;
            }
            return true;
        }



        $("#writeBtn").on("click", function(){
            //alert("writeRequest")
            let form = $("#form");
            form.attr("action", "<c:url value='/write'/>");
            form.attr("method", "post");
            if (formCheck())
                form.submit();
        });
        $("#listBtn").on("click", function(){

            location.href="<c:url value='/'/>";
        });
        $("#modifyBtn").on("click", function(){
            //alert("modRequest")
            let form = $("#form");
            // let isReadonly = $("input[name=title]").attr('readonly');
            //
            // // 1. 읽기 상태이면, 수정 상태로 변경
            // if(isReadonly=='readonly') {
            //     $(".writing-header").html("게시판 수정");
            //     $("input[name=title]").attr('readonly', false);
            //     $("textarea").attr('readonly', false);
            //     $("#modifyBtn").html("<i class='fa fa-pencil'></i> 등록");
            //     return;
            // }
            // 2. 수정 상태이면, 수정된 내용을 서버로 전송
            form.attr("action", "<c:url value='/modify?cust_no=${cust_no}'/>");
            <%--form.attr(${page}${pageSize});--%>
            form.attr("method", "post");
            form.submit();
        });
    });
</script>
<%--src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"--%>
</body>
</html>
