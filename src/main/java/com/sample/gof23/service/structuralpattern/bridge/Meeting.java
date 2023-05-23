package com.sample.gof23.service.structuralpattern.bridge;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class Meeting extends AbstractAction {

    @Override
    public void doAction(String depart, String title) {
        if (depart.length() == 0) {
            System.out.println("这是部门的会议工作活动");
        }
        System.out.println("这是" + depart + "会议工作活动," + "主题是" + title);
    }

}
