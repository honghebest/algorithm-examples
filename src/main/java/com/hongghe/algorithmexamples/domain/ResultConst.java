package com.hongghe.algorithmexamples.domain;

/**
 * @author hongghe 2018/8/24
 */
public enum ResultConst {

    ERROR(-2, "error"),
    FAIL(-1, "fail"),
    SUCCESS(0, "success");

    private Integer code;
    private String msg;

    ResultConst() {}

    ResultConst(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "";
    }
}
