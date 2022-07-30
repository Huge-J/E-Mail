<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="icon" href="https://pic.stackoverflow.wiki/uploadImages/240e/474/4541/d2f5/c805/7790/e5d1/b09c/2022/05/09/00/40/cb282c82-6308-4841-836d-11d91da134c2.png">
    <title>Exiting...</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>

<%	
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setDateHeader("Expires",0);
  response.setHeader("Pragma","no-cache");
  session.removeAttribute("xingming");
  session.removeAttribute("loginflag");
  request.removeAttribute("xingming");
  request.removeAttribute("loginflag");
  session.invalidate();
%>  

 <script>
  window.opener=null;
  window.close();
</script>  


  </body>
  
</html>
