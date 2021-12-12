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
          <el-input placeholder="请输入内容" v-model="queryInfo.query" clearable @clear="getFoodList">
            <el-button slot="append" icon="el-icon-search" @click="getFoodList"></el-button>
          </el-input>
        </el-col>
        <el-col :span="4">
          <el-button type="primary" @click="addFoodDialogVisible = true">添加菜品</el-button>
        </el-col>
      </el-row>
<!--      表格区域-->
      <el-table :data="foodlist" border stripe>
        <el-table-column type="index"></el-table-column>
        <el-table-column  label="菜品名" prop="foodName"></el-table-column>
        <el-table-column  label="价格" prop="price"></el-table-column>
        <el-table-column  label="菜品介绍" prop="material"></el-table-column>
        <el-table-column  label="预览图" prop="picture"></el-table-column>
        <el-table-column  label="所属店家" prop="shopName"></el-table-column>

        <el-table-column  label="操作" width="180px">
          <template slot-scope="scope" >
            <el-tooltip  effect="dark" content="修改菜品" placement="top" :enterable="false">
              <el-button type="primary" icon="el-icon-edit" size="mini" @click="showFoodEditDialog(scope.row.foodId)">修改</el-button>
            </el-tooltip>
            <el-tooltip  effect="dark" content="删除菜品" placement="top" :enterable="false">
              <el-button type="danger" icon="el-icon-delete" size="mini" @click="deleteFoodById(scope.row.foodId)">删除</el-button>
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
        :visible.sync="addFoodDialogVisible"
        width="50%"
        @close="addFoodDialogClosed">
      <!-- 内容主体区域     -->
      <el-form :model="addFoodForm"  ref="addFoodFormRef" label-width="80px" >
        <el-form-item label="菜品名" prop="foodName">
          <el-input v-model="addFoodForm.foodName"></el-input>
        </el-form-item>
        <el-form-item label="价格" prop="price">
          <el-input v-model="addFoodForm.price"></el-input>
        </el-form-item>
        <el-form-item label="菜品介绍" prop="material">
          <el-input v-model="addFoodForm.material"></el-input>
        </el-form-item>
        <el-form-item label="预览图" prop="picture">
          <el-input v-model="addFoodForm.picture"></el-input>
        </el-form-item>

      </el-form>
      <!-- 底部区域     -->
      <span slot="footer" class="dialog-footer">
        <el-button @click="addFoodDialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="addFood">确 定</el-button>
      </span>
    </el-dialog>
    <!--修改菜品的对话框 -->
    <el-dialog
        title="修改菜品"
        :visible.sync="editFoodDialogVisible"
        width="50%"
        @close="editFoodDialogClosed"
    >
      <!--内容主体区域      -->
      <el-form :model="editFoodForm" ref="editFoodFormRef" label-width="80px">
        <el-form-item label="菜品名" >
          <el-input v-model="editFoodForm.foodName" disabled></el-input>
        </el-form-item>
        <el-form-item label="价格" prop="price">
          <el-input v-model="editFoodForm.price"></el-input>
        </el-form-item>
        <el-form-item label="菜品介绍" prop="material">
          <el-input v-model="editFoodForm.material"></el-input>
        </el-form-item>
        <el-form-item label="预览图" prop="picture">
          <el-input v-model="editFoodForm.picture"></el-input>
        </el-form-item>
      </el-form>
      <!--底部按钮区域      -->
      <span slot="footer" class="dialog-footer">
    <el-button @click="editFoodDialogVisible = false">取 消</el-button>
    <el-button type="primary" @click="editFoodInfo">确 定</el-button>
  </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: "food",
  data(){
    return{
      queryInfo:{
        query:'',
        pageSize:5,
        currentPage:1,
      },
      //菜品分类
      foodlist:[],
      total:0,
      //控制添加菜品对话框的显示与隐藏
      addFoodDialogVisible:false,
      //添加菜品的表单数据
      addFoodForm:{
        foodName:'',
        price:'',
        material:'',
        picture:''
      },
      //控制修改用户对话框显示与隐藏
      editFoodDialogVisible:false,
      //查询到的用户信息对象
      editFoodForm:{},
    }
  },
  created() {
   this.getFoodList()
  },
  methods:{
    //获取菜品分类数据
  async getFoodList(){/*categories*/
      const {data:res} = await this.$http.get('food',{params:this.queryInfo})
      if (res.code!==200)return this.$message.error('获取菜品分类失败')
      this.foodlist = res.data.foods
      this.total = res.data.totalFood
      console.log(res)
  },
    //监听页面内显示数据数量改变的事件
    handleSizeChange(newSize){
      //console.log(newSize)
      this.queryInfo.pageSize = newSize;
      this.getFoodList();
    },
    //监听页码值改变的事件
    handleCurrentChange(newPage){
      console.log(newPage)
      this.queryInfo.currentPage = newPage-1;
      this.getFoodList();
    },
    //监听添加用户对话框的关闭重置事件
    addFoodDialogClosed(){
      this.$refs.addFoodFormRef.resetFields();
    },
    //添加新用户
    addFood(){
      this.$refs.addFoodFormRef.validate(async valid=>{
        //预校验
        if (!valid)return
        //可以发起添加用户的网络请求
        const {data:res} = await this.$http.post('addFood',this.addFoodForm)
        if (res.code!== 200){
          this.$message.error('添加用户失败!')
        }
        this.$message.success('添加用户成功!')
        //隐藏添加用户的对话框
        this.addFoodDialogVisible = false
        //重新获取用户列表数据
        await this.getFoodList()
      })
    },
    //展示编辑用户的对话框
    async showFoodEditDialog(foodId){
      const {data:res} = await this.$http.get('food/'+foodId)
      console.log(res)
      if (res.code!==200){
        return this.$message.error('查询菜品信息失败！')
      }

      this.editFoodForm = res.data
      this.editFoodDialogVisible = true
    },
    //监听修改用户对话框的关闭重置事件
    editFoodDialogClosed(){
      this.$refs.editFoodFormRef.resetFields()
    },
    //修改用户信息并提交
    editFoodInfo(){
      this.$refs.editFoodFormRef.validate(async valid=>{
        if (!valid) return
        //发起修改用户的数据请求
        const {data:res} = await this.$http.put('editFood/'+this.editFoodForm.foodId,{
          price: this.editFoodForm.price,
          material: this.editFoodForm.material,
          picture: this.editFoodForm.picture
        })
        if (res.code !== 200){
          this.$message.error("修改菜品信息失败!")
        }
        //隐藏修改菜品信息对话框
        this.editFoodDialogVisible = false
        //重新获取菜品列表
        await this.getFoodList()
        //提示修改成功
        this.$message.success("修改用户信息成功！")
      })
    },
    //根据ID删除用户
    async deleteFoodById(foodId){
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
      const {data:res} = await this.$http.delete('delFood/'+foodId)
      if (res.code!==200){
        return this.$message.error("删除用户失败！")
      }
      //提示删除成功
      this.$message.success("删除用户成功！")
      //重新加载用户列表
      await this.getFoodList()
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
