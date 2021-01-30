package model.bean;

import java.util.Date;

public class Customer {
    private Integer id;
    private String typeID;
    private String name;
    private String birth;
    private String gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(Integer id, String typeID, String name, String birth, String gender) {
        this.id = id;
        this.typeID = typeID;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }

    public Customer(Integer id, String typeID, String name, String birth, String gender, String idCard, String phone, String email, String address) {
        this.id = id;
        this.typeID = typeID;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Customer(String typeID, String name, String birth, String gender, String idCard, String phone, String email, String address) {
        this.typeID = typeID;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
