<template>
  <div class="login_container">
    <div class="login_box">
      <!--头像区域-->
      <div class="avatar_box">
        <img src="~@/assets/A.jpg" alt="乃琳~我的乃琳">
      </div>
      <!--登录表单区域-->
      <el-form ref="loginFormRef" :model="loginForm" :rules="loginFormRules" class="login_form"  label-width="0px">
        <!--用户名区域 -->
        <el-form-item prop="username">
          <el-input v-model="loginForm.username" prefix-icon="el-icon-user-solid" ></el-input>
        </el-form-item>
        <!--密码区域-->
        <el-form-item prop="password">
          <el-input v-model="loginForm.password" type="password" prefix-icon="el-icon-lock"></el-input>
        </el-form-item>
        <!--按钮区域-->
        <el-form-item class="btns"  >
          <el-button type="primary" @click="login">登录</el-button>
          <el-button type="info" @click="resetLoginForm">重置</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>

</template>

<script>
export default {
  data(){
    return{
      //这是登录表单的数据绑定对象
      loginForm: {
        username:'admin',
        password:'111111'
      },
      //表单验证规则对象
      loginFormRules:{
        //验证用户名是否合法
        username:[
          {required: true,message:"请输入用户名",trigger:"blur"},
          {min: 5,max: 8,message: '长度在5到8个字符',trigger: "blur"}
        ],
        //验证密码是否合法
        password:[
          { required: true, message: '请输入密码', trigger: 'blur' },
           { min: 6, max: 15, message: '长度在 6 到 15 个字符', trigger: 'blur' }
        ]
      }
    }
  },
  methods:{
    //点击重置按钮，重置登录表单
    resetLoginForm(){
      console.log(this)
      this.$refs.loginFormRef.resetFields();
    },
    //登录预验证
    login(){
      this.$refs.loginFormRef.validate(async valid=>{
        console.log(valid)
        if(!valid) return;
        //获取到的data命名为res
        /*const result =await this.$http.post("login",this.loginForm);
        console.log(result)*/
        const {data: res } =await this.$http.post("login",this.loginForm);
        console.log(res)
        //弹窗提示
        if (res.code !== 200) return this.$message.error("登录失败！账号或密码错误")
        this.$message.success("登录成功!");
        //存储token
        window.sessionStorage.setItem("token",res.data.token);
        /**
         * 跳转到home页面
         */

        this.$router.push('/home');
      })
    }
  }

}

</script>

<style lang="less" scoped>
.login_container{
  background-color: #576690;
  height: 100%;
}
.login_box {
  width: 450px;
  height: 300px;
  border-radius: 5px;
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
  background-color: #fff;
  .avatar_box {
    height: 130px;
    width: 130px;
    border: 1px solid #fff;
    border-radius: 50%;
    padding: 10px;
    box-shadow: 0 0 10px #ddd;
    position: absolute;
    left: 50%;
    transform: translate(-50%,-50%);
    background-color: #fff;
    img{
      width: 100%;
      height: 100%;
      border-radius:50% ;
    }
  }
}
.login_form{
  position: absolute;
  bottom: 0;
  width: 100%;
  padding: 0 20px; //左右间距
  box-sizing: border-box;//输入框超出盒子
}
.btns{
  display: flex;
  justify-content: flex-end;

}
/*.el-main {
  top: 100px;
  border-radius: 5px;
  background-color:  #fff;
  color: #333;
  text-align: center;
  line-height: 60px;
}*/

/*body > .el-container {
  margin-bottom: 40px;
}

.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
  line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
  line-height: 320px;
}*/
</style>
