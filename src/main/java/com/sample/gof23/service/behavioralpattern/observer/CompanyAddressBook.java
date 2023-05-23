package com.sample.gof23.service.behavioralpattern.observer;

/**
 * @author 王贤
 */
public class CompanyAddressBook extends AbstractAddressBook {

    public CompanyAddressBook() {
        addressBook = "旧的通信录";
    }

    @Override
    public void addEmployee(AbstractEmployee employee) {
        employee.update(this);
        super.addEmployee(employee);
    }

    @Override
    public void notice() {
        for (AbstractEmployee abstractEmployee : employeeList) {
            abstractEmployee.update(this);
        }
    }


}
