<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>도서 정보</title>
</head>
<body>
    <h1>${ param.bookCode }번 도서</h1>
    <h3>도서명 : ${ selectedBook.bookName }</h3>
    <h3>출판사 : ${ selectedBook.publisher }</h3>
    <h3>출간일 : ${ selectedBook.releaseDate }</h3>
    <h3>보유권수 : ${ selectedBook.amount }</h3>
    <h3>분야 : ${ selectedBook.categoryCode }</h3>
    <h3>대출가능여부 : ${ selectedBook.loanableYN }</h3>
</body>
</html>
