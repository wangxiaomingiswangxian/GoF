package com.sample.gof23.service.behavioralpattern.mediator;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王贤
 */
@Component
public class MediatorClient {


    private Member programmer1, programmer2, designer1, designer2;

    private Task programTask1, programTask2, designTask1, designTask2;

    private final ProjectA projectA = new ProjectA();

    private final ProjectB projectB = new ProjectB();

    private final TechnicalDirector leader = new TechnicalDirector();

    public int run(String... args) {
        setData();

        // 初始化项目人员和任务信息
        programmer1.setMemberName("程序员1");
        programmer2.setMemberName("程序员2");
        designer1.setMemberName("设计师1");
        designer2.setMemberName("设计师2");

        programTask1.setTaskName("编程工作1");
        programTask2.setTaskName("编程工作2");
        designTask1.setTaskName("设计工作1");
        designTask2.setTaskName("设计工作2");

        Map<String, Member> programmerMap = new HashMap<>(4, 0.75f);
        programmerMap.put(programmer1.getMemberName(), programmer1);
        programmerMap.put(programmer2.getMemberName(), programmer2);

        Map<String, Member> designerMap = new HashMap<>(4, 0.75f);
        designerMap.put(designer1.getMemberName(), designer1);
        designerMap.put(designer2.getMemberName(), designer2);

        Map<String, Task> programTaskMap = new HashMap<>(4, 0.75f);
        programTaskMap.put(programTask1.getTaskName(), programTask1);
        programTaskMap.put(programTask2.getTaskName(), programTask2);

        Map<String, Task> designTaskMap = new HashMap<>(4, 0.75f);
        designTaskMap.put(designTask1.getTaskName(), designTask1);
        designTaskMap.put(designTask2.getTaskName(), designTask2);

        projectA.setMembers(programmerMap).setTasks(programTaskMap);
        projectB.setMembers(designerMap).setTasks(designTaskMap);

        // 进行项目人员和工作的协调
        System.out.println("—————————协调前的情况—————————");
        projectA.showProjectContent();
        projectB.showProjectContent();

        leader.setProjectA(projectA);
        leader.setProjectB(projectB);

        // 协调两个项目的人员
        leader.changMember(projectA, projectB, programmer1);
        leader.changMember(projectB, projectA, designer1);

        // 协调两个项目的任务
        leader.changTask(projectA, projectB, programTask1);
        leader.changTask(projectB, projectA, designTask1);

        System.out.println("—————————协调后的情况—————————");
        projectA.showProjectContent();
        projectB.showProjectContent();

        return 0;
    }

    private void setData() {
        programmer1 = new Member();
        programmer2 = new Member();
        designer1 = new Member();
        designer2 = new Member();

        programTask1 = new Task();
        programTask2 = new Task();
        designTask1 = new Task();
        designTask2 = new Task();
    }
}
