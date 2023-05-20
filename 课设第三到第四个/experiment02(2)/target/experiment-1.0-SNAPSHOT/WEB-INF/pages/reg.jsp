<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/4/18 0018
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户注册</title>
    <style type="text/css">
        div {
            width: 300px;
            height: 200px;
            margin-left: auto;
            margin-right: auto;
        }
    </style>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/reg"   method="post">
        <table border="1">
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="email" ></td>
            </tr>
            <tr>
                <td>密&emsp;码:</td>
                <td><input type="password" name="password" ></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center;"><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>