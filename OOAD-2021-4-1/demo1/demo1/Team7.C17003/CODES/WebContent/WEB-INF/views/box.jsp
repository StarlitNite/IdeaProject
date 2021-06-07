<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet" type="text/css" media="all" />
<title>box</title>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/animate.css"
	rel="stylesheet" type="text/css" media="all">
<script src="${pageContext.request.contextPath}/js/wow.min.js"></script>
<script>
	new WOW().init();
</script>
<script>
function userLogin() {
	var xinghao = $("#xinghao").val();
	var color = $("#color").val();
	var geshu = $("#geshu").val();
	alert("开始选购箱子！！");
	$.post("${pageContext.request.contextPath}/boxdinggou.do",{"xinghao":xinghao,"color":color,"geshu":geshu},function(data){
		console.log("aa");
		for(var aa in data){
			alert(aa);
		}
		location.href="boss.do";
	},"json");

}
</script>
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
									<a href="#">快递箱订购</a>
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

	<div class="container-fluid">
		<div class="row">

			<div class="col-md-3"></div>

			<div class="col-md-6">

				<form method="post">


					<div class="form-group" style="margin-top: 50px;">
						<label style="margin-top: 20px;" class="col-sm-2 control-label">型号选择</label>
						<div class="col-sm-10">
							<select style="margin-top: 20px;" class="form-control"
								id="xinghao" name="xinghao">
								<option value="">--请选择--</option>
								<option value="yihaoxiang">一号箱</option>
								<option value="erhaoxiang">二号箱</option>
								<option value="sanhaoxiang">三号箱</option>
							</select>
						</div>
					</div>

					<div class="form-group" style="margin-top: 50px;">
						<label style="margin-top: 20px;" class="col-sm-2 control-label">颜色选择</label>
						<div class="col-sm-10">
							<select style="margin-top: 20px;" class="form-control"
								id="color" name="color">
								<option value="">--请选择--</option>
								<option value="hese">褐色</option>
								<option value="huise">灰色</option>
								<option value="hongse">红色</option>
							</select>
						</div>
					</div>

					<div class="form-group" style="margin-top: 20px;">
						<label style="margin-top: 20px;" for="new_goodsDisc"
							class="col-sm-2 control-label">个数</label>
						<div class="col-sm-10">
							<input style="margin-top: 20px;" class="form-control" type="text"
								placeholder="个数" id="geshu" name="geshu" />
						</div>
					</div>

					<div class="modal-footer" style="margin-top: 20px;">
						<a href="${pageContext.request.contextPath }/boss.do"><button
								type="button" class="btn btn-default" data-dismiss="modal">关闭</button></a>
						<input type="submit" class="btn btn-primary" value="确认订购" onclick="userLogin()">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>