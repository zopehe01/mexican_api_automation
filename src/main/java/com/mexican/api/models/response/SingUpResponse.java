package com.mexican.api.models.response;


public class SingUpResponse {

    private String username;
    private String msg;
    private String timestamp;

    public SingUpResponse(){

    }

    public SingUpResponse(String username, String msg, String timestamp) {
        this.username = username;
        this.msg = msg;
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "SingUpResponse [username=" + username + ", msg=" + msg + ", timestamp=" + timestamp + "]";
    }

    
    
    
}
