package com.sample.gof23.service.behavioralpattern.state;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class StateClient {

    private final ProjectBuilderState builder = new ProjectBuilderState();

    private final ProjectDevelopmentState development = new ProjectDevelopmentState();

    private final ProjectRunState run = new ProjectRunState();

    private final ProjectMaintenanceState maintenance = new ProjectMaintenanceState();

    private final ProjectEndState end = new ProjectEndState();

    private final Project projectA = new Project();


    public int run(String... args) {


        projectA.setProjectName("projectA");

        System.out.println("——————设置项目为立项状态——————");
        projectA.setCurrentState(builder);
        projectA.doCurrentWork();

        System.out.println("——————设置项目为开发状态——————");
        projectA.setCurrentState(development);
        projectA.doCurrentWork();

        System.out.println("——————设置项目为试运行状态——————");
        projectA.setCurrentState(run);
        projectA.doCurrentWork();

        System.out.println("——————设置项目为维护状态——————");
        projectA.setCurrentState(maintenance);
        projectA.doCurrentWork();

        System.out.println("——————设置项目为结项状态——————");
        projectA.setCurrentState(end);
        projectA.doCurrentWork();

        return 0;
    }


}
