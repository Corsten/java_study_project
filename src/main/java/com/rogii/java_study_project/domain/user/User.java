package com.rogii.java_study_project.domain.user;

public class User {
    private int id;

    private String  login;
    private String  password;

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String name) {
        login = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", login=" + login + "]";
    }
}
