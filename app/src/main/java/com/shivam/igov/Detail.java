package com.shivam.igov;

public class Detail {
    private String detail_header;
    private String detail_content;

    public Detail() {
    }

    public Detail(String detail_header, String detail_content) {
        this.detail_content = detail_content;
        this.detail_header = detail_header;
    }

    public String getDetail_content() {
        return detail_content;
    }

    public void setDetail_content(String detail_content) {
        this.detail_content = detail_content;
    }

    public String getDetail_header() {
        return detail_header;
    }

    public void setDetail_header(String detail_header) {
        this.detail_header = detail_header;
    }
}
