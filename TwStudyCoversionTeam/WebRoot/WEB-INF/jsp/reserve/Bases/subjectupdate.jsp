<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'subjectparentupdate.jsp' starting page</title>
    
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
    <%-- 科目修改版面 --%>
			<div id="div_subjectupdate" class="easyui-panel" title="科目修改面板"     
	        style="width:500px;height:auto;padding:10px;background:#fafafa;"   
	        data-options="closable:true">   
			    <form id="frm_subjectupdate" method="post">
			    	<table align="center">
			    		<tr>
						    <div align="center">
						    <%-- 科目名称登记文本 --%>
						        <td><label for="name">科目名称:</label></td>
						        <td><input id="update_subjectname" class="easyui-validatebox" type="text" name="subjectname" data-options="required:true" /></td>
						    </div>
					    </tr>
					    <tr>
					    <%-- 系别下拉列表 --%>
						    <div align="center">   
						        <td><label for="name">所属系别:</label></td>
						        <td>
						        	<select id="subjectparentname" class="easyui-combobox" name="dept" style="width:100px;height: auto;">   
									    <option value="aa">物理系</option>   
									    <option>计算机系</option>
									    <option>数学系</option>
									    <option>文学系</option>
									    <option>艺术系</option>
									    <option>收破烂系</option>
									</select>
						        </td>
						    </div>
					    </tr>
				    </table>
				    <div align="center">
				    <%-- 提交按钮 --%>
				    	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'">修改并保存</a>
				    </div>
				</form>
			</div>
		</div>
  </body>
</html>
