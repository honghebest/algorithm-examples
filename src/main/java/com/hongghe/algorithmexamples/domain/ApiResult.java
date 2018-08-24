package com.hongghe.algorithmexamples.domain;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author hongghe 2018/8/24
 */
public class ApiResult implements Serializable {

    private static final long serialVersionUID = -6538790659306907877L;

    public Integer code = Result.SUCCESS.getCode();
    public String msg = Result.SUCCESS.getMsg();
    public Object data = new HashMap<>();

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

    @Override
    public String toString() {
        return super.toString();
    }
}
