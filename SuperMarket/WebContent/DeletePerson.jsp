<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function onclickDelete(){
		alert("解雇成功！");
		window.location.href = "DeletePerson.jsp";
	}
</script>
</head>
<body>
	<h4>仓库人员>>解雇工人</h4>
	<div align="center" id="su">
		<form action="DeleteUser" modth="GeT">
			<p>
				工人编号：<input type="text" name="username" id="username" />
			</p>
			<br />
			<p>
				工人姓名：<input type="text" name="userID" id="userID" />
			</p>
			<br /> <input type="submit" name="OK" value="解雇"
				onclick="onclickDelete()" /><br />
		</form>
	</div>
</body>
</html>