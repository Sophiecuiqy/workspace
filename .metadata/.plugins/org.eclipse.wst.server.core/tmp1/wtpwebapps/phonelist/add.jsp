<%@ page language="java" import="java.util.*,com.phone.dao.*,com.phone.domain.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>电话簿</title>
</head>
<body>
<%
	if("update".equals(request.getAttribute("tp"))) {
%>
<form action="UpdatePhoneServlet" method="post">
<%
	} else {
%>
<form action="AddPhoneServlet" method="post">
<%
	}
%>
	<h4>电话簿</h4>
	<h5>新增/修改电话簿</h5>
	<%
		String name = "";
		String phone = "";
		String id = "";
		if("update".equals(request.getAttribute("tp"))) {
			name = (String)request.getAttribute("name");
			phone = (String)request.getAttribute("phone");
			id = (String)request.getAttribute("id");
		}
	%>
	姓名：<input type="text"  name="name" value="<%=name %>" /><br>
	电话：<input type="text"  name="phone" value="<%=phone %>" /><br>
	<input type="hidden" name="id" value="<%=id %>"/>
	<%
		if("update".equals(request.getAttribute("tp"))) {
	%>
	<input type="submit" value="修改"/>
	<!-- <a href="/phonelist/UpdatePhoneServlet?id=<%=id %>&name=<%=name %>&phone=<%=phone %>">修改</a> -->
	<%
		} else {
	%>
	<input type="submit" value="新增"/>
	<!-- <a href="/phonelist/AddPhoneServlet?name=<%=name %>&phone=<%=phone %>">新增</a>-->
	<%
		}
	%>
	
	<a href="/phonelist/index.jsp">返回</a>

</form>
</body>
</html>