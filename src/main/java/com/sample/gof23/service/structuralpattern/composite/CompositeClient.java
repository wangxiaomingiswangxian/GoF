package com.sample.gof23.service.structuralpattern.composite;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class CompositeClient {

    public void scene1() {
        // 场景1，形成公司-部门-项目组的公司结构
        AbstractOrganization corporation1 = new Corporation();

        corporation1.addName("公司A");

        AbstractOrganization depart1 = new Department("部门1");
        AbstractOrganization depart2 = new Department("部门2");
        AbstractOrganization depart3 = new Department("部门3");

        depart1.addName("部门1");
        depart2.addName("部门2");
        depart3.addName("部门3");

        corporation1.add(depart1);
        corporation1.add(depart2);
        corporation1.add(depart3);
        WorkTeam team1 = new WorkTeam("项目组1");
        WorkTeam team2 = new WorkTeam("项目组2");

        depart1.add(team1);
        depart1.add(team2);

        corporation1.showOrganizationStructure("");
    }


    public void scene2() {
        // 场景2，形成公司-工厂-车间的工厂结构
        Corporation corporation2 = new Corporation();

        corporation2.addName("公司B");

        Factory factory1 = new Factory();
        Factory factory2 = new Factory();
        Factory factory3 = new Factory();

        factory1.addName("工厂1");
        factory2.addName("工厂2");
        factory3.addName("工厂3");

        corporation2.add(factory1);
        corporation2.add(factory2);
        corporation2.add(factory3);

        Workshop team3 = new Workshop();
        Workshop team4 = new Workshop();

        team3.addName("车间1");
        team4.addName("车间2");

        factory1.add(team3);
        factory1.add(team4);

        corporation2.showOrganizationStructure("");
    }

    public int run(String... args) {

        scene1();
        System.out.println();
        scene2();
        return 0;
    }


}
