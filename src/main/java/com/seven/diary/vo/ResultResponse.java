package com.seven.diary.vo;

import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

public class ResultResponse implements Serializable{

    private static final long serialVersionUID = -7699468607237990813L;

    private boolean result = true;//true代表请求调用成功，false代表请求异常

    private String code = "00"; // 00代表成功返回，99代表代码异常，输入参数有误

    private String returnMsg; // 提示信息

    private Map<String,Object> returnData= Maps.newHashMap();

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public Map<String, Object> getReturnData() {
        return returnData;
    }

    public void setReturnData(Map<String, Object> returnData) {
        this.returnData = returnData;
    }

}
