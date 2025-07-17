package com.mexican.api.models.response;

public class UserProfileResponse {

    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    // private String isActive;

    
    
    public UserProfileResponse() {
    }



    public UserProfileResponse(int id, String username, String email, String firstName, String lastName,
            String mobileNumber, String isActive) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        // this.isActive = isActive;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getUsername() {
        return username;
    }



    public void setUsername(String username) {
        this.username = username;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getFirstName() {
        return firstName;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getMobileNumber() {
        return mobileNumber;
    }



    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }



    // public String isActive() {
    //     return isActive;
    // }



    // public void setActive(String isActive) {
    //     this.isActive = isActive;
    // }



    @Override
    public String toString() {
        return "UserProfileResponse [id=" + id + ", username=" + username + ", email=" + email + ", firstName="
                + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
    }

    

    
}
