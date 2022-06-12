package lab_08_employee;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {

    public static void main(String[] args) {
        Employee fullTimeEmployee1 = new FullTimeEmployee();
        Employee fullTimeEmployee2 = new FullTimeEmployee();
        Employee fullTimeEmployee3 = new FullTimeEmployee();
        Employee contractEmployee1 = new ContractEmployee();
        Employee contractEmployee2 = new ContractEmployee();

        EmployeeController employeeController = new EmployeeController();
        int salary = employeeController.caculateSalary(Arrays.asList(fullTimeEmployee1, fullTimeEmployee2, fullTimeEmployee3, contractEmployee1, contractEmployee2));
        System.out.println("Total salary: " + salary);
    }

    public int caculateSalary(List<Employee> employees) {
        int total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }


}
