package com.sample.gof23.service.structuralpattern.bridge;

/**
 * @author 王贤
 */
public class AbstractDepartment {

    protected AbstractAction departAction;

    public void setAbstractAction(AbstractAction action) {
        departAction = action;
    }

    public void action(String title) {
        departAction.doAction("", title);
    }
}
