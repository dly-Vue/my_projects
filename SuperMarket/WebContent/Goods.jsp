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

	<div class="leftbox ">
		<div class="l_nav2 ">
			<div class="ta1 ">
				<strong>商品</strong>
				<div class="leftbgbt "></div>
			</div>
			<div class="cdlist ">
				<div>
					<a href="Goods01" target="mainFrame4">所有商品</a>
				</div>
				<div>
					<a href="OutStorage" target="mainFrame4">出库商品</a>
				</div>
				<div>
					<a href="InStorage" target="mainFrame4">进库商品</a>
				</div>
				<div>
					<a href="GoodsType" target="mainFrame4">商品统计</a>
				</div>
			</div>
		</div>
	</div>
	<div
		style="width: 600px; height: 800px; position: absolute; left: 150px;">

		<iframe name="mainFrame4" id="manFrame2" src="Goods01"
			Style="position: absolute; height: 900px; width: 900px"
			scrolling="no" frameborder="0"></iframe>

	</div>
</body>
</html>