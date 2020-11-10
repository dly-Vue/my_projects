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


         <%String userName=request.getParameter("name01");
      
         %>
			<div class="leftbox ">
				<div class="l_nav2 ">
					<div class="ta1 ">
						<strong>个人中心</strong>
						<div class="leftbgbt "></div>
					</div>
					<div class="cdlist ">
						<div>
							<a href="Storage_Person?userName=<%=userName%>" target="mainFrame21">个人信息</a>
						</div>
						<div>
							<a href="Storage_PersonInfo_Edit.jsp" target="mainFrame21">个人信息编写</a>
						</div>
						<div>
							<a href="Storage_ChangePassword.jsp" target="mainFrame21">修改密码</a>
						</div>
					</div>
				</div>
			</div>

		</div>

	<div
		style="width: 600px; height: 1000px; position: absolute; left: 150px;">

		<iframe name="mainFrame21" id="manFrame21" src="Storage_Person?userName=<%=userName%>"
			Style="position: absolute; height: 600px; width: 900px"
			scrolling="no" frameborder="0"></iframe>

	</div>

</body>
</html>