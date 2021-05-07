
var app=getApp()

Page({
 
  /**
   * 页面的初始数据
   */
  data: {
    currtab: 0,
    swipertab: [
      { name: '全部', index: 0 }, { name: '待付款', index: 1 }, { name: '待发货', index: 2 }, { name: '待收货', index: 3 }, { name: '待评价', index: 4}],
    
    Order: [
      { name: "精品手表帅气男士商务透气", state: "卖家已发货", description: "二手JavaWeb程序设计任务教程黑马程序员", status: "未开始", url: "https://img1.baidu.com/it/u=4198812456,3069022139&fm=26&fmt=auto&gp=0.jpg", money: "122" ,goToUrl: "/pages/about/comment/comment?type=0"},
      { name: "精品手表帅气男士商务透气", state: "卖家已发货", description: "二手JavaWeb程序设计任务教程黑马程序员", status: "未开始", url: "https://img1.baidu.com/it/u=4198812456,3069022139&fm=26&fmt=auto&gp=0.jpg", money: "122",goToUrl: "/pages/about/comment/comment?type=1" }
    ],
  
  },
  goToPages(e) {
    wx.navigateTo({
      url: e.currentTarget.dataset.target,
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
 
  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    // 页面渲染完成
    this.getDeviceInfo()
    this.orderShow()
  },
 
  getDeviceInfo: function () {
    let that = this
    wx.getSystemInfo({
      success: function (res) {
        that.setData({
          deviceW: res.windowWidth,
          deviceH: res.windowHeight
        })
      }
    })
  },
 
  /**
  * @Explain：选项卡点击切换
  */
  tabSwitch: function (e) {
    var that = this
    if (this.data.currtab === e.target.dataset.current) {
      return false
    } else {
      that.setData({
        currtab: e.target.dataset.current
      })
    }
  },
 
  tabChange: function (e) {
    this.setData({ currtab: e.detail.current })
    this.orderShow()
  },
 
  orderShow: function () {
    let that = this
    switch (this.data.currtab) {
      case 0:       
        //全部
        that.totalShow()
        break
      case 1:
        //待付款
        that.waitPayShow()
        break
      case 2:
      //待发货     
        that.waitSend()
        break
      case 3:
        //待收货
        that.waitReceive()
        break
      case 4:
        //待评价
        that.waitEvaluate()
        break

    }
  },
  totalShow: function(e){
    this.setData({

    })   
  },
 
  waitPayShow:function(e){
    this.setData({

    })
  },
 
  waitSend: function () {
    this.setData({
      Order: [{ name: "精品手表帅气男士商务透气", state: "卖家已发货", description: "二手JavaWeb程序设计任务教程黑马程序员", status: "未开始", url: "https://img1.baidu.com/it/u=4198812456,3069022139&fm=26&fmt=auto&gp=0.jpg", money: "122" }],
    })
  },

  waitReceive: function () {
    this.setData({
     
    })
  },

  waitEvaluate: function () {
    this.setData({
    })
  },
  
})
