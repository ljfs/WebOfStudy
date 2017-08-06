<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'repassword.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="jquery-easyui-1.4.3/themes/icon.css" type="text/css"></link>
	<link rel="stylesheet" href="jquery-easyui-1.4.3/themes/default/easyui.css" type="text/css"></link>
	<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript">
	  		
	</script>
  </head>
  
  <body>
    <div align="center">
			<div id="repassword" class="easyui-panel" title="修改密码"     
	        style="width:500px;height:150px;padding:10px;background:#fafafa;"   
	        data-options="closable:true">   
			    <form id="renpassword" method="post">
			    	<table align="center">
			    		<tr>
						    <div align="center">   
						        <label for="name">原密码:&nbsp;&nbsp;&nbsp;&nbsp;</label>
						        <input id="pwd" class="easyui-validatebox" type="password" name="password" data-options="required:true" />   
						    </div>
					    </tr>
				    	<tr>
						    <div align="center">   
						        <label for="name">新密码:&nbsp;&nbsp;&nbsp;&nbsp;</label>
						        <input id="npwd" class="easyui-validatebox" type="password" name="newpassword" data-options="required:true" />   
						    </div>
					    </tr>   
				    	<tr>
						    <div align="center">   
						        <label for="name">确认密码:</label>
						        <input id="renpwd" class="easyui-validatebox" type="password" name="renewpassword" data-options="required:true" />   
						    </div>
					    </tr>
				    </table>
				    <div align="center">
				    	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'">修改并保存</a>
				    </div>
				</form>  
   
			</div>  
		</div>
  </body>
</html>
