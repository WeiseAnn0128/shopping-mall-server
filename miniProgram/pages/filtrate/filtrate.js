// miniProgram/pages/filtrate/filtrate.js
const App = getApp()
Page({
    data: {
    specialId: '',
    query: ['颜色','红色'], 
    searchList: [
      {
        type: 'radio',
        screenKey: '颜色',
        screenValue: ['红色','黑色','黄色']
      },
      {
        type: 'radio',
        screenKey: '大小',
        screenValue: ['大', '中', '小']
      },
      {
        type: 'checkbox',
        screenKey: '尺码',
        screenValue: [
          '36',
          '36.5',
          '37',
          '37.5'
         
        ]
      }
    ] 
    },
    onLoad: function(options) {
      console.log(options)
      this.getSearchItems()
    },
    // 获取搜索选项
    getSearchItems() {
      const _this = this
      const searchItems = this.data.searchList.map(n => {
        return Object.assign({}, n, {
          screenValue: n.screenValue.map(m =>
            Object.assign(
              {},
              {
                checked: _this.data.query.includes(m), 
                value: m
              }
            )
          )
        })
      })
      this.setData({
        searchList: searchItems
      })
    },
   // 点击选项
    onChange(e) {
      const { parentIndex, item, index } = e.currentTarget.dataset
      // 如果选中状态
      if (item.screenValue[index].checked) {
        item.screenValue[index].checked = false 
      } else {
        if (item.type != 'checkbox') {

          item.screenValue.map(n => (n.checked = false))
        }
        // 将点击的设置为选中
        item.screenValue[index].checked = true
      }
      this.setData({
        [`searchList[${parentIndex}]`]: item
      })
    },

    //显示抽屉
    powerDrawer: function (e) {
        var currentStatu = e.currentTarget.dataset.statu;
        this.util(currentStatu)
      },
      util: function(currentStatu){
        /* 动画部分 */
        var animation = wx.createAnimation({
          duration: 200,  //动画时长
          timingFunction: "linear", 
          delay: 0  
        });

        this.animation = animation;
        animation.translateX(0).step();
        this.setData({
          animationData: animation.export()
        })
        
        // 设置定时器到指定时候后组动画2
        setTimeout(function () {
          animation.translateX(300).step()
          this.setData({
            animationData: animation
          })
          
          //关闭抽屉
          if (currentStatu == "close") {
            this.setData(
              {
                showModalStatus: false
              }
            );
          }
        }.bind(this), 300)
      
        // 显示抽屉
        if (currentStatu == "open") {
          this.setData(
            {
              showModalStatus: true
            }
          );
        }
      },

  })