<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <%--  bootstrap 美化界面  --%>
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 colum">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%-- 出现的问题：我们提交了修改的 sql请求，但是修改失败，初次考虑是事务问题，配置完事务，依旧失败 --%>
        <%-- 看一下 sql语句，能否执行成功，sql语句执行失败，修改未完成 --%>
        <%-- 前端传递隐藏域 --%>
        <input type="hidden" name="bookID" value="${Qbook.bookID}">
        <div class="form-group">
            <label>书籍名称：</label>
            <input type="text" name="bookName" class="form-control" value="${Qbook.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量：</label>
            <input type="text" name="bookCounts" class="form-control" value="${Qbook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>书籍描述：</label>
            <input type="text" name="detail" class="form-control" value="${Qbook.detail}" required>
        </div>
        <div class="form-group">
            <label>书籍名称：</label>
            <input type="submit" class="form-control" value="修改" >
        </div>
    </form>
</div>


</body>
</html>
