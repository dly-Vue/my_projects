<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	function onclickOK() {
		alert("修改成功！");
		
	}
</script>
</head>
<body>
	<h4>个人中心>>修改密码</h4>
	<div align="center">
		<form action="ChangePassword" modth="GeT">
			<p>

				用户账号：<input type="text" name="username" id="username" />
			</p>
			
			<p>
				用户密码：<input type="password" name="oldPassword" id="oldPassword" />
			</p>
			
			<p>
				账户新密码：<input type="password" name="newPassword" id="newPassword" />
			</p>
			<br /> <input type="submit" name="OK" value="确定"
				onclick="onclickOK()" /><br />
		</form>
	</div>

</body>
</html>