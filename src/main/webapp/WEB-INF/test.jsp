<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>JSP Page</h1>
    <p>Hello World from JSP</p>

    <h1>This is a list of animals</h1>
    <ul>
    <c:forEach items="${animals}" var="animal">
        <li>${animal} </li>
    </c:forEach>
    </ul>
</body>
</html>
