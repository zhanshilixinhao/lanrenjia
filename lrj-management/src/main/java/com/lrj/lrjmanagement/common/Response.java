package com.lrj.lrjmanagement.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.pagehelper.PageInfo;

import java.io.Serializable;

/**
 * @author Lxh
 * @date 2020/3/11 14:07
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Response implements Serializable {
    private static final long serialVersionUID = -4758777964190374925L;
    private int errCode;
    private String msg;
    private Object data;
    private long time;
    private String exception;

    private Integer pages;
    private Long total;
    private Integer pageNum;
    private Integer pageSize;


    Response() {
        time = System.currentTimeMillis();
    }

    public Response exception(String ex) {
        this.exception = ex;
        return this;
    }

    public long getTime() {
        return time;
    }

    public int getErrCode() {
        return errCode;
    }

    public Response errCode(int errCode) {
        this.errCode = errCode;
        return this;
    }

    public Response errCode(ErrorCode errCode) {
        this.errCode = errCode.code;
        this.msg = errCode.msg;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Response msg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Response data(Object data) {
        this.data = data;
        return this;
    }

    public Response page(PageInfo page) {
        this.pages = page.getPages();
        this.pageNum = page.getPageNum();
        this.pageSize = page.getPageSize();
        this.total = page.getTotal();
        return this;
    }

    public Integer getPages() {
        return pages;
    }

    public Long getTotal() {
        return total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public String getException() {
        return exception;
    }


}
