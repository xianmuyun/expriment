<%--
  Created by IntelliJ IDEA.
  User: zheng
  Date: 2023/3/28
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <style>
        #footer {
            color:red;
            clear:both;
            text-align:left;
            padding:5px;
        }
    </style>
    <style>
        body {
            background-size:cover;
            background-image: url("/img/123.jpg");
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small><font face="黑体" font size =10px font color="black">用户登录</font></small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <font face="黑体" font size =10px font color="black">邮箱：</font><input type="text" name="email"><br><br><br>
        <font face="黑体" font size =10px font color="black">密码：</font><input type="password" name="password"></font><br><br><br>
        <input type="submit" value="登录">
            <tr>
                <td colspan="2" style="text-align: center;"><a
                        href="http://localhost:8080/experiment_war/goreg"><font face="黑体" font size =10px font color="black">还没有账号？点此注册</font></a></td>
            </tr>
        </table>
    </form>
    <div id="footer">
        ${wrongIdOrPassword}
    </div>
</div>
</body>
</html>
