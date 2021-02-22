package model.bean;

public class Employee {
    private Integer id;
    private String name;
    private String birthday;
    private String card;
    private double salary;
    private String phone;
    private String email;
    private String address;
    private String position;
    private String education;
    private String division;

    public Employee(String name, String birthday, String card, double salary,
                    String phone, String email, String address, String position,
                    String education, String division) {
        this.name = name;
        this.birthday = birthday;
        this.card = card;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.position = position;
        this.education = education;
        this.division = division;
    }

    public Employee(Integer id, String name, String birthday, String card, double salary,
                    String phone, String email, String address, String position,
                    String education, String division) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.card = card;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.position = position;
        this.education = education;
        this.division = division;
    }

    public Employee() {
    }

    public Employee(Integer id, String name, String birthday, String position, String education, String division) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.position = position;
        this.education = education;
        this.division = division;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

}
