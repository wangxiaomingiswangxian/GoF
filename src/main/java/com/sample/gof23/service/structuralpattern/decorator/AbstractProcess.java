package com.sample.gof23.service.structuralpattern.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王贤
 */
public abstract class AbstractProcess {

    protected List<String> componentList = new ArrayList<>();

    public void addProcess(String processName) {
        componentList.add(processName);
    }

    public void showAllProcess() {
        if (componentList == null) {
            System.out.println("没有过程");
        }
        for (String s : componentList) {
            System.out.print(s + ";");
        }
    }

}
