<%@ page import="com.keshe.pojo.Student" %> <%@ page
import="com.keshe.service.LoginServiceImpl" %> <%@ page
import="com.keshe.service.LoginService" %> <%@ page
import="com.keshe.dao.LoginDaoImpl" %> <%@ page import="com.keshe.dao.LoginDao"
%> <%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page
import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%-- Created by IntelliJ IDEA. User: Chaos Date: 2022/6/9 Time: 14:39 To change
this template use File | Settings | File Templates. --%> <%@ page
contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); Integer Snum=
    Integer.valueOf(request.getParameter("uid")); Integer Pwd=
    Integer.valueOf(request.getParameter("pwd")); WebApplicationContext wac =
    WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
    LoginService ls =
    (LoginService)wac.getBean(LoginService.class);//注入Bean的名称 Student
    student = new Student(); student.setSnum(Snum); student.setPwd(Pwd); Student
    stu=ls.login(student); if(stu==null){ System.out.println(1L);
    response.sendRedirect("login.jsp"); }else{ System.out.println(2L); //
    Integer flag=stu.getSnum()>>2; } %>
  </body>
</html>
