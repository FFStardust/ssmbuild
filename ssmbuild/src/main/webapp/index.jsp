<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2022/6/28
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style>
        a{
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
        h3{
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: aqua;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<h3>
    <a href="${pageContext.request.contextPath}/book/allBook">查询书籍</a>
</h3>

</body>
</html>
