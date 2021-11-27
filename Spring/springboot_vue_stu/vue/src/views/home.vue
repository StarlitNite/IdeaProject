<template>
  <el-container class="home-container">
<!-- 头部区域-->
    <el-header>
      <div>
        <img src="~@/assets/home01.jpg" alt="">
        <span>枝江订餐后台管理系统</span>
      </div>
      <el-button type="info" @click="logout">退出</el-button>
    </el-header>
<!--页面主体区域 -->
    <el-container>
      <!--侧边栏-->
      <el-aside width="200px">
        <!--侧边栏菜单区域-->
        <el-menu background-color="#545c64" text-color="#fff" active-text-color="#409EFF" unique-opened :router="true" :default-active="activePath">
          <!--一级菜单-->
          <el-submenu :index="item.menuId + ''" v-for="item in menulist" :key="item.menuId">
          <!--一级菜单的模板区-->
          <template slot="title">
            <!--图标-->
            <i :class="iconslist[item.menuId]"></i>
            <!--文本-->
            <span>{{item.authName}}</span>
          </template>
          <!--二级菜单-->
<!--          subItem.path 侧边栏跳转路由-->
            <el-menu-item :index="'/'+subItem.path" v-for="subItem in item.children" :key="subItem.menuId" @click="saveNavState('/'+subItem.path)">
              <template slot="title">
                  <!--图标-->
                  <i class="el-icon-location"></i>
                  <span>{{subItem.authName}}</span>
                </template>
            </el-menu-item>
          </el-submenu>



        </el-menu>
      </el-aside>
      <!--右侧内容主体-->
      <el-main>
<!--        路由占位符-->
        <router-view></router-view>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
export default {
  name: "home",
  data(){
    return{
      //左侧菜单数据
      menulist:[],
      iconslist:{
        1:'el-icon-s-custom',
        2:'el-icon-food',
        3:'el-icon-price-tag',
        4:'el-icon-shopping-cart-2'
      },
      //被激活的链接地址
      activePath:'',
    }
  },
  created() {
    this.getMenuList()
    this.activePath = window.sessionStorage.getItem('activePath')
    },
  methods:{
    logout(){//退出登录
      window.sessionStorage.clear()
      this.$router.push("/login")
    },
    //获取菜单列表
    async getMenuList() {
      const {data:res} =await this.$http.get('menus')//用户列表接口
      if(res.code !== 200)
        return this.$message.error(res.msg)
      this.menulist = res.data
      console.log(res)
    },
    //保存链接的激活状态
    saveNavState(activePath){
      window.sessionStorage.setItem('activePath',activePath)
    }
  },
}
</script>

<style lang="less" scoped >
//home-container 占满全屏
.home-container{
  height: 100%;
}
.el-header, .el-footer {
  background-color: #B3C0D1;
  display: flex;
  justify-content: space-between;
  padding-left: 0;
  align-items: center;
  color: #576690;
  text-align: center;
  line-height: 60px;

  >div{
    display: flex;
    align-items: center;
    span{
      margin-left: 15px;
    }
    img{
      width: 65px;
      height: 100%;
    }
  }
}

.el-aside {
  background-color: #D3DCE6;
  color: #333;
  text-align: center;
  line-height: 200px;
  .el-menu{
    border-right: none;
  }
}

.el-main {
  background-color: #9ac8e2;
  color: #333;
}

body > .el-container {
  margin-bottom: 40px;
}

.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
  line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
  line-height: 320px;
}
</style>
