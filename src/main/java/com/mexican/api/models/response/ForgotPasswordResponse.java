package com.mexican.api.models.response;

import java.util.Date;

public class ForgotPasswordResponse {

    private String status;
    private String msg;
    private Date timestamp;

    public ForgotPasswordResponse(String status, String msg, Date timestamp) {
        this.status = status;
        this.msg = msg;
        this.timestamp = timestamp;
    }

    public ForgotPasswordResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public static class Builder {
        private String status;
        private String msg;
        private Date timestamp;

        public Builder(){

        }

        public Builder status(String status){
            this.status = status;
            return this;
        }

        public Builder msg(String msg){
            this.msg = msg;
            return this;
        }

        public Builder timestamp(Date timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public ForgotPasswordResponse build(){
            return new ForgotPasswordResponse(status, msg,timestamp);
        }

    }

    @Override
    public String toString() {
        return "ForgotPasswordResponse [status=" + status + ", msg=" + msg + ", timestamp=" + timestamp + "]";
    }
    

}
