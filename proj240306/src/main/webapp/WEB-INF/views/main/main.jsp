<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>

    <h1>도서 조회</h1>
    <form action="${pageContext.servletContext.contextPath}/book/select">
        <label>조회할 도서 번호 : </label>
        <input type="text" name="bookCode" id="bookCode">
        <button>조회하기</button>
    </form>

    <br><hr><br>

    <h1>전제 조회</h1>
    <button onclick="location.href='${pageContext.servletContext.contextPath}/book/list'">
        전체 도서 조회
    </button>

    <br><hr><br>

    <h1>신규 도서 추가</h1>
    <form action="${pageContext.servletContext.contextPath}/book/insert" method="post">
        도서명 : <input type="text" name="bookName"> <br>
        출판사 : <input type="text" name="publisher"> <br>
        출간일 : <input type="text" name="releaseDate"> <br>
        보유권수 : <input type="number" name="amount"> <br>
        분야 :
        <select name="categoryCode">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select>
        <br>
       대출가능여부 :
        <select name="loanableYN">
            <option value="Y">Y</option>
            <option value="N">N</option>
        </select>
        <button type="submit">등록하기</button>
    </form>

    <br><hr><br>

    <h1>도서 정보 수정</h1>
    <form action="${pageContext.servletContext.contextPath}/book/update" method="post">
        도서 번호 : <input type="text" name="bookCode"/> <br><br>
        변경할 도서 정보 <br>
        도서명 : <input type="text" name="bookName"> <br>
        출판사 : <input type="text" name="publisher"> <br>
        출간일 : <input type="text" name="releaseDate"> <br>
        보유권수 : <input type="number" name="amount"> <br>
        분야 :
        <select name="categoryCode">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select>
        <br>
        대출가능여부 :
        <select name="loanableYN">
            <option value="Y">Y</option>
            <option value="N">N</option>
        </select>
        <button type="submit">수정하기</button>
    </form>

    <br><hr><br>

    <h1>도서 정보 삭제</h1>
    <form action="${pageContext.servletContext.contextPath}/book/delete" method="post">
        도서 번호 : <input type="text" name="bookCode"/>
        <button type="submit">도서 정보 삭제</button>
    </form>

</body>
</html>
