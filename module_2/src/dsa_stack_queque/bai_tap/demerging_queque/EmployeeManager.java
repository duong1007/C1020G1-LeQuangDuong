package dsa_stack_queque.bai_tap.demerging_queque;


import java.text.ParseException;
import java.util.*;

public class EmployeeManager  {
    public static void main(String[] args) throws ParseException {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Duong","Nam","10/07/1998"));
        employees.add(new Employee("Duong Thu","Nu","29/01/1900"));
        employees.add(new Employee("Duong Qua","Nam","15/01/1972"));
        employees.add(new Employee("Duong Duong","Nu","04/05/1954"));

        Collections.sort(employees);

        Queue<Employee> Nu = new LinkedList<>();
        Queue<Employee> Nam = new LinkedList<>();

        for (int index = 0; index < employees.size(); index++) {
            String check = employees.get(index).getGender().toLowerCase();
            if (check.equals("nam")) {
                Nam.add(employees.get(index));
            } else {
                Nu.add(employees.get(index));
            }
        }

        while (Nu.size() != 0) {
            System.out.println(Nu.poll());
        }
        while (Nam.size() != 0) {
            System.out.println(Nam.poll());
        }
    }
}
