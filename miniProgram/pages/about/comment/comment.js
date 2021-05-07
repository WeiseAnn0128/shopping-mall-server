// pages/about/comment/comment.js
Page({
  data: {
    imgList: [],
    scroll: -1
  },
  inputs: function (e) {
    
  },
  scrollSteps(e) {
    this.setData({
      scroll: this.data.scroll == 4 ? -1: this.data.scroll + 1
    })
  },

  ChooseImage() {
    wx.chooseImage({
      count: 9, //默认9
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
  DelImg(e){
    wx.showModal({
      title: '提示',
      content: '确定要删除吗？',
      cancelColor: 'green',
      success:res=>{
        if(res.confirm)
        this.data.imgList.splice(e.currentTarget.dataset.index,1);
        this.setData({
          imgList:this.data.imgList
        })
      }
    })
  }
})