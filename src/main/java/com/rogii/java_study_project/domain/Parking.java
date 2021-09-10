package com.rogii.java_study_project.domain;

public class Parking {
    private int id;
    private String name = "";
    private int spaces_count = 0;
    private int free_spaces_count = 0;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpaces_count(int spaces_count) {
        this.spaces_count = spaces_count;
    }

    public void setFree_spaces_count(int free_spaces_count) {
        this.free_spaces_count = free_spaces_count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSpaces_count() {
        return spaces_count;
    }

    public int getFree_spaces_count() {
        return free_spaces_count;
    }

    @Override
    public String toString() {
        return "Parking [id=" + id + ", Name=" + name + ", space_count=" + spaces_count + ", free_space_count=" + free_spaces_count + "]";
    }
}
