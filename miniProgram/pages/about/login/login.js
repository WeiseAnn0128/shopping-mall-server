const network = require('../../../utils/network.js')
let self;
Page({
  data: {
    // motto: '获取成功返回',
    // flg : false,
    userInfo: {},
    hasUserInfo: false,
    code: "",
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    canIUseGetUserProfile: false,
    canIUseOpenData:false // 如需尝试获取用户信息可改为false  wx.canIUse('open-data.type.userAvatarUrl') && wx.canIUse('open-data.type.userNickName') 
  },
  // 事件处理函数
  bindViewTap() {
    wx.navigateTo({
      url: '../about/home/home'
    })
  },

  userLogin:function(){
    //1、调用获取用户信息接口
    wx.getUserProfile({
      desc: '用于完善用户资料',
      success:(res)=> { 
        console.log(res.userInfo)
          this.setData({
            userInfo:res.userInfo,
            hasUserInfo:true
          }),
          network.request('wechat/updateUserInfo', res.userInfo, function(data) {
            console.log(data)
          }, 'post', true);
      },
      fail: res =>{
      //拒绝授权
      wx.showToast({
        title: '您拒绝了授权',
        icon:'none'
      })
      return;
      }
    
    })
 },


  onLoad() {
    self = this;
    if (wx.getUserProfile) {
      this.setData({
        canIUseGetUserProfile: true,
        
      })
    }
    this.refreshCode();
  }, 
  refreshCode: function() {
    wx.login({
      success: function (r) {
        self.setData({
          code : r.code//登录凭证
        })
      }
    })
  },
  getUserProfile(e) {
    // 推荐使用wx.getUserProfile获取用户信息，开发者每次通过该接口获取用户个人信息均需用户确认，开发者妥善保管用户快速填写的头像昵称，避免重复弹窗
    wx.getUserProfile({
      desc: '展示用户信息', // 声明获取用户个人信息后的用途，后续会展示在弹窗中，请谨慎填写
      success: (res) => {
        console.log(res)
        this.setData({
          iv : res.iv,
          encryptedData : res.encryptedData,
          userInfo: res.userInfo,
          hasUserInfo: true,
          
        })
      }
    })
  },
})