package com.shivam.igov;

public class Department {
    private String image_src;
    private String department;

    public Department() {
    }

    public Department(String image_src, String department) {
        this.image_src = image_src;
        this.department = department;
    }

    public String getImage_src() {
        return image_src;
    }

    public void setImage_src(String image_src) {
        this.image_src = image_src;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
