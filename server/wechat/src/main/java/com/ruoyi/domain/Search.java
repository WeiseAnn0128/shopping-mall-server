package com.ruoyi.domain;

public class Search {

    private int code;// 0，表示 查询成功。-3:快递单号错误 -4:未查询到相对应快递公司或不存在-6:自动查找快递公司失败 -7: 没有查询到相关数据，-9，单号有误，请重新
    //输入,-11:系统错误
    private String reason;// //reason 返回详细的请求状态说明码
    private Result result;
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getReason() {
        return reason;
    }

    public void setResult(Result result) {
        this.result = result;
    }
    public Result getResult() {
        return result;
    }

}