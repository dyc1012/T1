<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
${error}
	<form method="post" action="login.do">
		<table>
			<tr>
				<td colspan="2" align="center">Account Login</td>
			</tr>
			<tr>
				<td>CardNo:</td>
				<td><input type="text" name="cardNo" value="" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value="" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" name=""
					value="Submit" /> <input type="reset" name="" value="Reset" /></td>
			</tr>
		</table>

	</form>
</body>
</html>
