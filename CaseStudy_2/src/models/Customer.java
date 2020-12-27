package models;

import commons.regex.exceptions.*;
import commons.regex.Regex;
import data.FileData;
import libs.BuyTicket;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Customer implements BuyTicket {
    private String name;
    private Date birth;
    private String gender;
    private String id;
    private String phoneNumber;
    private String email;
    private String type;
    private String address;
    private Services service;
    private DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
    private static final String NAME_REGEX = "^[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểếễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểếễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)+$";
    private static final String EMAIL_REGEX ="^[A-Za-z0-9]{3,}[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String ID_REGEX ="^\\d{3}\\s\\d{3}\\s\\d{3}$";
    private static final String GENDER_REGEX ="^(Unknown)|(Male)|(Female)$";
    static Scanner scanner = new Scanner(System.in);

    public Customer() {
    }

    public Customer(String name, Date birth, String gender, String id, String phoneNumber, String email, String type, String address) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        if (regex(name, NAME_REGEX)){
            throw new NameException();
        }
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) throws BirthdayException {
        if (regexBirth(birth)) {
            throw new BirthdayException();
        }
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws GenderException {
        if (regex(gender,GENDER_REGEX)){
            throw new GenderException();
        }
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws IdCardException, IdAlreadyExists {
        if (regex(id, ID_REGEX)) {
            throw new IdCardException();
        }
        if (!checkIdExist(id)){
            throw new IdAlreadyExists();
        }
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        if (regex(email, EMAIL_REGEX)) {
            throw new EmailException();
        }
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public void input() {

        do {
            System.out.println("Enter Name: ");
            try {
                setName(scanner.nextLine());
            } catch (NameException e) {
                System.err.println("Customer's name must capitalize the first letter of each word!!!");
            }
        }  while (name == null);

        do {
            System.out.println("Enter Date of Birth: ");
            try {
                setBirth(dateFormat.parse(scanner.nextLine()));
            } catch (ParseException e) {
                System.err.println("Date of birth must be dd/MM/yyyy");
            } catch (BirthdayException e) {
                System.err.println("Invalid date of birth");
            }
        } while (birth == null);

        do {
            System.out.println("Enter Email: ");
            try {
                setEmail(scanner.nextLine());
            } catch (EmailException e){
                System.err.println("Email must be format abc@abc.abc");
            }
        } while (email == null);

        do {
            System.out.println("Enter ID: ");
            try {
                setId(scanner.nextLine());
            } catch (IdCardException e) {
                System.err.println("ID card must be format XXX XXX XXX");
            } catch (IdAlreadyExists idAlreadyExists) {
                System.err.println("ID card already exists");
            }
        } while (id == null);

        System.out.println("Enter Phone Number: ");
        this.phoneNumber = scanner.nextLine();

        do {
            System.out.println("Enter Gender: ");
            try {
                setGender(standardizedGender(scanner.next()));
            } catch (GenderException e) {
                System.err.println("Gender must be Unknown or Male or Female");;
            }
        } while (gender == null);

        System.out.println("Enter Type: ");
        this.type = scanner.next();

        System.out.println("Enter Address: ");
        this.address = scanner.next();
    }

    private boolean checkIdExist(String id) {
        for (Customer customer : FileData.readFileCustomer()) {
            if (customer.getId().equals(id)){
                return false;
            }
        }
        return true;
    }

    private String standardizedGender(String gender) {
        String[] stander = gender.toLowerCase().split("");
        stander[0]= stander[0].toUpperCase();
        StringBuilder result = new StringBuilder();
        for (String str : stander){
            result.append(str);
        }
        return String.valueOf(result);
    }

    private boolean regex(String string, String regex){
        Regex check = new Regex(regex);
        return !check.validate(string);
    }

    private boolean regexBirth(Date date) {
        String sDate = dateFormat.format(date);
        String[] check = sDate.split("/");
        int day = Integer.parseInt(check[0]);
        int month = Integer.parseInt(check[1]);
        int year = Integer.parseInt(check[2]);
        int maxDay;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
            default:
                 return false;
        }
        return year > 1900 && year > (Calendar.getInstance().get(Calendar.YEAR) - 18) && day > maxDay;
    }

    public String showInfo() {
        return "ID = '" + id + '\'' +
                ", Birth = " + dateFormat.format(birth) +
                ", Gender = '" + gender + '\'' +
                ", Name = " + name +
                ", NumberPhone = '" + phoneNumber + '\'' +
                ", Email = '" + email + '\'' +
                ", Type = '" + type + '\'' +
                ", Address = '" + address + '\'' +
                ", Service = " + service;
    }

    @Override
    public String toString() {
        return name +
                "," + dateFormat.format(birth) +
                "," + gender +
                "," + id +
                "," + phoneNumber +
                "," + email +
                "," + type +
                "," + address +
                "," + service;
    }

    @Override
    public Tickets buyTicket() {
        System.out.println("Enter movie's name: ");
        String movie = scanner.nextLine();
        System.out.println("Enter seats");
        String seats = scanner.next();
        return new Tickets(movie, seats);
    }
}
