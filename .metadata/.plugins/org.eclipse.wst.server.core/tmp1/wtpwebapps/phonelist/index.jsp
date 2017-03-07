<%@ page language="java" import="java.util.*,com.phone.dao.*,com.phone.domain.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电话簿</title>
</head>
<body>
<form action="QueryPhoneServlet" method="post">
	<h4>电话簿</h4>
	<h5>按名称搜索</h5>
	<input type="text"  name="name" value="" />
	<input type="submit" value="搜索"/>
	<a href="/phonelist/add.jsp?tp=add">新增电话</a>
	
	<table border="1">
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>电话</th>
			<th>更新</th>
			<th>删除</th>
		</tr>
		<%
			List<PhoneListVo> list = null;
			 if("query".equals(request.getAttribute("queryTp"))) {
				 list = (List<PhoneListVo>) request.getAttribute("result");
			 } else {
				 list = new PhoneListDao().queryAll();
			 }
             Iterator<PhoneListVo> it = list.iterator();
             while(it.hasNext()) {
             	PhoneListVo phone = it.next();
        %>
		<tr>
			<td><%=phone.getId()%></td>
			<td><%=phone.getName()%></td>
			<td><%=phone.getPhone()%></td>
			<td><a href="/phonelist/JumpToUpdateServlet?id=<%=phone.getId()%>&name=<%=phone.getName()%>&phone=<%=phone.getPhone()%>">更新</a></td>
			<td><a href="/phonelist/DeletePhoneServlet?id=<%=phone.getId()%>">删除</a></td>
		</tr>
		<%
			}
        %>     
	</table>
</form>
</body>
</html>