package com.library.domain;

import java.util.Date;
import java.util.Objects;


public class CustomerDto {

    private Integer cust_no;
    private String cust_name;
    private String phone;
    private Date join_date;
    private String cust_email;
    private String grade;
    private Integer total_rent_price;

    public Integer getTotal_rent_price() {
        return total_rent_price;
    }


    public void setTotal_rent_price(Integer total_rent_price) {
        this.total_rent_price = total_rent_price;
    }

    public CustomerDto() {
    }

    public CustomerDto(String cust_name, String phone, String cust_email, String grade) {
        this.cust_name = cust_name;
        this.phone = phone;
        this.cust_email = cust_email;
        this.grade = grade;
    }

    public int getCust_no() {
        return cust_no;
    }

    public void setCust_no(int cust_no) {
        this.cust_no = cust_no;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDto that = (CustomerDto) o;
        return cust_no == that.cust_no && Objects.equals(cust_name, that.cust_name) && Objects.equals(phone, that.phone) && Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cust_no, cust_name, phone, grade);
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "cust_no=" + cust_no +
                ", cust_name='" + cust_name + '\'' +
                ", phone='" + phone + '\'' +
                ", join_date=" + join_date +
                ", cust_email='" + cust_email + '\'' +
                ", grade='" + grade + '\'' +
                ", total_rent_price=" + total_rent_price +
                '}';
    }
}
