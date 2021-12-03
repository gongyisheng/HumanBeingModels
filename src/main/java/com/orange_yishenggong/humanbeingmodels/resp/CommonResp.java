package com.orange_yishenggong.humanbeingmodels.resp;

public class CommonResp <T> {
    //业务上成功or失败
    private boolean success = true;
    //返回的信息
    private String message;
    //返回泛型数据
    private T content;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
