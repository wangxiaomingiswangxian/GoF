package com.sample.gof23.service.behavioralpattern.template;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class TemplateClient {

    private final ProjectA project1 = new ProjectA();

    private final ProjectB project2 = new ProjectB();

    public int run(String... args) {

        System.out.println("——————projectA的过程——————");
        project1.doActualWork();
        project1.showProcess();

        System.out.println("——————projectB的过程——————");
        project2.doActualWork();
        project2.showProcess();

        return 0;
    }


}
