时有时无Servlet，从Project Structure 中找到![img.png](img.png) 勾选即可
    
LogModel LogController  暂时完成 需要css美化 
    UserModel、UserController、User  暂未完成，明天找老师
    RegController、RegModel、Reg 暂时完成 需要css美化

<c:out> 输出
<c:forEach>循环
jsp页面一直出现${user.UserName}是因为EL表达式未生效
参考了https://blog.csdn.net/qq_41063141/article/details/8386594和https://www.cnblogs.com/cowshed/p/7775062.html的博客

获取用户数据时只需要获取当前用户，所以使用Map 获取列表时才需要使用List
![img_1.png](img_1.png)

UserController那里

el表达式：<c:if test="${user.UserName == 'admin'}"></c:if>  判定用单引号''。![img_2.png](img_2.png)


没有把新闻分类的值传给addNews.jsp 回来解决
foodlist.jsp  传到Controller 再请求转发到addfood.jsp。  添加的结果 跳转到消息提示

显示新闻分类：NewsGroupModel从数据库获取数据，再由AddNewsController获取model中的数据，请求转发给addNews.jsp。

操作分为
操作数据，处理数据操作（是否操作成功）
