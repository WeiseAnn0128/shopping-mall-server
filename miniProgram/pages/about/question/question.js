// pages/about/question/question.js
const network = require('../../../utils/network.js')
Page({
  /**
   * 页面的初始数据
   */
  data: {
    searchValue : '',
    QuestionAndAnswerList : [],
  },

  selectQuestion:function(res){
    network.request("system/information/listwechat?question=" + this.data.searchValue,{},(res)=>{
      let rowT = res.rows;
      for (let index = 0; index < rowT.length; index++) {
        const element = rowT[index];
        element.initFlg = true;
      }
      this.setData({
        searchValue : '',
        QuestionAndAnswerList: rowT,
      }) 
    },"GET",true);
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.selectQuestion();
  },
  
  searchIcon: function(e){
    this.data.searchValue = e.detail.value;
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