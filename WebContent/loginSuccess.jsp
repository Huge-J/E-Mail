<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<link rel="icon" href="https://pic.stackoverflow.wiki/uploadImages/240e/474/4541/d2f5/c805/7790/e5d1/b09c/2022/05/09/00/38/f2e3ae14-7604-4fbd-97e0-11bbac7eac37.png">
  	<title>Waiting...</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
       <script type="text/javascript">
           function tiao()
           {
               <s:if test="#session.userType==0">
                   window.location.href="<%=path %>/admin/index.jsp";
               </s:if>
               <s:if test="#session.userType==1">
                   window.location.href="<%=path %>/auser/index.jsp";
               </s:if>
           }
           
           setTimeout(tiao,1300)
       </script>
       <br> <br> <br> <br> <br> <br> <br> <br> <br>
       <center><img src="<%=path %>/images/loading32.gif">页面跳转中</center>
  </body>
</html>
