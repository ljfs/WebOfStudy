<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	
	
	<link rel="stylesheet" href="jquery-easyui-1.4.3/themes/icon.css" type="text/css"></link>
	<link rel="stylesheet" href="jquery-easyui-1.4.3/themes/default/easyui.css" type="text/css"></link>
	<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
  	<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
  	<script type="text/javascript" src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
  	<script type="text/javascript">
  	</script>
  </head>
  
  <body class="easyui-layout" id="Managerlayout">
		    <div data-options="region:'north',collapsible:false" style="height:100px;"></div> 
		    <div data-options="region:'west',title:'选项',split:false" style="width:300px;"></div>   
		    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;"> 
    	<jsp:include page="index.jsp"></jsp:include>
    	<jsp:include page="UserBottom.jsp"></jsp:include>
    </div>
 </body>
</html>
