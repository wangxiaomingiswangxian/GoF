package com.sample.gof23.service.structuralpattern.bridge;

/**
 * @author 王贤
 */
public class AbstractAction {

    public void doAction(String depart, String title) {
        if (depart.length() == 0) {
            System.out.println("这是部门的标准工作活动");
        }
        System.out.println("这是" + depart + "部门的标准工作活动," + "主题是" + title);
    }
}
