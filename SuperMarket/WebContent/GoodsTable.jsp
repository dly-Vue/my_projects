<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="data.TypeNumber" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>第一个 ECharts 实例</title>
<!-- 引入 echarts.js -->
<script src="https://cdn.staticfile.org/echarts/4.3.0/echarts.min.js"></script>
</head>
<body>
	<h4>商品>>商品统计</h4>
	
	<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
	<div id="main" style="width: 600px; height: 400px;"></div>
     	<%
	List<TypeNumber> list10=new ArrayList<>();
	list10=(List<TypeNumber>)session.getAttribute("lists2");
	System.out.println(list10);
	%> 
	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById('main'));
		// 指定图表的配置项和数据
		option = {
				title : {
					text : '商品类型数量所占比例',
					subtext : '商品分布',
					x : 'center'
				},
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b}: {c} ({d}%)"//模板变量有 {a}、{b}、{c}、{d}，分别表示系列名，数据名，数据值，百分比。
			},
			//图例
			legend : {
				//图例垂直排列
				orient : 'vertical',
				x : 'left',
				//data中的名字要与series-data中的列名对应，方可点击操控
				data : [ '<%=list10.get(0).getGoodsType()%>', '<%=list10.get(1).getGoodsType()%>', '<%=list10.get(2).getGoodsType()%>', '<%=list10.get(3).getGoodsType()%>', '<%=list10.get(4).getGoodsType()%>','<%=list10.get(5).getGoodsType()%>' ]
			},
			series : [ {
				name : '访问来源',
				type : 'pie',
				//饼状图
				// radius: ['50%', '70%'],
				avoidLabelOverlap : false,
				//标签
				label : {
					normal : {
						show : true,
						position : 'inside',
						formatter : '{d}%',//模板变量有 {a}、{b}、{c}、{d}，分别表示系列名，数据名，数据值，百分比。{d}数据会根据value值计算百分比
						textStyle : {
							align : 'center',
							baseline : 'middle',
							fontFamily : '微软雅黑',
							fontSize : 15,
							fontWeight : 'bolder'
						}
					},
				},
				data:[
               	 {value:<%=list10.get(0).getSum() %>,name:'<%=list10.get(0).getGoodsType()%>'},
               	 {value:<%=list10.get(1).getSum() %>,name:'<%=list10.get(1).getGoodsType()%>'},
                    {value:<%=list10.get(2).getSum() %>,name:'<%=list10.get(2).getGoodsType()%>'},
                    {value:<%=list10.get(3).getSum() %>,name:'<%=list10.get(3).getGoodsType()%>'},
                    {value:<%=list10.get(4).getSum() %>,name:'<%=list10.get(4).getGoodsType()%>'},
                    {value:<%=list10.get(5).getSum() %>,name:'<%=list10.get(5).getGoodsType()%>'}
               ]
				
			} ]
		};
		myChart.setOption(option);
	</script>
</body>
</html>