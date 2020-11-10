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
	<h4>商品>>商品查询</h4>
	<div>
		<form action="FoundGoods" mothod="GeT">
			属性:<input type="text" name="Name" id="Name" /><br />
			<p>
				查询类型：&emsp;&emsp;&emsp;&emsp; <select width="200px" name="Type">
					<option value="商品名">商品名</option>
					<option value="商品类型">商品类型</option>
				</select>
			</p>

			<input type="submit" name="subimt" id="submit" value="查询" />
		</form>
	</div>
	<c:if test="${requestScope.Goods==51}">
		<div class="page3" id="goods">
			<h4>商品>>所有商品</h4>
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
						<td>商品商品数量</td>
						<td>商品商品类型</td>
					</tr>
					<c:forEach items="${requestScope.list51}" var="info" varStatus="vst">
						<tr align="center" height="20px">
						    <td>${vst.index+1}</td>
							<td>${info.goodsName}</td>
							<td>${info.goodsID}</td>
							<td>${info.goodsPrice}</td>
							<td>${info.goodsNumber}</td>
							<td>${info.goodsType}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</c:if>

</body>
</html>