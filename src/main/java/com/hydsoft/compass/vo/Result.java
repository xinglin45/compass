package com.hydsoft.compass.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hydsoft.compass.enums.CodeEnum;

/**
 * @author ZHAOZHAOMENG
 * @Date 2019/1/14.
 *  结果集封装类
 */
public class Result<T> {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;
    // 接口返回code
    private int code;
    // 接口返回信息描述
    private String msg;

    public Result() {
        super();
    }

    /**
     * 添加成功结果信息
     */
    public void addOK() {
        this.code = CodeEnum.OK.getCode();
        this.msg = CodeEnum.OK.getDescribe();
    }
    public void addOK(T data) {
        this.data = data;
        this.code = CodeEnum.OK.getCode();
        this.msg = CodeEnum.OK.getDescribe();
    }

    /**
     * 添加错误消息
     * @param codeEnum 具有状态码、描述信息的对象
     */
    public void addError(CodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getDescribe();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
