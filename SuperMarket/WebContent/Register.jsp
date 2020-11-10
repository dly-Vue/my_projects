<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册</title>
<link rel="stylesheet" type="text/css" href="page1.css" />
<script type="text/javascript">
	function clickLogin() {
		window.location.href = "Login.jsp";
	}
</script>

</head>
<body>
	<div>
		<div class="page1-area1">
			<div>
				<img class="area1-img"
					src="http://pics.sc.chinaz.com/Files/pic/icons128/7572/g5.png">
			</div>
			<div>
				<h1 class="area1-h1">超市库存管理</h1>
			</div>
		</div>
	</div>
	<div style="position: relative">
		<img src="http://www.cool80.com/img.cool80/i/Code/647.jpg"
			width="1100px" />
		<div style="width: 300px; position: absolute; top: 90px; left: 450px">
			<p align="center">
				<font size="8" face="agency fb " color="darkviolet">用户注册</font>
			</p>
		</div>
		<div align="center"
			style="border: 1px solid #6495ED; width: 400px; position: absolute; top: 150px; left: 400px">
			<form action="demo01" mothod ="GeT">
			<p>
				用&nbsp;户&nbsp;名：<input type="text" name="userName">
			</p>
			<br />
			<p>
				用户密码：<input type="password" name="aPassword">
			</p>
			<br />
			<p>
				确认密码：<input type="password" name="bPassword">
			</p>
			<br />
			<p>
				身份选择：&emsp;&emsp;&emsp;&emsp; <select width="200px"
					name="profession">
					<option value="仓库管理员">仓库管理员</option>
					<option value="超市负责人">超市负责人</option>
				</select>
			</p>
			<br />
			<p>
				<input type="submit" value="注册" width="200px"> <input
					type="button" value="返回登录" width="200px" onclick="clickLogin()">
			</p></form>
		</div>
	</div>
</body>
</html>