<%--
  Created by IntelliJ IDEA.
  User: Chaos
  Date: 2022/6/9
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href = "<%=basePath%>">
    <title>用户登录</title>
    <style>
        #inner{
            position: absolute;
            top:50%;
            left:50%;
            transform: translate(-50%,-50%);
            width: 550px;
            height: 400px;
            border: red solid 3px;
        }
        #login_{
            width: 300px;
            height: 200px;
            margin-left: 122px;
            margin-top: 97px;
            border: blue solid 3px;
        }
        input{
            width: 220px;
            height: 30px;
            margin-top: 20px;
            border: blue solid 3px;
            border-radius: 4px;
        }
        button{
            width: 100px;
            font-size: 18px;
            margin-left: 31px;
        }
        a{
            width: 100px;
            font-size: 18px;
            margin-left: 31px;
        }
    </style>
</head>
<body>
<form action="login-do.jsp" method="post">
    <div id="inner">
        <div id="login_">
            账户:&nbsp;&nbsp;<input type="text" name="uid" id="uid">
            <br><br>
            密码:&nbsp;&nbsp;<input type="password" name="pwd" id="pwd">
            <br><br>
            <a href="sign.jsp" target="_blank">注册</a> &nbsp;&nbsp;&nbsp;&nbsp;
            <button id="btn01" type="submit">登录</button>
        </div>
    </div>
</form>
</body>
</html>
