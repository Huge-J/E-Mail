<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<link rel="icon" href="https://pic.stackoverflow.wiki/uploadImages/240e/474/4541/d2f5/c805/7790/e5d1/b09c/2022/05/09/00/32/5ecf939d-d5cb-45cd-8753-5ca23f0f32f4.png">
  	<title>XY E-Mail</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <style>
	body
	{
	  scrollbar-base-color:#C0D586;
	  scrollbar-arrow-color:#FFFFFF;
	  scrollbar-shadow-color:DEEFC6;
	}
	</style>
  </head>
  <frameset rows="60,*" cols="*" frameborder="no" border="0" framespacing="0">
	  <frame src="<%=path %>/auser/top.jsp" name="topFrame" scrolling="no">
	  <frameset cols="180,*" name="btFrame" frameborder="NO" border="0" framespacing="0">
	    <frame src="<%=path %>/auser/menu.jsp" noresize name="menu" scrolling="yes">
	    <frame src="<%=path %>/auser/index/sysPro.jsp" noresize name="main" scrolling="yes">
	  </frameset>
  </frameset>
  <noframes>
	  <body>您的浏览器不支持框架！</body>
  </noframes>
</html>
