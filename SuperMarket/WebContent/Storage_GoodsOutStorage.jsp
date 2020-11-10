<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h4>商品管理>>出库商品</h4>
	<div>
		<form action="GoodsOutStorage" mothod="GeT">
			商品名字:<input type="text" name="goodsName" id="goodsName" /><br />
			商品编号:<input type="text" name="goodsID" id="goodsID" /><br /> 商品价格:<input
				type="text" name="goodsPrice" id="goodsPrice" /><br /> 商品数量:<input
				type="text" name="goodsNumber" id="goodsNumber" /><br /> 商品类型:<input
				type="text" name="goodsType" id="goodsType" /><br /> <input
				type="submit" name="subimt" id="submit" value="出库" />
		</form>
	</div>
	<hr width="600px" />
	<c:if test="${requestScope.Goods==52}">
		<div class="page3" id="goods">
			<h4>商品>>最近出库商品</h4>
			<div
				style="overflow-x: auto; overflow-y: auto; height: 200px; width: 620px;"
				align="center">
				<table id="table" border="1" align="center" width="600px">
					<caption>商品信息</caption>
					<tr align="center" height="20px">
					    <td>序号</td>
						<td>商品名字</td>
						<td>商品编号</td>
						<td>商品价格</td>
						<td>商品数量</td>
						<td>商品类型</td>
						<td>商品经手人</td>
						<td>商品出库时间</td>

					</tr>
					<c:forEach items="${requestScope.list52}" var="info" varStatus="vst">
						<tr align="center" height="20px">
						    <td>${vst.index+1}</td>
							<td>${info.goodsName}</td>
							<td>${info.goodsID}</td>
							<td>${info.goodsPrice}</td>
							<td>${info.goodsNumber}</td>
							<td>${info.goodsType}</td>
				            <td>${info.goodsPerson}</td>
							<td>${info.goodsDate}</td>
						</tr>
					</c:forEach>

				</table>
			</div>
		</div>
	</c:if>
	


</body>
</html>