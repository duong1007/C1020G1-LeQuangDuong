package com.example.validator_form_register.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {


    private Integer id;

    @NotNull(message = "First Name not null!")
    @Size(min = 5,message = "5 < size < 45" )
    private String firstName;

    @NotNull(message = "Last Name not null!")
    @Size(min = 5,max = 45, message = "5 < size < 45")
    private String lastName;

    @NotNull
    @Pattern(regexp = "^(.+)@(.+)$",message = "Email not correct!")
    private String email;

    @NotNull(message = "Age not null!!")
    @Min(value = 18,message = "Age must >= 18!")
    private int age;


    @Pattern(regexp = "^(([+]84) |[0])[0-9]{9,10}$",message = "Phone not correct!")
    private String phoneNumber;

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
