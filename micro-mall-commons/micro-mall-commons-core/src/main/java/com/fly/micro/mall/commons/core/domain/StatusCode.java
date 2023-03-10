package com.fly.micro.mall.commons.core.domain;

/**
 * HTTP返回结果顶层接口
 *
 * @author <a href="mailto:fteng1024@gmail.com"> tengfei
 * @since 2023/3/7
 */
public interface StatusCode {
    
    /**
     * 获取状态码
     *
     * @return 状态码
     */
    Integer getCode();
    
    /**
     * 获取描述信息
     *
     * @return 描述信息
     */
    String getMsg();
    
}
