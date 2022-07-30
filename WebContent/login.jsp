<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
		<link rel="icon" href="https://pic.stackoverflow.wiki/uploadImages/240e/474/4541/d2f5/c805/7790/e5d1/b09c/2022/05/09/00/32/5ecf939d-d5cb-45cd-8753-5ca23f0f32f4.png">
	    <title>Welcome to XY</title>
	    <style type="text/css">
		body {
			margin-left: 0px;
			margin-top: 0px;
			margin-right: 0px;
			margin-bottom: 0px;
			background-color: #edf3f4;
		}
		.login_top_bg {
			background:linear-gradient(to right,#6bbae5,#ad70ef);
    		border-radius: 10px;
			background-repeat: repeat-x;
			border-bottom: 1px solid #dbd4d4;
		}
		.body {
			background-color: #EEF2FB;
			left: 0px;
			top: 0px;
			right: 0px;
			bottom: 0px;
		}
		
		.login-buttom-bg {
			background-image: url(<%=path %>/images/login-buttom-bg.gif);
			background-repeat: repeat-x;
		}
		.login-buttom-txt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 10px;
			color: #ABCAD3;
			text-decoration: none;
			line-height: 20px;
		}
		.login_txt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			color: #333333;
		}
		.Submit {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			color: #629DAE;
			text-decoration: none;
			background-image: url(<%=path %>/images/Submit_bg.gif);
			background-repeat: repeat-x;
		}
		.login_bg {
			background-repeat: repeat-x;
		}
		.login_bg2 {
			background-repeat: no-repeat;
			background-position: right;
		}
		.login_panel {
			background-color: #fefefe;
			border-radius: 25px;
			box-shadow: 4px 4px 8px rgba(0,0,0,0.4);
		}
		.input_name{
			background-color: black;
			border: 2px solid #6bbae5;
			border-radius: 25px;
		}
		.button{
			width: 90px;
		    height: 30px;
		    background: none;
		    border: 2px solid #6bbae5;
		    border-radius: 50px;
		    cursor: pointer;
		    display: flex;
		    align-items: center;
		    justify-content: center;
		    transition: .4s;
		    line-height:15px;
		    font-size:15px
		}
		.button:hover {
		  width: 100px;
		  box-shadow: 0px 10px 10px rgba(0,0,0,0.4);
		}
		.login_txt_bt{
			color:#6bbae5;
		}
		.top_hui_text,.login_txt{
			color:#6bbae5;
			font-size:15px;
			font-weight: bold;
		}
		.slogn{
			color:yellow;
			font-size: 50px;
			background:linear-gradient(to right,#6bbae5,#ad70ef);
			background-clip: text;
    		-webkit-background-clip: text;
    		color: transparent;
		}
		.admin_txt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			color: #FFFFFF;
			text-decoration: none;
			height: 38px;
			width: 100%;
			position: 固定;
			line-height: 38px;
		}
		.login_txt_bt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 24px;
			line-height: 50px;
			font-weight: bold;
			text-ag
		}
		.admin_topbg {
			background-image: url(<%=path %>/images/top-right.gif);
			background-repeat: repeat-x;
		}
		.txt_bt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			font-weight: bold;
			color: #000000;
			text-decoration: none;
		}
		.left_topbg {
			background-image: url(<%=path %>/images/content-bg.gif);
			background-repeat: repeat-x;
		}
		.admin_toptxt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			color: #4A8091;
			height: 18px;
			width: 100%;
			overflow: hidden;
			position: 固定;
		}
		
		.left_bt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 14px;
			font-weight: bold;
			color: #395a7b;
		}
		.left_bt2 {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			font-weight: bold;
			color: #333333;
		}
		.titlebt {
			font-size: 12px;
			line-height: 26px;
			font-weight: bold;
			color: #000000;
			background-image: url(<%=path %>/images/top_bt.jpg);
			background-repeat: no-repeat;
			display: block;
			text-indent: 15px;
			padding-top: 5px;
		}
		
		.left_txt {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			color: #666666;
		}
		.left_txt2 {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			color: #000000;
		}
		.nowtable {
			background-color: #e1e5ee;
			border-top-width: 1px;
			border-right-width: 1px;
			border-bottom-width: 1px;
			border-left-width: 1px;
			border-top-style: solid;
			border-top-color: #bfc4ca;
			border-right-color: #bfc4ca;
			border-bottom-color: #bfc4ca;
			border-left-color: #bfc4ca;
		}
		.left_txt3 {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			color: #003366;
			text-decoration: none;
		}

		.left_ts {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			font-weight: bold;
			color: #FF6600;
		}
		.line_table {
			border: 1px solid #CCCCCC;
		}
		.sec1 {
			CURSOR: hand;
			COLOR: #000000;
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			border: 1px solid #B5D0D9;
			background-image: url(<%=path %>/images/right_smbg.jpg);
			background-repeat: repeat-x;
		}
		.sec2 {
			FONT-WEIGHT: bold;
			CURSOR: hand;
			COLOR: #000000;
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 25px;
			background-color: #e2e7ed;
			border: 1px solid #e2e7ed;
		}
		.main_tab {
			COLOR: #000000;
			BACKGROUND-COLOR: #e2e7ed;
			border: 1px solid #e2e7ed;
		}
		.MM a {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 26px;
			color: #666666;
			background-image: url(<%=path %>/images/menu_bg.gif);
			background-repeat: no-repeat;
			list-style-type: none;
			list-style-image: none;
		}
		a:link {
			font-size: 12px;
			line-height: 25px;
			color: #333333;
			text-decoration: none;
		}
		a:hover {
			font-size: 12px;
			line-height: 25px;
			color: #666666;
			text-decoration: none;
		}
		a:visited {
			font-size: 12px;
			line-height: 25px;
			color: #333333;
			text-decoration: none;
		}
	
	
		.MM a:link {
			font-family: Arial, Helvetica, sans-serif;
			font-size: 12px;
			line-height: 26px;
			color: #666666;
			background-image: url(<%=path %>/images/menu_bg.gif);
			background-repeat: no-repeat;
			list-style-type: none;
			list-style-image: none;
		}
		</style>
		<script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
        <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
        
		<script language="javascript">
		function check1()
		{                                                                                         
		     if(document.ThisForm.userName.value=="")
			 {
			 	alert("请输入用户名");
				document.ThisForm.userName.focus();
				return false;
			 }
			 if(document.ThisForm.userPw.value=="")
			 {
			 	alert("请输入密码");
				document.ThisForm.userPw.focus();
				return false;
			 }
			 if(document.ThisForm.userType.value=="-1")
			 {
			 	alert("请选择登陆身份");
				document.ThisForm.userType.focus();
				return false;
			 }
			 document.getElementById("indicator").style.display="block";
			 loginService.login(document.ThisForm.userName.value,document.ThisForm.userPw.value,document.ThisForm.userType.value,callback);
		}
		
		function callback(data)
		{
		    document.getElementById("indicator").style.display="none";
		    if(data=="no")
		    {
		        alert("用户名或密码错误");
		    }
		    if(data=="yes")
		    {
		        alert("通过验证,系统登录成功");
		        window.location.href="<%=path %>/loginSuccess.jsp";
		    }
		    
		}
		
		function reg()
		{
		   window.location.href="<%=path %>/userReg.jsp";
		}
	    </script>
</head>
<body>
<table width="100%" height="166" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="42" valign="top">
       <table width="100%" height="42" border="0" cellpadding="0" cellspacing="0" class="login_top_bg">
	      <tr>
	        <td width="1%" height="21">&nbsp;</td>
	        <td height="42">&nbsp;</td>
	        <td width="17%">&nbsp;</td>
	      </tr>
       </table>
    </td>
  </tr>
  <tr>
    <td valign="top">
     <table width="100%" height="332" border="0" cellpadding="0" cellspacing="0" class="login_bg">
      <tr>
        <td width="50%" align="right">
        <table width="91%" height="332" border="0" cellpadding="0" cellspacing="0" class="login_bg2">
            <tr>
              <td height="138" valign="top"><table width="89%" height="327" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td height="149">&nbsp;</td>
                </tr>
                <tr>
                  <td height="80" align="center" valign="top" class="slogn">
                  Welcome to XY</td>
                </tr>
                <tr>
                  <td height="198" align="right" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                      <td width="35%">&nbsp;</td>
                      <td height="25" colspan="2" class="left_txt"></td>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td height="25" colspan="2" class="left_txt"></td>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td height="25" colspan="2" class="left_txt"></td>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td width="30%" height="40"></td>
                      <td width="35%"></td>
                    </tr>
                  </table></td>
                </tr>
              </table></td>
            </tr> 
            
        </table></td>
        <td width="50%" valign="bottom"><table width="350" height="59" border="0" align="center" cellpadding="0" cellspacing="0" class="login_panel">
            <tr>
              <td width="4%" >&nbsp;</td>
              <td width="96%" height="42" ><span class="login_txt_bt">企业内部邮件系统</span></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td height="21"><table cellSpacing="0" cellPadding="0" width="100%" border="0" id="table211" height="170>
                  <tr>
                    <td height="164" colspan="2" align="middle">
                        <FORM name="ThisForm" action="<%=path %>/adminLogin.action" method=post>
                        <table cellSpacing="0" cellPadding="0" width="100%" border="0" height="143" id="table212">
                          <tr>
                            <td width="9%" height="38" class="top_hui_text"><span class="login_txt">用户名：&nbsp;&nbsp; </span></td>
                            <td height="38" colspan="2" class="top_hui_text"><input name="userName" class="editbox4" value="" size="20" class="input_name">&nbsp;&nbsp;<b>@xy.com</b></td>
                          </tr>
                          <tr>
                            <td width="9%" height="35" class="top_hui_text"><span class="login_txt"> 密 码： &nbsp;&nbsp; </span></td>
                            <td height="35" colspan="2" class="top_hui_text"><input class="editbox4" type="password" size="20" name="userPw"></td>
                          </tr>
                          <tr>
                            <td width="9%" height="35" ><span class="login_txt">登录身份：</span></td>
                            <td height="35" colspan="2" class="top_hui_text">
                                 <select class="INPUT_text" name="userType">
								    <option value="-1" selected="selected">--请选择登陆身份--</option>
									<option value="0">管理员</option>
									<option value="1">用户</option>
								 </select>
                            </td>
                          </tr>
                          <tr>
                            <td height="35" >&nbsp;</td>
                            <td width="20%" height="35" >
                                <input name="button" type="button" class="button" id="Submit" value="登 陆" onclick="check1()"> 
                                <img id="indicator" src="<%=path %>/images/loading.gif" style="display:none"/>
                            </td>
                            <!-- <td width="67%" class="top_hui_text"><input onclick="reg()" name="cs" type="button" class="button" id="cs" value="注册"></td>-->
                          </tr>
                        </table>
                        <br>
                    </form></td>
                  </tr>
              </table></td>
            </tr>
          </table>
          </td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>