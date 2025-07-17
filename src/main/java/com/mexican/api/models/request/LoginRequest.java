package com.mexican.api.models.request;

public class LoginRequest {

    private String username;
    private String password;

    private LoginRequest(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "LoginRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    

    public static class Builder{
        private String username;
        private String password;

        public Builder setUsername(String username){
            this.username = username;
            return this;
        }

        public Builder setPassword(String password){
            this.password = password;
            return this;
        }

        public LoginRequest build(){
            return new LoginRequest(this);
        }
    }
    
}
