<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>도서 목록 전체 조회</title>
</head>
<body>
    <h1>전체 도서 목록</h1>
    <table>
        <tr>
            <th>도서번호</th>
            <th>도서명</th>
            <th>출판사</th>
            <th>출간일</th>
            <th>보유권수</th>
            <th>분야</th>
            <th>대출가능여부</th>
        </tr>
        <c:forEach items="${ bookList }" var="book">
            <tr>
                <td>${ book.bookCode }</td>
                <td>${ book.bookName }</td>
                <td>${ book.publisher }</td>
                <td>${ book.releaseDate }</td>
                <td>${ book.amount }</td>
                <td>${ book.categoryCode }</td>
                <td>${ book.loanableYN }</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
