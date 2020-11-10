<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function onclickOK() {
		alert("编辑成功！");
	}
</script>
</head>
<body>
	<h4>个人中心>>信息编辑</h4>
	<div align="center">
		<form action="Storage_ChangePerson" modth="GeT">
			<p>
				用户账号：<input type="text" name="userName" id="userName" />
			</p>
			<p>
			           用户密码：<input type="password" name="userPassword" id="userPassword" />
			</p>
			<p>
				用户姓名：<input type="Text" name="userID" id="userID" />
			</p>
			<p>
				用户电话：<input type="Text" name="userIphone" id="userIphone" />
			</p>
			<p>
				用户地址：<input type="Text" name="userAddress" id="userAddress" />
			</p>
			
		 <input type="submit" name="OK" value="确定" onclick="onclickOK()" /><br />
		</form>
	</div>

</body>
</html>