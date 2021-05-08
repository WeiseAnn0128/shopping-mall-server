// pages/goods/sumbit/sumbit.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    totalPrice: 0,
    // totalNum: 0,
    address: {
      name:'用户昵称',
      mobile:'188XXXXX888',
      address:'河南省南阳市古桥区',
      street:'XXX路5559号',
    },
    goodsArr:[
      {
        id: '1',
        url:'https://img.alicdn.com/imgextra/https://img.alicdn.com/imgextra/i2/2087981999/O1CN01NUBSd31QdaM7Lp9Yh_!!2087981999.jpg_60x60q90.jpg',
        text:'XX LOVE LINE系列XX款XX钻戒XXXX戒指XXXXXXXXX正品',
        specification:'颜色分类：黑色；尺码：20克拉',
        number:'2',
        price:'30'
      },
      {
        id: '2',
        url:'https://img.alicdn.com/imgextra/https://img.alicdn.com/imgextra/i2/2087981999/O1CN01NUBSd31QdaM7Lp9Yh_!!2087981999.jpg_60x60q90.jpg',
        text:'XX LOVE LINE系列XX款XX钻戒XXXX戒指XXXXXXXXX正品',
        specification:'颜色分类：黑色；尺码：30克拉',
        number:'3',
        price:'40'
      },
      {
        id: '3',
        url:'https://img.alicdn.com/imgextra/https://img.alicdn.com/imgextra/i2/2087981999/O1CN01NUBSd31QdaM7Lp9Yh_!!2087981999.jpg_60x60q90.jpg',
        text:'XX LOVE LINE系列XX款XX钻戒XXXX戒指XXXXXXXXX正品',
        specification:'颜色分类：黑色；尺码：40克拉',
        number:'3',
        price:'50'
      }
    ],

    min: 2,//最少字数
    max: 30, //最多字数 (根据自己需求改变)

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    // 计算总价格
    // var tPrice = 0;
    // this.data.goodsArr.forEach(function(v){
    //    tPrice += parseFloat(v.number) * parseFloat(v.price) 
    // })
    // this.setData({
    //   totalPrice: tPrice
    // })
    let that = this;
    that.calculate(this.data.totalPrice)
  },
  // 数量加
  plusCount: function(e) {
    let goodsArrT = this.data.goodsArr;
    let goodsT = goodsArrT[e.currentTarget.dataset.index];
    goodsT.number++;
    this.setData({
      goodsArr: goodsArrT
    });
    this.calculate(this.data.totalPrice)
  },
 // 数量减
  redCount:function(e){
    let goodsArrR = this.data.goodsArr;
    let goodsR = goodsArrR[e.currentTarget.dataset.index];
    goodsR.number--;
    this.setData({
      goodsArr: goodsArrR
    }); 
    this.calculate(this.data.totalPrice)
  },
 //计算方法
 calculate:function(e){
    var tPrice = 0;
    this.data.goodsArr.forEach(function(v){
       tPrice += parseFloat(v.number) * parseFloat(v.price) 
    })
    this.setData({
         totalPrice: tPrice
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

  },
  inputs: function (e) {
    // 获取输入框的内容
    var value = e.detail.value;
    // 获取输入框内容的长度
    var len = parseInt(value.length);
    //最多字数限制
    if (len > this.data.max) return;
    // 当输入框内容的长度大于最大长度限制（max)时，终止setData()的执行
    this.setData({
      currentWordNumber: len //当前字数
    });
  },

  
})