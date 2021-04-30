// pages/about/order/details/details.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    order:{
    address_List:
      {
        address:{
          province:"河南省",
          city :"鹤壁市",
          district:"淇滨区"
        },
       recipient_formation:"焦玉祥 18237377510",
      }
    ,
    goods_List:
      [
        {
        image:'https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhuitongp2p.com%2Fuploads%2Fallimg%2F202002%2Ffadjke11cjo.jpg&refer=http%3A%2F%2Fhuitongp2p.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1622008678&t=e7103430d141c60f137af2e70d7ba5d7',
        good_name:"苹果12pro max",
        configuration:"A14仿生处理器 三重相机+LiDAR",
        good_num:"x1",
        price:"￥10009.00",
      },
      {
        image:'https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fhuitongp2p.com%2Fuploads%2Fallimg%2F202002%2Ffadjke11cjo.jpg&refer=http%3A%2F%2Fhuitongp2p.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1622008678&t=e7103430d141c60f137af2e70d7ba5d7',
        good_name:"苹果12pro max",
        configuration:"A14仿生处理器 三重相机+LiDAR",
        good_num:"x1",
        price:"￥10009.00",
      }
    ] , 
    total:{
          prices:"￥20018",
          shipping_fee:"￥12",
          Amount_paid:"￥20030"
        },
      order_id:202007201588654321,//订单编号
      creation_time:"2021-04-28 15:11:18",//创建时间
      time_of_payment:"2021-04-28 15:12:37",//付款时间
      delivery_time:"2021-04-29 10:23:36",//发货时间
      mode_of_payment:"微信支付"
    }
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
  tel: function () {
    wx.makePhoneCall({
      phoneNumber:"18237377510",
      success: function(){
        console.log("拨打帅哥电话成功，请谨慎通话！")
      },
      fail: function(){
        console.log("拨号失败，你注定与帅哥无缘！")
      }
    })
  }
})