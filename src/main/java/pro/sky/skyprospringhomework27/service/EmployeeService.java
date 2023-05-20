package pro.sky.skyprospringhomework27.service;

import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService implements EmployeeServiceInt {
    private final Map<String, String> employee;
    public EmployeeService() {
        this.employee = new HashMap<>();
    }

    @Override
    public String addEmployee(String firstName, String lastName) {
        employee.put(firstName, lastName);
        return " сотрудник успешно добавлен ";
    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        if (!employee.containsKey(firstName) && !employee.containsValue(lastName)) {
            throw new RuntimeException(" такого сотрудника не существует ");
        }
        employee.remove(firstName, lastName);
        return " сотрудник успешно удален ";
    }

    @Override
    public String findEmployee(String firstName, String lastName) {
        if (!employee.containsKey(firstName) && !employee.containsValue(lastName)) {
            throw new RuntimeException(" такого сотрудника не существует ");
        }
        return " вэлком " + employee.getOrDefault(firstName, lastName);
    }

    @Override
    public String getEmployeePrint() {
        return Collections.unmodifiableMap(employee).toString();
    }

}
