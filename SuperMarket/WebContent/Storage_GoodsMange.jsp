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
					<a href="TotalGoodss" target="mainFrame23">所有商品</a>
				</div>
				<div>
				
					<a href="Storage_GoodsOutStorage.jsp" target="mainFrame23">商品出库</a>
				</div>
				<div>
					<a href="Storage_GoodsInStorage.jsp" target="mainFrame23">商品入库</a>
				</div>
			</div>
		</div>
	</div>
	<div
		style="width: 600px; height: 800px; position: absolute; left: 150px;">

		<iframe name="mainFrame23" id="manFrame23" src="TotalGoodss"
			Style="position: absolute; height: 600px; width: 900px"
			scrolling="no" frameborder="0"></iframe>

	</div>
</body>
</html>