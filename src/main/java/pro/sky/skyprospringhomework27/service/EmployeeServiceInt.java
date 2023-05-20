package pro.sky.skyprospringhomework27.service;

public interface EmployeeServiceInt {
    String addEmployee(String firstName, String lastName);
    String removeEmployee(String firstName, String lastName);
    String findEmployee(String firstName, String lastName);
    String getEmployeePrint();
}
