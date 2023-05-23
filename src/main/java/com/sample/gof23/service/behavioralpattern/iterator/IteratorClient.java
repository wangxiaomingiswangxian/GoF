package com.sample.gof23.service.behavioralpattern.iterator;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class IteratorClient {

    private final EmployeeCollection employeeCollection = new EmployeeCollection();

    private final ImplementIterator iterator = new ImplementIterator();

    public int run(String... args) {
        final Employee employee1 = new Employee();
        final Employee employee2 = new Employee();
        final Employee employee3 = new Employee();
        final Employee employee4 = new Employee();
        final Employee employee5 = new Employee();

        Employee employee;

        employee1.setEmployeeName("小王");
        employee1.setEducation("学士");

        employee2.setEmployeeName("小张");
        employee2.setEducation("学士");

        employee3.setEmployeeName("小刘");
        employee3.setEducation("硕士");

        employee4.setEmployeeName("小李");
        employee4.setEducation("学士");

        employee5.setEmployeeName("小马");
        employee5.setEducation("硕士");



        employeeCollection.addEmployee(employee1).addEmployee(employee2);
        employeeCollection.addEmployee(employee3).addEmployee(employee4);
        employeeCollection.addEmployee(employee5);

        iterator.setEmployeeCollection(employeeCollection);

        do {
            employee = iterator.next();
            if (employee != null) {
                if ("硕士".equals(employee.getEducation())) {
                    System.out.println(employee.getEmployeeName() + ";");
                }
            }
        } while (employee != null);

        return 0;
    }


}
