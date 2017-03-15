package com.shivam.igov;

public class Department {
    private int thumbnail;
    private String department;

    public Department() {
    }

    public Department(int thumbnail, String department) {
        this.thumbnail = thumbnail;
        this.department = department;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
