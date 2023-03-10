package com.fly.micro.mall.commons.core.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author <a href="mailto:fteng1024@gmail.com"> tengfei
 * @since 2023/3/7
 */
@Getter
@Setter
@NoArgsConstructor
public class ResultVO<T> implements Serializable {
    
    /**
     * 数据
     */
    private T data;
    
    /**
     * 状态码
     */
    private int code;
    
    /**
     * 状态信息
     */
    private String msg;
    
    public ResultVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    
    public ResultVO(int code, String msg) {
        this(code, msg, null);
    }
    
    public ResultVO(StatusCode statusCode, T data) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = data;
    }
    
    public ResultVO(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = null;
    }
    
    
    /**
     * 请求成功，无数据返回
     *
     * @return {@link  ResultVO}
     */
    public static <T> ResultVO<T> success() {
        return new ResultVO<>(ResultCode.SUCCESS);
    }
    
    /**
     * 请求成功，有数据返回
     *
     * @param data 要返回的数据
     * @return {@link ResultVO }
     */
    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(ResultCode.SUCCESS, data);
    }
    
    /**
     * 请求失败，无数据返回
     *
     * @return {@link  ResultVO}
     */
    public static <T> ResultVO<T> fail() {
        return new ResultVO<>(ResultCode.FAILED);
    }
    
    /**
     * 请求失败，自定义状态码和描述信息
     *
     * @param code 状态码
     * @param msg  状态描述信息
     * @return {@link  ResultVO}
     */
    public static <T> ResultVO<T> fail(int code, String msg) {
        return new ResultVO<>(code, msg);
    }
    
    /**
     * 请求失败，业务自定义状态枚举
     *
     * @param statusCode {@link  StatusCode}
     * @return {@link  ResultVO}
     */
    public static <T> ResultVO<T> fail(StatusCode statusCode) {
        return new ResultVO<>(statusCode);
    }
    
}
