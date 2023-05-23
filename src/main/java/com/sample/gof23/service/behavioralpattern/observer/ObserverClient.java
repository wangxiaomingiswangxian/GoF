package com.sample.gof23.service.behavioralpattern.observer;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class ObserverClient {

    private final CompanyAddressBook addressBook = new CompanyAddressBook();


    public int run(String... args) {
        final CompanyEmployee employee1 = new CompanyEmployee();
        final CompanyEmployee employee2 = new CompanyEmployee();
        System.out.println("——————原有的通讯录——————");

        employee1.setEmployeeName("employee1");
        employee2.setEmployeeName("employee2");

        addressBook.addEmployee(employee1);
        addressBook.addEmployee(employee2);

        System.out.println("——————更新的通讯录——————");
        String newAddressBook = "新的通讯录";
        addressBook.setAddressBook(newAddressBook);

        addressBook.notice();

        return 0;

    }

}
