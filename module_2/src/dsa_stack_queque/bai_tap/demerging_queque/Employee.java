package dsa_stack_queque.bai_tap.demerging_queque;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee> {
    private String name;
    private String gender;
    private Date date;
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Employee() {
    }

    public Employee(String name, String gender, String date) throws ParseException {
        this.name = name;
        this.gender = gender;
        this.date = dateFormat.parse(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String date) throws ParseException {
        this.date = dateFormat.parse(date);
    }

    @Override
    public int compareTo(Employee employee) {
        return employee.date.compareTo(this.date);
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name = '" + name + '\'' +
                ", gender = '" + gender + '\'' +
                ", date = " + dateFormat.format(date) +
                '}';
    }
}
