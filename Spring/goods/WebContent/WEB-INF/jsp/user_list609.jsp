<%--
  Created by IntelliJ IDEA.
  User: Wu
  Date: 2021/9/15
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<div id="page-wrapper">
    <form action="${pageContext.request.contextPath}/user/addUser609.action" class="form-horizontal" role="form">
    <%--创建模态框（Modal）--%>
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">添加用户</h4>
                </div>
                <div class="modal-body">
                        <div class="form-group">
                            <label for="user_name" class="col-sm-2 control-label">用户名</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="user_name" id="user_name" placeholder="请输入用户名">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="user_pass" class="col-sm-2 control-label">密码</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" name="user_pass" id="user_pass" placeholder="请输入密码">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="user_age" class="col-sm-2 control-label">年龄</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="user_age" id="user_age" placeholder="请输入年龄">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="" class="col-sm-2 control-label">性别</label>
                            <div class="col-sm-10">
                                <label class="radio-inline">
                                    <input type="radio" name="user_sex" id="user_sex_1" value="1" checked> 男
                                </label>
                                <label class="radio-inline">
                                    <%--value 性别读到的是值--%>
                                    <input type="radio" name="user_sex" id="user_sex_0"  value="0"> 女
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="user_email" class="col-sm-2 control-label">E-mail</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="user_email" id="user_email" placeholder="请输入邮箱">
                            </div>
                        </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="submit" class="btn btn-primary">提交</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
    </form>
    <table class="table table-striped">
        <caption>
            <!-- 按钮触发模态框 -->
            <button class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal">新增用户</button>
        </caption>
        <thead>
        <tr>
            <th>用户ID</th>
            <th>用户名</th>
            <th>密码</th>
            <th>年龄</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${userlist}" var="l">
            <tr>
                <td>${l.user_id}</td>
                <td>${l.user_name}</td>
                <td>${l.user_pass}</td>
                <td>${l.user_age}</td>
                <td><a href="#" class="btn btn-primary btn-xs" role="button" data-toggle="modal" data-target="#userEditDialog" onclick="edituser(${l.user_id})">修改</a></td>
                <td><a href="${pageContext.request.contextPath }/user/delUser609.action?userid=${l.user_id}" onclick="javascript:return confirm('确认要删除该用户吗')" class="btn btn-primary btn-xs"></a>删除</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <%--  修改  --%>
            <!-- 修改商品模态框 -->
            <div class="modal fade" id="userEditDialog" tabindex="-1" role="dialog"
                 aria-labelledby="myModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="modal-title" id="myModalLabel">修改用户信息</h4>
                        </div>
                        <div class="modal-body">
                            <form class="form-horizontal" id="new_good_form">
                                <div class="form-group">
                                    <label for="edit_user_name" class="col-sm-2 control-label">
                                        用户名称
                                    </label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="edit_user_name" placeholder="用户名称" name="user_name" />
                                    </div>
                                </div>


                                <div class="form-group">
                                    <label for="edit_user_age" class="col-sm-2 control-label">用户年龄</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="edit_user_age" placeholder="用户年龄" name="user_age" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="edit_user_sex" class="col-sm-2 control-label">用户性别</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="edit_user_sex" placeholder="用户性别" name="user_sex" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="edit_user_email" class="col-sm-2 control-label">用户邮箱</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="edit_user_email" placeholder="用户邮箱" name="user_email" />
                                    </div>
                                </div>

                            </form>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary" onclick="updateuser()">保存修改</button>
                        </div>
                    </div>
                </div>
            </div>

    <script>
      //10.4
        // 通过id获取修改的商品信息
        function edituser(user_id) {
            $.post("${pageContext.request.contextPath}/user/getUserById609.action",{"user_id":user_id},function(data){
                $("#edit_user_id").val(data.user_id);
                $("#edit_user_name").val(data.user_name);


                if(data.parentid==0){
                    $("#form_parentid").hide();
                    $("#form_cateDesc").show();

                }else{
                    $("#form_parentid").show();
                    $("#form_cateDesc").hide();
                    $("select option[value='"+data.parentid+"']").attr("selected", "selected");
                }
            });
        }
        // 执行修改商品操作
        function updateuser() {
            $.post("<%=basePath%>user/updateuser609.action",$("#edit_user_id").serialize(),function(data){
                if(data =="OK"){
                    alert("商品信息更新成功！");
                    window.location.reload();
                }else{
                    alert("商品信息更新失败！");
                    window.location.reload();
                }
            });
        }
    </script>
        <%@include  file="/WEB-INF/footer.jsp"%>
