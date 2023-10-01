package com.bhuvnesh.restTemplateDemo;

public class UserData
{
    private String id;
    private String userName;
    private String data;

    public UserData(String id, String userName, String data) {
        this.id = id;
        this.userName = userName;
        this.data = data;
    }

    public UserData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
