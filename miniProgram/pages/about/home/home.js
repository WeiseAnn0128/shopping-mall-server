var app=getApp
Component({
  options: {
    addGlobalClass: true,
  },
  data: {
    starCount: 0,
    forksCount: 0,
    visitTotal: 0,

    iconList: [{
      icon: 'pay',
      color: 'green',
      badge: 120,
      name: '待付款',
      url: "/pages/about/order/order?type=0"
    }, {
      icon: 'send',
      color: 'green',
      badge: 1,
      name: '待发货',
      url: "/pages/about/order/order?type=1"
    }, {
      icon: 'deliver',
      color: 'green',
      badge: 0,
      name: '待收货',
      url: "/pages/about/order/order?type=2"
    }, {
      icon: 'comment',
      color: 'green',
      badge: 22,
      name: '待评价',
      url: "/pages/about/order/order?type=3"
    }, {
      icon: 'refund',
      color: 'green',
      badge: 0,
      name: '退款',
      url: "/pages/about/refund/refund"
    }, {
      icon: 'service',
      color: 'green',
      badge: 0,
      name: '售后',
      url: "/pages/about/aftermarket/aftermarket"
    }],
    gridCol:3,
    skin: false
  },
  // attached() {
  //   console.log("success")
  //   let that = this;
  //   wx.showLoading({
  //     title: '数据加载中',
  //     mask: true,
  //   })
  //   let i = 0;
  //   numDH();
  //   function numDH() {
  //     if (i < 20) {
  //       setTimeout(function () {
  //         that.setData({
  //           starCount: i,
  //           forksCount: i,
  //           visitTotal: i
  //         })
  //         i++
  //         numDH();
  //       }, 20)
  //     } else {
  //       that.setData({
  //         starCount: that.coutNum(3000),
  //         forksCount: that.coutNum(484),
  //         visitTotal: that.coutNum(24000)
  //       })
  //     }
  //   }
  //   wx.hideLoading()
  // },
  methods: {
    // coutNum(e) {
    //   if (e > 1000 && e < 10000) {
    //     e = (e / 1000).toFixed(1) + 'k'
    //   }
    //   if (e > 10000) {
    //     e = (e / 10000).toFixed(1) + 'W'
    //   }
    //   return e
    // },
    
    jumpPages(e) {
      wx.navigateTo({
        url: e.currentTarget.dataset.target,
      })
    },
  },
})
