<template>
  <div>
<!--面包屑导航区    -->
    <el-breadcrumb separator-class="el-icon-arrow-right">
      <el-breadcrumb-item :to="{ path: '/home' }">首页</el-breadcrumb-item>
      <el-breadcrumb-item>用户管理</el-breadcrumb-item>
      <el-breadcrumb-item>用户列表</el-breadcrumb-item>
    </el-breadcrumb>

<!--卡片视图区-->
    <el-card>
<!--搜索与添加区-->
     <el-row :gutter="20" >
          <el-col :span="8">
            <el-input placeholder="请输入内容" v-model="queryInfo.query" clearable @clear="getUserList">
              <el-button slot="append" icon="el-icon-search" @click="getUserList"></el-button>
            </el-input>
          </el-col>
          <el-col :span="4">
            <el-button type="primary" @click="addDialogVisible = true" >添加用户</el-button>
          </el-col>
        </el-row>
<!-- 用户列表区域     -->
      <el-table :data="userList" border stripe>
        <el-table-column type="index"></el-table-column>
        <el-table-column  label="姓名" prop="userName"></el-table-column>
        <el-table-column  label="昵称" prop="nickName"></el-table-column>
        <el-table-column  label="联系电话" prop="tel"></el-table-column>
        <el-table-column  label="收货地址" prop="userAddress"></el-table-column>
        <el-table-column  label="身份" prop="role"></el-table-column>
        <el-table-column  label="状态">
          <template slot-scope="scope">
            <el-switch v-model="scope.row.state" @change="userStateChanged(scope.row)">
            </el-switch>
          </template>
        </el-table-column>
        <el-table-column  label="操作" width="180px">
          <template slot-scope="scope" >
            <el-tooltip  effect="dark" content="修改用户" placement="top" :enterable="false">
              <el-button type="primary" icon="el-icon-edit" size="mini" @click="showEditDialog(scope.row.userId)">修改</el-button>
            </el-tooltip>
            <el-tooltip  effect="dark" content="删除用户" placement="top" :enterable="false">
              <el-button type="danger" icon="el-icon-delete" size="mini" @click="deleteUserById(scope.row.userId)">删除</el-button>
            </el-tooltip>
          </template>
        </el-table-column>
      </el-table>
<!-- 分页区域     -->
      <el-pagination
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="queryInfo.currentPage+1"
          :page-sizes="[1,2,3,5,10]"
          :page-size="queryInfo.pageSize"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total">
      </el-pagination>
    </el-card>
<!--添加用户对话框    -->
    <el-dialog
        title="添加用户"
        :visible.sync="addDialogVisible"
        width="50%"
        @close="addDialogClosed">
<!-- 内容主体区域     -->
      <el-form :model="addForm" :rules="addFormRules" ref="addFormRef" label-width="80px" >
        <el-form-item label="用户名" prop="userName">
          <el-input v-model="addForm.userName"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password">
          <el-input v-model="addForm.password"></el-input>
        </el-form-item>
        <el-form-item label="昵称" prop="nickName">
          <el-input v-model="addForm.nickName"></el-input>
        </el-form-item>
        <el-form-item label="电话" prop="tel">
          <el-input v-model="addForm.tel"></el-input>
        </el-form-item>
        <el-form-item label="收货地址" prop="userAddress">
          <el-input v-model="addForm.userAddress"></el-input>
        </el-form-item>
      </el-form>
<!-- 底部区域     -->
      <span slot="footer" class="dialog-footer">
        <el-button @click="addDialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="addUser">确 定</el-button>
      </span>
    </el-dialog>
<!--   修改用户的对话框 -->
    <el-dialog
        title="修改用户"
        :visible.sync="editDialogVisible"
        width="50%"
        @close="editDialogClosed"
    >
<!--内容主体区域      -->
      <el-form :model="editForm" :rules="editFormRules" ref="editFormRef" label-width="80px">
        <el-form-item label="用户名" >
          <el-input v-model="editForm.userName" disabled></el-input>
        </el-form-item>
        <el-form-item label="昵称" prop="nickName">
          <el-input v-model="editForm.nickName"></el-input>
        </el-form-item>
        <el-form-item label="电话" prop="tel">
          <el-input v-model="editForm.tel"></el-input>
        </el-form-item>
        <el-form-item label="收货地址" prop="userAddress">
          <el-input v-model="editForm.userAddress"></el-input>
        </el-form-item>
      </el-form>
<!--底部按钮区域      -->
      <span slot="footer" class="dialog-footer">
    <el-button @click="editDialogVisible = false">取 消</el-button>
    <el-button type="primary" @click="editUserInfo">确 定</el-button>
  </span>
    </el-dialog>

  </div>
</template>

<script>
export default {
  name: "user",
  data(){
    //验证手机号规则
    var checkTel = (rule,value,cb)=>{
      //验证手机号的正则表达式
      const regTel = /^(0|86|17951)?(13[0-9]|15[0123456789]|17[678]|18[0-9]|14[57])[0-9]{8}$/
      //判断是否符合正则表达式
      if (regTel.test(value)){
        return cb();
      }
      //否则返回Error
      cb(new Error('请输入合法的手机号'))
    }

    return{
      //获取用户列表的参数对象
      queryInfo:{
        query:'',
        pageSize:5,/*一页内数据个数*/
        currentPage:1/*当前页数*/
      },
      userList:[],
      total:0,
      //控制添加用户对话框的显示与隐藏
      addDialogVisible:false,
      //添加用户的表单数据
      addForm:{
        userName: '',
        password: '',
        nickName: '',
        tel: '',
        userAddress: ''
      },
      //添加表单的验证规则对象
      addFormRules:{
        userName:[
          {
            required:true,
            message:'请输入用户名',
            trigger:'blur'
          },
          {
            min:3,
            max:10,
            message: '用户名长度在3~10个字符之间'
          }
        ],
        password:[
          {
            required:true,
            message:'请输入密码',
            trigger:'blur'
          },
          {
            min:6,
            max:15,
            message: '用户名长度在6~15个字符之间'
          }
        ],
        nickName:[
          {
            required:true,
            message:'请输入昵称',
            trigger:'blur'
          }
        ],
        tel:[
          {
            required:true,
            message:'请输入手机号码',
            trigger:'blur'
          },
          {
            validator:checkTel,
            trigger: 'blur'
          }
            /*validator:function(rule,value,callback){
              if(/^1[34578]\d{9}$/.test(value) == false){
                callback(new Error("请输入正确的手机号"));
              }else{
                callback();
              }
            }, trigger: 'blur'}
*/
        ],
        userAddress:[
          {
            required:true,
            message:'请输入收货地址',
            trigger:'blur'
          }
        ],
      },
      //控制修改用户对话框显示与隐藏
      editDialogVisible:false,
      //查询到的用户信息对象
      editForm:{},
      //修改表单的验证规则对象
      editFormRules:{
        nickName:[
          {
            required:true,
            message:'请输入昵称',
            trigger:'blur'
          }
        ],
        tel:[
          {
            required:true,
            message:'请输入手机号码',
            trigger:'blur'
          },
          {
            validator:checkTel,
            trigger: 'blur'
          }
        ],
        userAddress:[
          {
            required:true,
            message:'请输入收货地址',
            trigger:'blur'
          }
        ]
      }
    }
  },
  created() {
    this.getUserList()
  },
  methods:{
    //获取用户列表
    async getUserList(){
     const {data:res} = await this.$http.get('user',{params:this.queryInfo})
      if(res.code !== 200)
        return this.$message.error(res.msg)

      //为属性赋值
      this.userList = res.data.users//后端传回前端的data集合中的user集合
      this.total = res.data.totalUser//后端传回前端的data集合中的totalUser数
      console.log(res)
     },
    //监听页面内显示数据数量改变的事件
    handleSizeChange(newSize){
      //console.log(newSize)
      this.queryInfo.pageSize = newSize;
      this.getUserList();
    },
    //监听页码值改变的事件
    handleCurrentChange(newPage){
      console.log(newPage)
      this.queryInfo.currentPage = newPage-1;
      this.getUserList();
    },

    //监听Switch状态按钮的改变
    async userStateChanged(userInfo) {
      console.log(userInfo)
      const {data:res} = await this.$http.put('user/${userinfo.id}/state/{userinfo.state}')
      if(res.code != 200){
        userInfo.state = !userInfo.state
        return this.$message.error("更新用户状态失败！")
      }
      this.$message.success("更新用户状态成功！")
    },
    //监听添加用户对话框的关闭重置事件
    addDialogClosed(){
      this.$refs.addFormRef.resetFields();
    },
    //添加新用户
    addUser(){
      this.$refs.addFormRef.validate(async valid=>{
        //预校验
        if (!valid)return
        //可以发起添加用户的网络请求
        const {data:res} = await this.$http.post('addUser',this.addForm)
        if (res.code!== 200){
          return this.$message.error('添加用户失败!')
        }
        this.$message.success('添加用户成功!')
        //隐藏添加用户的对话框
        this.addDialogVisible = false
        //重新获取用户列表数据
        await this.getUserList()
      })
    },
    //展示编辑用户的对话框
    async showEditDialog(userId){
      const {data:res} = await this.$http.get('user/'+userId)
      console.log(res)
      if (res.code!==200){
        return this.$message.error('查询用户信息失败！')
      }

      this.editForm = res.data
      this.editDialogVisible = true
    },
    //监听修改用户对话框的关闭重置事件
    editDialogClosed(){
      this.$refs.editFormRef.resetFields()
    },
    //修改用户信息并提交
    editUserInfo(){
      this.$refs.editFormRef.validate(async valid=>{
        if (!valid) return
        //发起修改用户的数据请求
        const {data:res} = await this.$http.put('editUser/'+this.editForm.userId,{
          nickName: this.editForm.nickName,
          tel: this.editForm.tel,
          userAddress: this.editForm.userAddress
        })
        if (res.code !== 200){
          this.$message.error("修改用户信息失败!")
        }
        //隐藏修改用户信息对话框
        this.editDialogVisible = false
        //重新获取用户列表
        await this.getUserList()
        //提示修改成功
        this.$message.success("修改用户信息成功！")
      })
    },
    //根据ID删除用户
    async deleteUserById(userId){
      //弹框询问是否删除用户
      const confirmResult = await this.$confirm
      ('此操作将永久删除该用户, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).catch(err =>{
        return err
      })
      //如果用户确认删除，则返回值为字符串confirm
      //如果用户取消删除，返回值为字符串cancel
      console.log(confirmResult)
      if (confirmResult!=='confirm'){
        return this.$message.info("已取消删除")
      }
      const {data:res} = await this.$http.delete('delUser/'+userId)
      if (res.code!==200){
        return this.$message.error("删除用户失败！")
      }
      //提示删除成功
      this.$message.success("删除用户成功！")
      //重新加载用户列表
      await this.getUserList()
    }
  }
}
</script>

<style lang="less" scoped>
.el-main{
  background-color: #E9EEF3;
  color: #333;
}
</style>
