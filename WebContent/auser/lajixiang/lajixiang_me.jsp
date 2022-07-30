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
		
        <script language="javascript">
           function lajixiangDel_me(id)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="<%=path %>/lajixiangDel_me.action?id="+id;
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
					<td height="14" colspan="6" background="<%=path %>/images/tbg.gif">&nbsp;垃圾箱&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="15%">发件人</td>
					<td width="15%">收件人</td>
					<td width="15%">邮件标题</td>
					<td width="15%">附件</td>
					<td width="15%">日期</td>
					<td width="15%">操作</td>
		        </tr>	
				<s:iterator value="#request.lajixiangList" id="lajixiang">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#lajixiang.fromUserName"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#lajixiang.toUserName"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#lajixiang.title"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						     <s:if test='#lajixiang.fujian=="0"'>
							      无
							 </s:if>
							 <s:else>
							     <s:property value="#lajixiang.fujianyuanshiming"/>&nbsp;&nbsp;&nbsp;
							     <a style="color: red;font-size: 10px;" href="#" onclick='down1("<s:property value="#lajixiang.fujian"/>","<s:property value="#lajixiang.fujianyuanshiming"/>")'>下载</a>
							 </s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#lajixiang.shijian"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a href="#" onclick="lajixiangDel_me(<s:property value="#lajixiang.id"/>)" class="pn-loperator">删除</a>
					</td>
				</tr>
				</s:iterator>
			</table>
	</body>
</html>
