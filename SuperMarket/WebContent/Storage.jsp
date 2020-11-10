<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>仓库管理员</title>
<link rel="stylesheet" type="text/css" href="page1.css" />
<link rel="stylesheet" type="text/css" href="page2.css" />
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
	function onclickBack() {
		window.location.href = "Login.jsp";

	}
</script>
</head>
<body>
	<%
		String name01 = (String) session.getAttribute("name01");
	
	%>
	<div>
		<div class="page1-area1">
			<div>
				<img class="area1-img" src="http://pics.sc.chinaz.com/Files/pic/icons128/7572/g18.png">
			</div>
			<div>
				<h1 class="area1-h1">超市库存管理</h1>
			</div>
			<div class="area1-button">
				<input class="button1" type="button" name="back" id="back"
					value="退出" onclick="onclickBack()" />
			</div>
		</div>
	</div>
	<div id="box">
		<div
			style="background-color: #6495ED; height: 30px; width: 1100px; position: relative">
			<div class="box_div1">
				<a class="box_a1" href="Storage_Main.jsp" target="mainFrame20">首页</a>
			</div>
			<div class="box_div2">
				<a class="box_a" href="Storage_Person.jsp?name01=<%=name01%>"
					target="mainFrame20">个人中心</a>
			</div>
			<div class="box_div3">
				<a class="box_a1" href="Storage_Goods.jsp" target="mainFrame20">商品</a>
			</div>
			<div class="box_div4">
				<a class="box_a" href="Storage_GoodsMange.jsp" target="mainFrame20">商品管理</a>
			</div>
		</div>
		<div>
			<iframe name="mainFrame20" id="manFrame20" src="Storage_Main.jsp"
				scrolling="no" frameborder="0"
				Style="position: absolute; height: 600px; width: 1100px"></iframe>

		</div>
	</div>

</body>
</html>