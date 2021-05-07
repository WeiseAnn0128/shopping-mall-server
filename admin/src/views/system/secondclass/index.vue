<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="125px">
      <el-form-item label="一级分类编号" prop="cateId">
		<el-select v-model="queryParams.cateId" size="small">
		  <el-option
			v-for="item in cateIdone"
			:key="item.id"
			:label="item.cateName"
			:value="item.cateId"
		  />
		</el-select>
      </el-form-item>
      <el-form-item label="二级分类商品名" prop="name">
        <el-input
          v-model="queryParams.name"
          placeholder="请输入二级分类商品名"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="二级分类商品图片" prop="img">
        <el-input
          v-model="queryParams.img"
          placeholder="请输入二级分类商品图片"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:secondclass:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:secondclass:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:secondclass:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:secondclass:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="secondclassList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="二级分类编号" align="center" prop="id" />
      <el-table-column label="一级分类编号" align="center" prop="cateId" />
      <el-table-column label="二级分类商品名" align="center" prop="name" />
      <el-table-column label="二级分类商品图片" align="center" prop="img" :show-overflow-tooltip="true">
		  <template slot-scope="scope">
			  <!-- <img :src="scope.row.img" height="50px"> -->
			  <span>{{scope.row.img}}</span>
		  </template>

		  
			
	  </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:secondclass:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:secondclass:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改二级分类对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="一级分类编号" prop="cateId">
          <el-input v-model="form.cateId" placeholder="请输入一级分类编号" />
        </el-form-item>
        <el-form-item label="商品名" prop="name">
          <el-input v-model="form.name" placeholder="请输入二级分类商品名" />
        </el-form-item>
        <el-form-item label="商品图片" prop="img">
          <el-input v-model="form.img" placeholder="请输入二级分类商品图片" />
		  
<!-- 		  <el-upload
		    ref="upload"
		    :limit="1"
		    accept=".jpg, .png"
		    :action="upload.url"
		    :headers="upload.headers"
		    :file-list="upload.fileList"
		    :on-progress="handleFileUploadProgress"
		    :on-success="handleFileSuccess"
		    :auto-upload="false">
		    <el-button slot="trigger" size="small" type="primary">选取文件</el-button>
		    <el-button style="margin-left: 10px;" size="small" type="success" :loading="upload.isUploading" @click="submitUpload">上传到服务器</el-button>
		    <div slot="tip" class="el-upload__tip">只能上传jpg/png文件，且不超过500kb</div>
		  </el-upload> -->
		  
		  
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listSecondclass, getSecondclass, delSecondclass, addSecondclass, updateSecondclass, exportSecondclass } from "@/api/system/secondclass";
import { listFirstclass, getFirstclass} from "@/api/system/firstclass";
import { getToken } from "@/utils/auth";
export default {
  name: "Secondclass",
  components: {
  },
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 二级分类表格数据
      secondclassList: [],
	  img:[],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
		//一级分类编号字典
		cateIdone:[],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        cateId: null,
        name: null,
        img: null
      },
	  
	  
	  // 上传参数
	  upload: {
	    // 是否禁用上传
	    isUploading: false,
	    // 设置上传的请求头部
	    headers: {},
	    // 上传的地址
	    url: "",
	    // 上传的文件列表
	    fileList: []
	  },
	  
	  
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
	this.getcateId();
  },
  methods: {
    /** 查询二级分类列表 */
    getList() {
      this.loading = true;
      listSecondclass(this.queryParams).then(response => {
        this.secondclassList = response.rows;
		console.log(this.secondclassList)
        this.total = response.total;
        this.loading = false;
      });
    },
	getcateId(){
		listFirstclass().then(response => {
        this.cateIdone = response.rows;
		});
	},
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        cateId: null,
        name: null,
        img: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加二级分类";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getSecondclass(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改二级分类";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateSecondclass(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSecondclass(this.form).then(response => {
              this.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$confirm('是否确认删除二级分类编号为"' + ids + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delSecondclass(ids);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      const queryParams = this.queryParams;
      this.$confirm('是否确认导出所有二级分类数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return exportSecondclass(queryParams);
        }).then(response => {
          this.download(response.msg);
        })
    },
	
	 
	//点击上传按钮后执行的方法
		 async submitUpload(type) {
	        this.upload.url =
	          process.env.VUE_APP_BASE_API +
	          "/后端接口地址/upload/file?id=" +
	          this.id +
	          "&type=" +
	          type;
	        // 此处在地址中传输了id和type两个参数，可以根据实际需要来更改
	        await this.$refs.upload[type].submit();
	        this.upload.fileList = [];
	      },
	      // 上传用到的http请求方法
	       httpRequest(param) {
	        let fileObj = param.file; // 相当于input里取得的files
	        let fd = new FormData(); 
	        fd.append("file", fileObj); // 文件对象
	
	        let url = this.upload.url;
	        let config = {
	          headers: {
	            "Content-Type": "multipart/form-data",
	            Authorization: "Bearer " + getToken()
	          }
	        };
	        axios.post(url, fd, config).then(res => {
	          if (res.status === 200) {
	            this.getListFile();
	          }
	        });
	      },
	      // 文件上传中处理
	      handleFileUploadProgress(event, file, fileList) {
	        this.loading = this.$loading({
	          lock: true,
	          text: "上传中",
	          background: "rgba(0, 0, 0, 0.7)",
	        });
	        this.upload.isUploading = true;
	      },
	      // 文件上传成功处理
	      handleFileSuccess(response, file, fileList) {
	        this.upload.isUploading = false;
	        this.msgSuccess(response.msg);
	        this.loading.close();
	        this.upload.fileList = [];
	      },
	      //错误处理
	      handleUploadError() {
	        this.$message({
	          type: "error",
	          message: "上传失败",
	        });
	        this.loading.close();
	      }

  
  
  }

};
</script>
