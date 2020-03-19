package com.lrj.lrjmanagement.common;

/**
 * @author Lxh
 * @date 2020/3/11 14:11
 */
public enum ErrorCode {
    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR"),
    MISSING_PARAMETER(4, "MISSING_PARAMETER"),
    SIGN_ERROR(5, "SIGN_ERROR"),
    ACCOUNT_NOT_EXIST(6, "ACCOUNT_NOT_EXIST"),

    SUCCESS_SOCKET(200, "SUCCESS_SOCKET"),
    NO_AUTH(401, "NO_AUTH"),
    NOT_FOUND(404, "NOT_FOUND"),
    UNKNOWN_ERROR(500, "NOT_FOUND"),

    /* 用户相关 错误码 */
    NEED_LOGIN(1002, "NEED_LOGIN"), // 需要登录
    PERMISSION_DENIED(1003, "PERMISSION_DENIED"), // 权限拒绝
    PERMISSION_DENIED_1(1006, "权限不够"), // 权限拒绝
    ACC_NOT_EXIST(1004, "用户不存在!"),
    ACC_FORBIDDEN(1005, "该账户已被禁用!"),

    /* 权限管理相关 */
    PER_ONLY_ROOT(2000, "只有超级管理员才能操作"),
    ROLE_CANT_DEL(2001, "该角色不能删除"),
    ROLE_CANT_ACTIVE(2002, "该角色不能禁用"),
    ROOT_ROLE_CANT_CREATE(2003, "不能创建该角色类型的用户"),
    PERMISSION_NOT(2004, "权限不够"),
    ACC_EXIST(2005, "用户名已存在"),
    ROOT_CANt_DEL(2006, "超级管理员不能删除"),

    // Http错误
    HTTP_NOT_AUTH(401, "HTTP_METHOD_NOT_SUPPORT"),
    HTTP_METHOD_NOT_SUPPORT(405, "HTTP_METHOD_NOT_SUPPORT");

    int code;
    String msg;

    private static int USER_CODE = 1000;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
