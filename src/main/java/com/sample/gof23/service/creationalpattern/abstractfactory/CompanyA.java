package com.sample.gof23.service.creationalpattern.abstractfactory;


/**
 * @author 王贤
 */
public class CompanyA implements Company {

    @Override
    public Computer buildComputer(String parameter) {
        if ("个人电脑".equals(parameter)) {
            return new PersonalComputer();
        } else if ("笔记本电脑".equals(parameter)) {
            return new NotebookComputer();
        } else {
            return null;
        }
    }

    @Override
    public Telephone buildTelephone(String parameter) {
        if ("座机电话".equals(parameter)) {
            return new DesktopPhone();
        } else if ("手机".equals(parameter)) {
            return new Mobile();
        } else {
            return null;
        }
    }

}
