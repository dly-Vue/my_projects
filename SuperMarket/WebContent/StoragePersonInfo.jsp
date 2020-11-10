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
	<c:if test="${requestScope.user==01}">
		<div class="page2" id="workInformation">
			<h4>仓库人员>>工人信息</h4>
			<div
				style="overflow-x: auto; overflow-y: auto; height: 1000px; width: 520px;"
				align="center">
				<table id="table" border="1" align="center" width="500px">
					<caption>仓库管理员信息</caption>
					<tr align="center" height="20px">
                        <td>序号</td>					
						<td>工人姓名</td>
						<td>工人工号</td>
						<td>工人联系电话</td>
						<td>工人联系地址</td>
					</tr>
					<c:forEach items="${requestScope.list31}" var="info" varStatus="vst">
						<tr align="center" height="20px">
						    <td>${vst.index+1}</td>
							<td>${info.userID}</td>
							<td>${info.userName}</td>
							<td>${info.userIphone}</td>
							<td>${info.userAddress}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</c:if>
</body>
</html>