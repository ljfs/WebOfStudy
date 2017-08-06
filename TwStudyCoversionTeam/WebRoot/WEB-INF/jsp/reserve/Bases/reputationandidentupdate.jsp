<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'reputationandidentupdate.jsp' starting page</title>
    
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
			<div id="reputationandidentupdate" class="easyui-panel" title="信誉及身份修改"     
	        style="width:500px;height:auto;padding:10px;background:#fafafa;"   
	        data-options="closable:true">   
			    <form id="renpassword" method="post">
			    	<table align="center">
			    		<tr>
						    <div align="center">   
						        <td><label for="name">姓名:</label></td>
						        <td><input id="pname" class="easyui-validatebox" type="text" name="pname" data-options="required:true" /></td>
						    </div>
					    </tr>
				    	<tr>
						    <div align="center">   
						        <td><label for="name">性别:</label></td>
						        <td><input id="pgender" class="easyui-validatebox" type="text" name="gender" data-options="required:true" /></td>
						    </div>
					    </tr>   
				    	<tr>
						    <div align="center">   
						        <td><label for="name">年龄:</label></td>
						        <td><input id="page" class="easyui-validatebox" type="text" name="age" data-options="required:true" /></td>
						    </div>
					    </tr>
					    <tr>
						    <div align="center">   
						        <td><label for="name">身份修改:</label></td>
						        <td>
						        	<select id="cc" class="easyui-combobox" name="dept" style="width:100px;height: auto;">   
									    <option value="aa">成员</option>   
									    <option>老师</option>
									    <option>普通管理员</option>
									    <option>底层管理员</option>
									    <option>基层管理员</option>
									</select> 
						        </td>
						    </div>
					    </tr>
					    <tr>
						    <div align="center">   
						        <td><label for="name">身份:</label></td>
						        <td>
						        	<select id="cc" class="easyui-combobox" name="dept" style="width:100px;height: auto;">   
									    <option value="aa">1</option>   
									    <option>0</option>
									</select>
						        </td>
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
