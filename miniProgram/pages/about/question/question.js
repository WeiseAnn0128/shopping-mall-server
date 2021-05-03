// pages/about/question/question.js
Page({
  /**
   * 页面的初始数据
   */
  data: {
    QuestionAndAnswerList : [
      {
        question:"什么是微信小程序？",
        answer:"小程序是一种新的开放能力,您公司开发人员可以快速开发一个小程序。用户不需要下载安装即可在微信内快捷的使用该小程序的服务(如小程序摩拜单车、肯德基+等)。",
        flg:false,
        initFlg : true,
        animation:"",
      },
      {
        question:"什么是微信小程序？",
        answer:"小程序是一种新的开放能力,您公司开发人员可以快速开发一个小程序。用户不需要下载安装即可在微信内快捷的使用该小程序的服务(如小程序摩拜单车、肯德基+等)。",
        flg:false,
        initFlg : true,
        animation:"",
      },
      {
        question:"什么是微信小程序？",
        answer:"小程序是一种新的开放能力,您公司开发人员可以快速开发一个小程序。用户不需要下载安装即可在微信内快捷的使用该小程序的服务(如小程序摩拜单车、肯德基+等)。",
        flg:false,
        initFlg : true,
        animation:"",
      },
      {
        question:"什么是微信小程序？",
        answer:"小程序是一种新的开放能力,您公司开发人员可以快速开发一个小程序。用户不需要下载安装即可在微信内快捷的使用该小程序的服务(如小程序摩拜单车、肯德基+等)。",
        flg:false,
        initFlg : true,
        animation:"",
      }
    ],
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
  
  /**
   * 旋转
   */
  rotate: function() {

  },

  hit:function(e) {
    let index = e.currentTarget.dataset.index;
    let _QuestionAndAnswerList = this.data.QuestionAndAnswerList;
    let animation = _QuestionAndAnswerList[index].animation;
    let _flg = _QuestionAndAnswerList[index].flg;
    _QuestionAndAnswerList[index].flg = !_flg;
    _QuestionAndAnswerList[index].initFlg = false;

    animation = wx.createAnimation({
      duration:200,//旋转速度毫秒，数值越小速度越快
      timingFunction: 'linear',
    });
    if (_flg) {
      animation.rotate(0).step();
    } else {
      animation.rotate(180).step();
    }
    _QuestionAndAnswerList[index].animation = animation.export();
    this.setData({
      QuestionAndAnswerList : _QuestionAndAnswerList
    })
  },
})