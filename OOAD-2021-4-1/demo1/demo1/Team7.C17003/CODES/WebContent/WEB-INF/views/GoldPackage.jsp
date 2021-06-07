<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Change</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet" type="text/css" media="all" />
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" media="all" />
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/animate.css"
	rel="stylesheet" type="text/css" media="all">
<script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
<script>
	new WOW().init();
</script>
</head>

<body>


	<!---welcome--->
	<div class="content">
		<div class="welcome">
			<div class="container">
				<h2>管理我的订单</h2>
				<div class="wel-grids">
				    
					<a href="${pageContext.request.contextPath}/Goldmodify.do">
						<div class="col-md-3 wel-grid wow fadeInDownBig animated animated"
							data-wow-delay="0.4s">
							<div class="wel-top hvr-rectangle-out">
								<i class="glyphicon glyphicon-tower" aria-hidden="true"></i>
								<h4>修改信息</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et...</p>
							</div>
						</div>
					</a>
					
					 <a href="${pageContext.request.contextPath}/Goldcancle.do">
						<div class="col-md-3 wel-grid wow fadeInDownBig animated animated"
							data-wow-delay="0.4s">
							<div class="wel-top hvr-rectangle-out">
								<i class="glyphicon glyphicon-stats" aria-hidden="true"></i>
								<h4>取消订单</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et...</p>
							</div>
						</div>
					</a>
					
					
					
					<a href="${pageContext.request.contextPath}/Goldquery.do">
						<div class="col-md-3 wel-grid wow fadeInDownBig animated animated"
							data-wow-delay="0.4s">
							<div class="wel-top hvr-rectangle-out">
								<i class="glyphicon glyphicon-tower" aria-hidden="true"></i>
								<h4>查询</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et...</p>
							</div>
						</div>
					</a>
					
					 <a href="${pageContext.request.contextPath}/Goldevaluate.do">
						<div class="col-md-3 wel-grid wow fadeInDownBig animated animated"
							data-wow-delay="0.4s">
							<div class="wel-top hvr-rectangle-out">
								<i class="glyphicon glyphicon-stats" aria-hidden="true"></i>
								<h4>评价</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et...</p>
							</div>
						</div>
					</a>
					<div class="clearfix"></div>
				</div>
				
			</div>
		</div>

	</div>

	<!--copy-->


</body>
</html>
