// pages/about/address/address.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
  addressList:[]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  for(var i = 0; i<3;i++){
    var address = {}
    address.id = " "+(1+i);
    address.name="沈玉川"+(1+i);
    address.mobile="188888888"+(1+i);
    address.address="河南省商丘市睢阳区"
    address.address=" 郭村镇 55"+(1+i)+"号";
    address.isDefault = false;
    address.checked =false;
    if(i==0){
      address.isDefault = true;
    }
    // this.data.addressList.push(address);
    console.log(address)
    this.data.addressList.push(address);

  }
    this.setData({
    addressList: this.data.addressList
    
    }),
    console.log(options)
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
  clickDefault(e){
    var index = e.currentTarget.dataset.index;
    this.data.addressList.forEach(function(v){
      v.isDefault = false;
    })
    this.data.addressList[index].isDefault = true;
    //默认地址放在第一个
    var address = this.data.addressList.splice(index,1)[0];
    this.data.addressList=[address, ...this.data.addressList];
    //正常地址最后一个更新
    this.setData({
     addressList:this.data.addressList
    })
  },
  //删除点击
  clickDelete(e){
  var index = e.currentTarget.dataset.index;
  this.data.addressList.splice(index,1);
  this.setData({
    addressList: this.data.addressList
    })
  },
//添加点击
  clickAdd(e){
  wx.navigateTo({
    url: '/pages/about/ad-address/ad-address',
  })
  }
})