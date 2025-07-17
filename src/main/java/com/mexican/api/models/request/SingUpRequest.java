package com.mexican.api.models.request;

public class SingUpRequest {

    private String firstName;
    private String lastName;
    private String emailId;
    private String mobileNo;
    private String username;
    private String password;

    public SingUpRequest(){

    }

    

    public SingUpRequest(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.emailId = builder.emailId;
        this.mobileNo = builder.mobileNo;
        this.username = builder.username;
        this.password = builder.password;
    }



    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getEmailId() {
        return emailId;
    }
    
    public String getMobileNo() {
        return mobileNo;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String emailId;
        private String mobileNo;
        private String username;
        private String password;

        public Builder() {
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public Builder setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public SingUpRequest build() {
            return new SingUpRequest(this);
        }
    }
}
