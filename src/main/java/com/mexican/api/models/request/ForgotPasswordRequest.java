package com.mexican.api.models.request;

public class ForgotPasswordRequest {

    private String emailId;
    private String mobileNo;
    private String username;
    private String oldPassword;
    private String newPassword;

    private ForgotPasswordRequest(Builder builder) {
        this.emailId = builder.emailId;
        this.mobileNo = builder.mobileNo;
        this.username = builder.username;
        this.oldPassword = builder.oldPassword;
        this.newPassword = builder.newPassword;
    }

    private ForgotPasswordRequest() {
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    
    public static class Builder{

        private String emailId;
        private String mobileNo;
        private String username;
        private String oldPassword;
        private String newPassword;

        public Builder(){

        }

        public Builder emailId(String emailId){
            this.emailId = emailId;
            return this;
        }

        public Builder mobileNo(String mobileNo){
            this.mobileNo = mobileNo;
            return this;
        }

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder oldPassword(String oldPassword){
            this.oldPassword = oldPassword;
            return this;
        }

        public Builder newPassword(String newPassword){
            this.newPassword = newPassword;
            return this;
        }


        public ForgotPasswordRequest build(){
            return new ForgotPasswordRequest(this);
        }
    }


    @Override
    public String toString() {
        return "ForgotPasswordRequest [emailId=" + emailId + ", mobileNo=" + mobileNo + ", username=" + username
                + ", oldPassword=" + oldPassword + ", newPassword=" + newPassword + "]";
    }

    

}
