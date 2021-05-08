// components/swiper-gg/swiper-gg.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    gonggao: {   //navbarData   由父页面传递的数据，变量名字自命名
      type: Array,//这是传过来数据的类型
      value:[],//初始值
      // async observer(newVal, oldVal) { 
      // }//要执行的函数
    },
  },

  /**
   * 组件的初始数据
   */
  data: {
    show_notice:false,
    show_hover:false
  },

  /**
   * 组件的方法列表
   */
  methods: {
    fshow_notice:function(){
      this.setData({
        show_hover:!this.data.show_hover,
        show_notice:!this.data.show_notice
      })
    }
  }
})
