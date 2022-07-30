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
		<script type="text/javascript" src="<%=path %>/js/popup.js"></script>
        <script language="javascript">
           
            
            function StringBuffer()
            { 
			   this._strs = new Array; 
			} 
			StringBuffer.prototype.append = function (str) 
			{ 
			   this._strs.push(str); //添加
			} 
			StringBuffer.prototype.pop = function (str) 
			{ 
			   this._strs.pop(str); //删除最后一个
			} 
			StringBuffer.prototype.toString = function()
		    { 
			   return this._strs.join(","); 
			}
            
            function queding()
            {
                 var sb = new StringBuffer(); 
                 
                 var object=document.getElementsByName("emaiadd");//返回的obeject是数组
				 for(i=0;i<object.length;i++)
				 {
				      if(object[i].checked==true)
					  {
					      sb.append(object[i].value); 
					  }
				 }
				 
				 window.returnValue = sb.toString();
		         window.close();
            }
        </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/images/allbg.gif'>
			<form action="">
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="11" background="<%=path %>/images/tbg.gif">&nbsp;&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
				    <td width="10%">&nbsp;</td>
					<td width="10%">姓名</td>
					<td width="10%">性别</td>
					<td width="10%">年龄</td>
					<td width="10%">联系方式</td>
					<td width="10%">住址</td>
					<td width="10%">公司</td>
					<td width="10%">email</td>
		        </tr>	
				<s:iterator value="#request.tongxunluList" id="tongxunlu">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<input type="checkbox" name="emaiadd" value="<s:property value="#tongxunlu.emaiadd"/>"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#tongxunlu.name"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#tongxunlu.sex"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    <s:property value="#tongxunlu.age"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#tongxunlu.tel"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#tongxunlu.address"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#tongxunlu.gongsi"/>
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#tongxunlu.emaiadd"/>
					</td>
				</tr>
				</s:iterator>
			</table>
			<br/>
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 5px;">
				  <tr>
				    <td>
				      <input type="button" value="确定" style="width: 80px;" onclick="queding()" />
				    </td>
				  </tr>
			</table>
			</form>
	</body>
</html>
