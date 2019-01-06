package com.hongghe.algorithmexamples.domain;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author hongghe 2018/8/24
 */
public class ApiResult implements Serializable {

    private static final long serialVersionUID = -6538790659306907877L;

    public Integer code;
    public String msg;
    public Object data;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    ApiResult() {}

    public ApiResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = new Gson().toJson("");
    }

    public ApiResult(ResultConst resultConst) {
        this.code = resultConst.getCode();
        this.msg = resultConst.getMsg();
    }

    public <response> ApiResult(response response) {
        this.code = ResultConst.SUCCESS.getCode();
        this.msg = ResultConst.SUCCESS.getMsg();
        data = new Gson().toJson(response);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
