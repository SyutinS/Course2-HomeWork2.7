package pro.sky.skyprospringhomework27.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringhomework27.service.EmployeeServiceInt;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServiceInt employeeService;

    public EmployeeController(EmployeeServiceInt employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public String hello() {
        return " погнали ";
    }

    @GetMapping("/add")
    public String addEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName) {
        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/remove")
    public String removeEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName) {
        return employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public String findEmployee(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping("/print")
    public String getEmployeePrint() {
        return employeeService.getEmployeePrint();
    }
}
