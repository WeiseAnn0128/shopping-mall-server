const app = getApp();
const network = require('../../../utils/network.js')
Page({
  data: {
    user:{
    },
    // StatusBar: app.globalData.StatusBar,
    // CustomBar: app.globalData.CustomBar,
    // index: null,
    // nickname:'',
    // multiIndex: [0, 0, 0],
    time: '12:01',
    defaultRegion: ['北京市', '北京市', '东城区'],
    now: new Date().format('yyyy-MM-dd')
    // imgList: [],
    // modalName: null,
    // textareaAValue: '',
    // textareaBValue: ''
  },
  onLoad: function () {
    var that=this
    
    network.request('system/user/getloginUser', {}, function(res) {
      console.log(res)
      console.log(res.data.nickName)
      if (!res.data.province || !res.data.city || !res.data.district) {
        res.data.province = that.data.defaultRegion[0];
        res.data.city = that.data.defaultRegion[1];
        res.data.district = that.data.defaultRegion[2];
      }
      if (!res.data.birthday) {
        res.data.birthday = new Date().format('yyyy-MM-dd');
      }
      that.setData({
        user:res.data
      })
    }, 'GET', true);
  },
  PickerChange(e) {
    console.log(e);
    this.setData({
      index: e.detail.value
    })
  },
 

  MultiColumnChange(e) {
    let data = {
      multiArray: this.data.multiArray,
      multiIndex: this.data.multiIndex
    };
    data.multiIndex[e.detail.column] = e.detail.value;

    this.setData(data);
  },
  TimeChange(e) {
    this.setData({
      time: e.detail.value
    })
  },
  DateChange(e) {
    this.setData({
      'user.birthday': e.detail.value
    })
  },
  RegionChange: function(e) {
    console.log(e.detail.value)
    this.setData({
      'user.province': e.detail.value[0],
      'user.city': e.detail.value[1],
      'user.district': e.detail.value[2]
    })
  },
  ChooseImage() {
    wx.chooseImage({
      sizeType: ['original', 'compressed'], //可以指定是原图还是压缩图，默认二者都有
      sourceType: ['album'], //从相册选择
      success: (res) => {
        if (this.data.imgList.length != 0) {
          this.setData({
            imgList: this.data.imgList.concat(res.tempFilePaths)
          })
        } else {
          this.setData({
            imgList: res.tempFilePaths
          })
        }
      }
    });
  },
  ViewImage(e) {
    wx.previewImage({
      urls: this.data.imgList,
      current: e.currentTarget.dataset.url
    });
  },
  DelImg(e) {
    wx.showModal({
      title: '亲爱的顾客',
      content: '确定要删除吗？',
      cancelText: '再看看',
      confirmText: '再见',
      success: res => {
        if (res.confirm) {
          this.data.imgList.splice(e.currentTarget.dataset.index, 1);
          this.setData({
            imgList: this.data.imgList
          })
        }
      }
    })
  },
  textareaAInput(e) {
    this.setData({
      textareaAValue: e.detail.value
    })
  },
  textareaBInput(e) {
    this.setData({
      textareaBValue: e.detail.value
    })
  },
  changeAvatar:function (){
    var that=this;
    wx.chooseImage({
        count: 1, // 默认9
        sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有
        sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有
        success: function (res) {     
            // 返回选定照片的本地文件路径列表，tempFilePath可以作为img标签的src属性显示图片
            var avatarSrc = res.tempFilePaths
            wx.uploadFile({
                url: 'https://product.fishqc.com/User/Profile/upImg',
                filePath: res.tempFilePaths[0],
                name: 'avatar',
                formData: { avatar: avatarSrc}, // HTTP 请求中其他额外的 form data
                header: {
                    // 'content-type': 'application/x-www-form-urlencoded', // 默认值
                    'skey': wx.getStorageSync('getstoreskey')
                },
                success: function (info) {
                    console.log(info,'info')
                    if (JSON.parse(info.statusCode)=="200"){
                        that.setData({
                            'UserInfodata.image': JSON.parse(info.data).data.image,
                            'Headimg': JSON.parse(info.data).data.image
                        });
                    }
                }
            })
        }
    })
},
formSubmit:function(e){
  var a=e.detail.value
 
  this.setData({
    'user.nickName':a.nickName,
    'user.sex':a.sex,
    'user.phonenumber':a.phone,
    'user.signature':a.qianming,
    'user.birthday':a.birthday,
    // 'user.avatar':a.avatar,
    'user.province':a.province,
    'user.city':a.city,
    'user.district':a.district
  })
  network.request('system/user/edit1', this.data.user, function(res) {
  }, 'put', true);
},
})

