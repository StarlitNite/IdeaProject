<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>show</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet" type="text/css" media="all" />
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta property="og:title" content="Vide" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/animate.css"
	rel="stylesheet" type="text/css" media="all">
<script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
</head>

<body>

	<div class="header">
		<div class="container">
			<div class="header-menu">
				<nav class="navbar navbar-default">
					<div class="container-fluid">
						<!-- Brand and toggle get grouped for better mobile display -->
						<div class="navbar-header">
							<div class="navbar-brand logo wow fadeInLeft animated animated"
								data-wow-delay="0.4s">
								<h1>
									<a href="#">账本展示</a>
								</h1>
							</div>
						</div>
						<!-- /.navbar-collapse -->
					</div>
					<!-- /.container-fluid -->
				</nav>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!---header--->
	<div class="row">
		<div style="height: 60px"></div>
		<div class="col-md-4"></div>

		<div class="col-md-7">
			<table class="table table-striped">
			    <tr>
                    <th>快递单信息</th>
                    <th>价格</th>
                    <th>原价</th>
                    <th>折扣</th>
                </tr>
                <tr>
                    <td>${kuaididan}</td>
                    <td>${jiage}</td>
                    <td>${yuanjia}</td>
                    <td>${zhekou}</td>
                </tr>
            </table>
			<div style="height: 30px"></div>
			<a href="${pageContext.request.contextPath}/first.do"
				type="button" class="btn btn-default" data-dismiss="modal"
				data-toggle="modal">返回到首页</a>
		</div>
	</div>
</body>
</html>