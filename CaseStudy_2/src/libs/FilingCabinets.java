package libs;

import data.FileData;
import models.Employee;

import java.util.Map;
import java.util.Stack;

public class FilingCabinets {
    private static Stack<String> filingCabinets = new Stack<>();
    private static Map<String,Employee> mapEmployee = FileData.readFileEmployeeMap();

    private static void openFilingCabinets() {
        for (Map.Entry<String,Employee> entry : mapEmployee.entrySet()) {
            filingCabinets.push(entry.getKey());
        }
    }

    public static Employee searchEmployee(String id) {
        openFilingCabinets();
        while (!filingCabinets.isEmpty()) {
            if (filingCabinets.pop().equals(id)) {
                return mapEmployee.get(id);
            }
        }
        return null;
    }

}
