<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'menu.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="<%=path %>/css/base.css" type="text/css" />
	<link rel="stylesheet" href="<%=path %>/css/menu.css" type="text/css" />
	<style type="text/css">
	    div {
			padding:0px;
			margin:0px;
		}
		.bitem{
			background-color: white;
    		border-radius: 10px;
			background-repeat: repeat-x;
			border-bottom: 1px solid #dbd4d4;
		}
		body {
		 scrollbar-base-color:#bae87c;
		 scrollbar-arrow-color:#FFFFFF;
		 scrollbar-shadow-color:#c1ea8b;
		 padding:0px;
		 margin:auto;
		 text-align:center;
		}
		
		dl.bitem {
			width:148px;
			margin:0px 0px 5px 4px;
			border-radius:12px;
			box-shadow: 3px 4px 11px 1px rgb(0 0 0 / 20%);
		}
		
		dl.bitem dt {
		  background:linear-gradient(to right,#6bbae5,#b8d0fb);
		  border-radius: 10px;
		  border-bottom: 1px solid #dbd4d4;
		  height:26px;
		  line-height:26px;
		  text-align:center;
		  cursor:pointer;
		}
		
		dl.bitem dd {
		  padding:3px 3px 3px 3px;
		}
		
		.fllct
		{
			float:left;
			
			width:90px;
		}
		
		.flrct
		{
			padding-top:3px;
			float:left;
		}
		
		div.items
		{
			line-height:22px;
			background:url(<%=path %>/images/arr4.gif) no-repeat 10px 9px;
		}
		
		span.items
		{
			padding:10px 0px 10px 22px;
			background:url(<%=path %>/images/arr4.gif) no-repeat 10px 12px;
		}
		
		ul {
		  padding-top:3px;
		}
		
		li {
		  height:30px;
		}
		
		.sitemu li {
			padding:0px 0px 0px 22px;
			line-height:24px;
			background:url(<%=path %>/images/arr4.gif) no-repeat 10px 9px;
		}
	</style>
	<script language='javascript'>var curopenItem = '1';</script>
	<script language="javascript" type="text/javascript" src="<%=path %>/js/menu.js"></script>
	<base target="main" />
  </head>
  
  <body target="main">
	<table width='99%' height="100%" border='0' cellspacing='0' cellpadding='0'>
	  <tr>
	    <td style='padding-left:3px;padding-top:8px' valign="top">
		  <!-- 1 -->
	      <dl class='bitem'>
	        <dt onClick='showHide("items1_1")'><b>基本操作</b></dt>
	        <dd style='display:block' class='sitem' id='items1_1'>
	          <ul class='sitemu'>
	            <li><a href='<%=path %>/auser/index/sysPro.jsp' target='main'>系统属性</a> </li>
	            <li><a href='<%=path %>/auser/userinfo/userPw.jsp' target='main'>密码修改</a> </li>
	          </ul>
	        </dd>
	      </dl>
	      <!-- 1 -->
	      <!-- 1 -->
	      <dl class='bitem'>
	        <dt onClick='showHide("items1_1")'><b>邮件操作</b></dt>
	        <dd style='display:block' class='sitem' id='items1_1'>
	          <ul class='sitemu'>
	            <li><a href='<%=path %>/auser/email/emailAdd.jsp' target='main'>新邮件</a> </li>
	            <li><a href='<%=path %>/fajianxiang_me.action' target='main'>发件箱</a> </li>
	            <li><a href='<%=path %>/shoujianxiang_me.action' target='main'>收件箱</a> </li>
	            <li><a href='<%=path %>/caogaoxiang_me.action' target='main'>草稿箱</a> </li>
	            <li><a href='<%=path %>/lajixiang_me.action' target='main'>垃圾箱</a> </li>
	          </ul>
	        </dd>
	      </dl>
	      <!-- 1 -->
	       <!-- 1 -->
	      <dl class='bitem'>
	        <dt onClick='showHide("items1_1")'><b>我的通讯录</b></dt>
	        <dd style='display:block' class='sitem' id='items1_1'>
	          <ul class='sitemu'>
	            <li><a href='<%=path %>/tongxunluMy.action?userId=${sessionScope.user.userId }' target='main'>我的通讯录</a> </li>
	            <li><a href='<%=path %>/auser/tongxunlu/tongxunluAdd.jsp' target='main'>添加通讯录</a> </li>
	            <li><a href='<%=path %>/auser/tongxunlu/emailAddQun.jsp?userId=${sessionScope.user.userId }' target='main'>邮件群发功能</a> </li>
	          </ul>
	        </dd>
	      </dl>
	      <!-- 1 -->
		</td>
	  </tr>
	</table>
  </body>
</html>
