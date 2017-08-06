<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% 
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
	String dateshow;
	dateshow = sdf.format(date);
%>
<div><% out.print("<div align = 'center'><strong>调味兴趣学习学术交流团体 </strong> 版权所有 2016--"+dateshow+"</div>");%></div>
