package data;

import models.*;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FileData {

    static final String VILLA = "src/Data/Villa.csv";
    static final String HOUSE = "src/Data/House.csv";
    static final String ROOM = "src/Data/Room.csv";
    static final String CUSTOMER = "src/Data/Customer.csv";
    static final String BOOKING = "src/Data/Booking.csv";
    static final String EMPLOYEE = "src/data/Employee.csv";
    static final String REGEX = ",";

    public static void saveData(String fileName,Object data) {
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file,true);
             BufferedWriter writer = new BufferedWriter(fileWriter);
             PrintWriter print = new PrintWriter(writer)) {

            print.println(data);
            print.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
// updateData sai
    public static void updateData(String fileName,Object data) {
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter writer = new BufferedWriter(fileWriter);
             PrintWriter print = new PrintWriter(writer)) {

            print.println(data);
            print.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveBooking(String id, String idServices) {
        File file = new File(BOOKING);
        try (FileWriter fileWriter = new FileWriter(file,true);
             BufferedWriter writer = new BufferedWriter(fileWriter);
             PrintWriter print = new PrintWriter(writer)) {

            print.println(id + REGEX + idServices);
            print.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> openFile(String fileName)  {
        List<String> dataList = new ArrayList<>();
        File file = new File(fileName);

        try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader)) {

            String data;

            while ((data = reader.readLine()) != null) {
                dataList.add(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }

    public static List<Villa> readFileVilla() {
        List<Villa> listVilla = new ArrayList<>();
        for (String string : openFile(VILLA)) {
            String[] str = string.split(REGEX);
            double str2 = Double.parseDouble(str[2]);
            double str3 = Double.parseDouble(str[3]);
            int str4 = Integer.parseInt(str[4]);
            double str8 = Double.parseDouble(str[8]);
            int str9 = Integer.parseInt(str[9]);
            Villa villa = new Villa(str[0],str[1],str2,str3,str4,str[5],str[6],str[7],str8,str9);
            listVilla.add(villa);
        }
        return listVilla;
    }

    public static List<House> readFileHouse() {
        List<House> listHouse = new ArrayList<>();
        for (String string : openFile(HOUSE)) {
            String[] str = string.split(REGEX);
            double str2 = Double.parseDouble(str[2]);
            double str3 = Double.parseDouble(str[3]);
            int str4 = Integer.parseInt(str[4]);
            int str8 = Integer.parseInt(str[8]);
            House house = new House(str[0],str[1],str2,str3,str4,str[5],str[6],str[7],str8);
            listHouse.add(house);
        }
        return listHouse;
    }

    public static List<Room> readFileRoom() {
        List<Room> listRoom = new ArrayList<>();
        for (String string : openFile(ROOM)) {
            String[] str = string.split(REGEX);
            double str2 = Double.parseDouble(str[2]);
            double str3 = Double.parseDouble(str[3]);
            int str4 = Integer.parseInt(str[4]);
            Room room = new Room(str[0],str[1],str2,str3,str4,str[5],str[6]);
            listRoom.add(room);
        }
        return listRoom;
    }

    public static List<Customer> readFileCustomer() {
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        List<Customer> customerList = new ArrayList<>();
        for (String string : openFile(CUSTOMER)) {
            String[] str = string.split(REGEX);
            Customer customer = null;

            try {
                customer = new Customer(str[0],dateFormat.parse(str[1]),str[2],str[3],str[4],str[5],str[6],str[7]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            customerList.add(customer);
        }
        return customerList;
    }

    public static Map<String,Employee> readFileEmployeeMap() {
        Map<String,Employee> employeeMap = new LinkedHashMap<>();
        List<String> string = openFile(EMPLOYEE);
        for (String s : string) {
            String[] str = s.split(REGEX);
            int str2 = Integer.parseInt(str[2]);
            Employee employee = new Employee(str[1], str2, str[3]);
            employeeMap.put(str[0], employee);
        }
        return employeeMap;
    }

    public static List<Employee> readFileEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        for (String s : openFile(EMPLOYEE)) {
            String[] str = s.split(REGEX);
            int str2 = Integer.parseInt(str[2]);
            Employee employee = new Employee(str[1], str2, str[3]);
            employeeList.add(employee);
        }
        return employeeList;
    }
}
