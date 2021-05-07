// pages/msg/detailmsg/detailmsg.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    showtitle: '',
    showtime: '',
    showtext: '',
    showList:[
      {title:'需要小蜜为您服务吗', time: '10:00', text:' 小蜜为您服务'},
      {title:'菜鸟', time: '10:00', text:' 您的快递已经到达附近驿站'},
      {title:'交易物流', time: '10:00', text:' very good3'},
      {title:'活动优惠', time: '10:00', text:' very good4'},
      {title:'淘金币', time: '10:00', text:' very good5'},
      {title:'团队', time: '10:00', text:' very good6'}
    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var contacts = options.contacts;

    this.setData({
      showtitle: this.data.showList[contacts].title,
      showtime: this.data.showList[contacts].time,
      showtext: this.data.showList[contacts].text
    })
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