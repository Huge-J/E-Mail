<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		<script type="text/javascript" src="<%=path %>/My97DatePicker/WdatePicker.js"></script>
        <script language="javascript">
           function fajianxiangDel_me(id)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="<%=path %>/fajianxiangDel_me.action?id="+id;
               }
           }
           
           function down1(fujianPath,fujianYuashiMing)
           {
               var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
		       url=encodeURI(url); 
               url=encodeURI(url); 
               window.open(url,"_self");
           }
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/images/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="6" background="<%=path %>/images/tbg.gif">&nbsp;发件箱&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="15%">发件人</td>
					<td width="15%">收件人</td>
					<td width="15%">邮件标题</td>
					<td width="15%">附件</td>
					<td width="15%">日期</td>
					<td width="15%">操作</td>
		        </tr>	
				<s:iterator value="#request.fajianxiangList" id="fajianxiang">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#fajianxiang.fromUserName"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#fajianxiang.toUserName"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a style="color: red" href="<%=path %>/fajianxiangDetail_me.action?id=<s:property value="#fajianxiang.id"/>"><s:property value="#fajianxiang.title"/></a>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						     <s:if test='#fajianxiang.fujian=="0"'>
							      无
							 </s:if>
							 <s:else>
							     <s:property value="#fajianxiang.fujianyuanshiming"/>&nbsp;&nbsp;&nbsp;
							     <a style="color: red;font-size: 10px;" href="#" onclick='down1("<s:property value="#fajianxiang.fujian"/>","<s:property value="#fajianxiang.fujianyuanshiming"/>")'>下载</a>
							 </s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#fajianxiang.shijian"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a href="#" onclick="fajianxiangDel_me(<s:property value="#fajianxiang.id"/>)" class="pn-loperator">删除</a>
					</td>
				</tr>
				</s:iterator>
			</table>
			
			
			<br/>
			<form action="<%=path %>/fajianxiang_me_search.action" name="formAdd" method="post">
				     <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
						<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
						    <td width="99%" bgcolor="#FFFFFF" align="left">
						        收件人：<input type="text" name="toUserName" size="20"/>
						       &nbsp;&nbsp;&nbsp;&nbsp;
						        邮件标题：<input type="text" name="title" size="20"/>
						       &nbsp;&nbsp;&nbsp;&nbsp;
						        开始时间：<input name="shijian1" class="Wdate" readonly="readonly" type="text" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"/>
						       &nbsp;&nbsp;&nbsp;&nbsp;
						        结束时间：<input name="shijian2" class="Wdate" readonly="readonly" type="text" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"/>
						       &nbsp;&nbsp;&nbsp;&nbsp; 
						       <input type="submit" value="提交" onclick="return check()"/>&nbsp; 
						    </td>
						</tr>
					 </table>
			</form>
	</body>
</html>
