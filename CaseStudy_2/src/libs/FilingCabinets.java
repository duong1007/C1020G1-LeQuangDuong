package libs;

import data.FileData;
import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class FilingCabinets {
    static final String EMPLOYEE = "src/data/Employee.csv";
    static final String REGEX = ",";
    private static Stack<Employee> filingCabinets = new Stack<>();
    private static Stack<String> idEmployee = new Stack<>();
    private static Map<String,Employee> mapEmployee = FileData.readFileEmployeeMap();

    private static void readFileEmployee() {
        for (String s : FileData.openFile(EMPLOYEE)) {
            String[] str = s.split(REGEX);
            int str2 = Integer.parseInt(str[2]);
            Employee employee = new Employee(str[1], str2, str[3]);
            idEmployee.add(str[0]);
            filingCabinets.add(employee);
        }
    }

    public static Employee searchEmployee(String id) {
        readFileEmployee();
        while (!idEmployee.isEmpty()) {
            if (idEmployee.pop().equals(id)) {
                return filingCabinets.pop();
            }
            filingCabinets.pop();
        }
        return null;
    }

}
