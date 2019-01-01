package com.hongghe.algorithmexamples.domain;

import javax.annotation.Nullable;

/**
 * @author hongghe 2019/1/1
 */
public final class Result<T> {

    private final int ret;
    private final String msg;
    private final T data;

    private Result(int ret, @Nullable String msg, @Nullable T data) {
        this.ret = ret;
        this.msg = msg;
        this.data = data;
    }

    public int ret() {
        return ret;
    }

    public String msg() {
        return msg;
    }

    public T data() {
        return data;
    }

    public int getRet() {
        return ret;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public static <Response> Result<Response> of(int ret, String msg, Response data) {
        return new Result<>(ret, msg, data);
    }

    public static <Response> Result<Response> of(int ret, String msg) {
        return new Result<>(ret, msg, null);
    }

}
