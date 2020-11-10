<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="page.css" />
<link rel="stylesheet" type="text/css" href="page1.css" />
<link rel="stylesheet" type="text/css" href="page2.css" />
<link rel="stylesheet" type="text/css" href="page3.css" />
</head>
<body>
	<div class="leftbox">
		<div class="l_nav2">
			<div class="ta1">
				<strong>仓库人员</strong>
				<div class="leftbgbt"></div>
			</div>
			<div class="cdlist">
				<div>
					<a href="User" target="mainFrame3">工人信息</a>
				</div>
				<div>
					<a href="DeletePerson.jsp" target="mainFrame3" >解雇工人</a>
				</div>
			</div>
		</div>
	</div>
	<div
		style="width: 600px; height: 800px; position: absolute; left: 150px;">

		<iframe name="mainFrame3" id="manFrame2" src="User"
			Style="position: absolute; height: 600px; width: 900px"
			scrolling="no" frameborder="0"></iframe>

	</div>
</body>
</html>