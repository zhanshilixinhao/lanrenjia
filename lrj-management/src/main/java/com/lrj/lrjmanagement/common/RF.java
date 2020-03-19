package com.lrj.lrjmanagement.common;

/**
 * @author Lxh
 * @date 2020/3/11 14:08
 */
public class RF {
    public static Response response() {
        return new Response();
    }

    public static Response suc(){
        return new Response().errCode(ErrorCode.SUCCESS);
    }

    public static Response err(){
        return new Response().errCode(ErrorCode.ERROR);
    }
    public static Response errParam(){
        return new Response().errCode(ErrorCode.MISSING_PARAMETER);
    }

    public static Response errPerDeid() {
        return new Response().errCode(ErrorCode.PERMISSION_DENIED_1);
    }
}
