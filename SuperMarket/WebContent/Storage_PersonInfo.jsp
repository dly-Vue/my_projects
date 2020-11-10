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
	<c:if test="${requestScope.Demo01==41}">
		<div class="page1" id="information" style="height: 1000px;">
			<h4>个人中心>>用户信息</h4>
			<c:forEach items="${requestScope.lists21}" var="info">
				<div>
					<p>用户账号：${info.userName}</p>
					<p>用户姓名： ${info.userID}</p>
					<p>用户电话：${info.userIphone}</p>
					<p>用户地址：${info.userAddress}</p>
				</div>
			</c:forEach>
		</div>
	</c:if>
</body>
</html>