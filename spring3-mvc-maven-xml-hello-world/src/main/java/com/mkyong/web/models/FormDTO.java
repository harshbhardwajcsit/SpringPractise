package com.mkyong.web.models;

public class FormDTO {



    private String mail;
    private String name;


    public FormDTO() {}

    public String getEmailId() {
        return mail;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmailId(String mail) {
        this.mail = mail;
    }

}
