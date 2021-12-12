<template>
  <div>
    <!--面包屑导航区    -->
    <el-breadcrumb separator-class="el-icon-arrow-right">
      <el-breadcrumb-item :to="{ path: '/home' }">首页</el-breadcrumb-item>
      <el-breadcrumb-item>菜品管理</el-breadcrumb-item>
      <!--      <el-breadcrumb-item>菜品分类</el-breadcrumb-item>-->
    </el-breadcrumb>
    <!--卡片视图区-->
    <el-card>
      <el-row :gutter="20">
        <el-col :span="8">
          <el-input placeholder="请输入内容" v-model="queryInfo.query" clearable @clear="getShopList">
            <el-button slot="append" icon="el-icon-search" @click="getShopList"></el-button>
          </el-input>
        </el-col>
        <el-col :span="4">
          <el-button type="primary" @click="addShopDialogVisible = true">添加菜品</el-button>
        </el-col>
      </el-row>
      <!--      表格区域-->
      <el-table :data="shoplist" border stripe>
        <el-table-column type="index"></el-table-column>
        <el-table-column  label="菜品名" prop="shopName"></el-table-column>
        <el-table-column  label="商家电话" prop="shopTel"></el-table-column>
        <el-table-column  label="开店时间" prop="openTime"></el-table-column>
        <el-table-column  label="操作" width="180px">
          <template slot-scope="scope" >
            <el-tooltip  effect="dark" content="修改菜品" placement="top" :enterable="false">
              <el-button type="primary" icon="el-icon-edit" size="mini" @click="showShopEditDialog(scope.row.shopId)">修改</el-button>
            </el-tooltip>
            <el-tooltip  effect="dark" content="删除菜品" placement="top" :enterable="false">
              <el-button type="danger" icon="el-icon-delete" size="mini" @click="deleteShopById(scope.row.shopId)">删除</el-button>
            </el-tooltip>
          </template>
        </el-table-column>
      </el-table>

      <!--      分页区域-->
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
    <!--添加菜品对话框    -->
    <el-dialog
        title="添加菜品"
        :visible.sync="addShopDialogVisible"
        width="50%"
        @close="addShopDialogClosed">
      <!-- 内容主体区域     -->
      <el-form :model="addShopForm"  ref="addShopFormRef" label-width="80px" >
        <el-form-item label="商家名" prop="shopName">
          <el-input v-model="addShopForm.shopName"></el-input>
        </el-form-item>
        <el-form-item label="商家电话" prop="shopTel">
          <el-input v-model="addShopForm.shopTel"></el-input>
        </el-form-item>


      </el-form>
      <!-- 底部区域     -->
      <span slot="footer" class="dialog-footer">
        <el-button @click="addShopDialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="addShop">确 定</el-button>
      </span>
    </el-dialog>
    <!--修改菜品的对话框 -->
    <el-dialog
        title="修改菜品"
        :visible.sync="editShopDialogVisible"
        width="50%"
        @close="editShopDialogClosed"
    >
      <!--内容主体区域      -->
      <el-form :model="editShopForm" ref="editShopFormRef" label-width="80px">
        <el-form-item label="菜品名" >
          <el-input v-model="editShopForm.shopName" disabled></el-input>
        </el-form-item>
        <el-form-item label="价格" prop="shopTel">
          <el-input v-model="editShopForm.shopTel"></el-input>
        </el-form-item>
      </el-form>
      <!--底部按钮区域      -->
      <span slot="footer" class="dialog-footer">
    <el-button @click="editShopDialogVisible = false">取 消</el-button>
    <el-button type="primary" @click="editShopInfo">确 定</el-button>
  </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: "shop",
  data(){
    return{
      queryInfo:{
        query:'',
        pageSize:5,
        currentPage:1,
      },
      //菜品分类
      shoplist:[],
      total:0,
      //控制添加菜品对话框的显示与隐藏
      addShopDialogVisible:false,
      //添加菜品的表单数据
      addShopForm:{
        shopName:'',
        shopTel:'',
      },
      //控制修改用户对话框显示与隐藏
      editShopDialogVisible:false,
      //查询到的用户信息对象
      editShopForm:{},
    }
  },
  created() {
    this.getShopList()
  },
  methods:{
    //获取菜品分类数据
    async getShopList(){/*categories*/
      const {data:res} = await this.$http.get('shop',{params:this.queryInfo})
      if (res.code!==200)return this.$message.error('获取菜品分类失败')
      this.shoplist = res.data.Shops
      this.total = res.data.totalShop
      console.log(res)
    },
    //监听页面内显示数据数量改变的事件
    handleSizeChange(newSize){
      //console.log(newSize)
      this.queryInfo.pageSize = newSize;
      this.getShopList();
    },
    //监听页码值改变的事件
    handleCurrentChange(newPage){
      console.log(newPage)
      this.queryInfo.currentPage = newPage-1;
      this.getShopList();
    },
    //监听添加用户对话框的关闭重置事件
    addShopDialogClosed(){
      this.$refs.addShopFormRef.resetFields();
    },
    //添加新用户
    addShop(){
      this.$refs.addShopFormRef.validate(async valid=>{
        //预校验
        if (!valid)return
        //可以发起添加用户的网络请求
        const {data:res} = await this.$http.post('addShop',this.addShopForm)
        if (res.code!== 200){
          this.$message.error('添加用户失败!')
        }
        this.$message.success('添加用户成功!')
        //隐藏添加用户的对话框
        this.addShopDialogVisible = false
        //重新获取用户列表数据
        await this.getShopList()
      })
    },
    //展示编辑用户的对话框
    async showShopEditDialog(shopId){
      const {data:res} = await this.$http.get('shop/'+shopId)
      console.log(res)
      if (res.code!==200){
        return this.$message.error('查询菜品信息失败！')
      }

      this.editShopForm = res.data
      this.editShopDialogVisible = true
    },
    //监听修改用户对话框的关闭重置事件
    editShopDialogClosed(){
      this.$refs.editShopFormRef.resetFields()
    },
    //修改用户信息并提交
    editShopInfo(){
      this.$refs.editShopFormRef.validate(async valid=>{
        if (!valid) return
        //发起修改用户的数据请求
        const {data:res} = await this.$http.put('editShop/'+this.editShopForm.shopId,{
          price: this.editShopForm.price,
          material: this.editShopForm.material,
          picture: this.editShopForm.picture
        })
        if (res.code !== 200){
          this.$message.error("修改菜品信息失败!")
        }
        //隐藏修改菜品信息对话框
        this.editshopDialogVisible = false
        //重新获取菜品列表
        await this.getShopList()
        //提示修改成功
        this.$message.success("修改用户信息成功！")
      })
    },
    //根据ID删除用户
    async deleteShopById(shopId){
      //弹框询问是否删除用户
      const confirmResult = await this.$confirm
      ('此操作将永久删除该菜品, 是否继续?', '提示', {
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
      const {data:res} = await this.$http.delete('delShop/'+shopId)
      if (res.code!==200){
        return this.$message.error("删除用户失败！")
      }
      //提示删除成功
      this.$message.success("删除用户成功！")
      //重新加载用户列表
      await this.getShopList()
    }
  }
}
</script>

<style scoped>

</style>
