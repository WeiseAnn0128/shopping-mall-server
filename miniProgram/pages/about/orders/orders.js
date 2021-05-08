// pages/about/orderss/orderss.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    currentData: 0, 
    selectPerson: true,
    Order: [
      {time:"2021-05-07 16.12",url:"https://img.alicdn.com/bao/uploaded/i4/2208714883592/O1CN01qETG9l1cPBK0tzW9M_!!2208714883592.png",title:"常温纯牛奶 250毫升*12盒*2提",desc:"纯牛奶 12盒*2提",package:"包裹x1",money:"88.00",},
      {time:"2021-05-07 16.12",url:"https://img.alicdn.com/bao/uploaded/i4/2208714883592/O1CN01qETG9l1cPBK0tzW9M_!!2208714883592.png",title:"常温纯牛奶 250毫升*12盒*2提",desc:"纯牛奶 12盒*2提",package:"包裹x1",money:"88.00",}
    ],
  },
  goToPages(e) {
    wx.navigateTo({
      url: "/pages/about/comment/comment",
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
  },
  //获取当前滑块的index
  bindchange: function(e) {
    const that = this;
    that.setData({
      currentData: e.detail.current
    })
  },
  //点击切换，滑块index赋值
  checkCurrent: function(e) {
    const that = this;
    if (that.data.currentData === e.target.dataset.current) {
      return false;
    } else {
      that.setData({
        currentData: e.target.dataset.current
      })
    }
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

  },
  tabSelect(e) {
    this.setData({
      TabCur: e.currentTarget.dataset.id,
      scrollLeft: (e.currentTarget.dataset.id-1)*60
    })
  }
})
