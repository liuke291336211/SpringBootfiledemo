package com.file.test.util;

/*
 * 统一接口返回model
 * */
public class Result<T> {

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /* 异常码 */
    private long code;
    /*异常消息*/
    private String msg;
    /*具体内容*/
    private  T data;

}
