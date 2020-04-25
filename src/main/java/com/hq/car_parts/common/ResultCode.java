package com.hq.car_parts.common;

/**
 * 枚举了一些常用API操作码
 * Created by macro on 2019/4/19.
 */

public enum ResultCode implements IErrorCode {
    SUCCESS(true,200, "操作成功"),
    FAILED(false,500, "操作失败"),
    VALIDATE_FAILED(false,404, "参数检验失败"),
    UNAUTHORIZED(false,401, "暂未登录或token已经过期.."),
    FORBIDDEN(false,403, "没有相关权限");
    private long code;
    private String message;
    private boolean flag;

    private ResultCode(boolean flag,long code, String message) {
        this.code = code;
        this.message = message;
        this.flag = flag;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Boolean getFlag() {
        return flag;
    }

}
