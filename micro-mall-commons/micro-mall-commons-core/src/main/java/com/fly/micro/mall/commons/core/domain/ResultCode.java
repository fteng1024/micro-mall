package com.fly.micro.mall.commons.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author <a href="mailto:fteng1024@gmail.com"> tengfei
 * @since 2023/3/7
 */
@Getter
@AllArgsConstructor
public enum ResultCode implements StatusCode {
    SUCCESS(1000, "请求成功"),
    FAILED(1001, "请求失败"),
    VALIDATE_ERROR(1002, "参数校验失败"),
    RESPONSE_PACK_ERROR(1003, "response返回包装失败");
    
    private Integer code;
    
    private String msg;
}
