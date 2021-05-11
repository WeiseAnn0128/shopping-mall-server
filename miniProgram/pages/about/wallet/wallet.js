// pages/about/wallet/wallet.js
const network = require('../../../utils/network.js')
Page({

  /**
   * 页面的初始数据
   */
  data: {
    dealTypeNames: ['支出', '收入'],
    detailTypeNames:['余额充值',' 干饭消费','逛街消费', '转账收入','娱乐支出','红包收入','生活服务', '学习支出'],
    balance:"999999999",
    date: '2021-04-23',//默认起始时间  
    date2: '2021-05-24',//默认结束时间 
    pageSize:"",
    pageNumber:"",

    array: ['全部', '支出', '收入'],
    objectArray: [
      {
        id: 0,
        name: '全部'
      },
      {
        id: 1,
        name: '支出'
      },
      {
        id: 2,
        name: '收入'
      },
     
    ],
    index: 0,
    items: []
  },
  bindPickerChange: function(e) {
    console.log('picker发送选择改变，携带值为', e.detail.value)
    this.setData({
      index: e.detail.value
    })
    this.selectDetail();
  },

  // 时间段选择  
  bindDateChange(e) {
    let that = this;
    console.log(e.detail.value)
    that.setData({
      date: e.detail.value,
    })
    this.selectDetail();
  },
  bindDateChange2(e) {
    let that = this;
    that.setData({
      date2: e.detail.value,
    })
    this.selectDetail();

},
selectDetail:function(res){
  network.request("system/wallet_detail/listWechat?pageNum=1&pageSize=10&params%5BbeginTime%5D=" + this.data.date + "&params%5BendTime%5D=" + this.data.date2 + " 23:59:59" + "&dealType=" + (this.data.index == 0 ? '' : this.data.index - 1),{},(res)=>{
    this.setData({
      items:res.rows,
    }) 
  },"GET",true)
},

  jumpPages(e) {
    wx.navigateTo({
      url: e.currentTarget.dataset.target,
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.selectDetail();
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})