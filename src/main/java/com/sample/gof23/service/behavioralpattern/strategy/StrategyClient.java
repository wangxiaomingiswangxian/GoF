package com.sample.gof23.service.behavioralpattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class StrategyClient {

    private final BankStrategy strategy1 = new BankStrategy();

    private final GovernmentStrategy strategy2 = new GovernmentStrategy();

    private final TelecomStrategy strategy3 = new TelecomStrategy();

    public int run(String... args) {
        final Project projectA = new Project();
        final Project projectB = new Project();
        final Project projectC = new Project();
        System.out.println("——————要求projectA采用银行策略——————");
        projectA.setProjectName("projectA");

        projectA.setStrategy(strategy1);
        projectA.doStrategyWork();

        System.out.println("——————要求projectB采用政府策略——————");
        projectB.setProjectName("projectB");
        projectB.setStrategy(strategy2);
        projectB.doStrategyWork();

        System.out.println("——————要求projectC采用电信策略——————");
        projectC.setProjectName("projectC");
        projectC.setStrategy(strategy3);
        projectC.doStrategyWork();

        return 0;

    }


}
