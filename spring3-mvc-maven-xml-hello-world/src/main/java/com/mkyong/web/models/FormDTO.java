package com.mkyong.web.models;

public class FormDTO {



    private String user_email;
    private String user_name;


    public FormDTO() {}

    public String getEmailId() {
        return user_email;
    }
    public String getName() {
        return user_name;
    }
    public void setName(String user_name) {
        this.user_name = user_name;
    }
    public void setEmailId(String emailId) {
        this.user_email = user_email;
    }

}
