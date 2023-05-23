package com.sample.gof23.service.creationalpattern.builder;

import org.springframework.stereotype.Service;

/**
 * @author 王贤
 */
@Service
public class ConcreteProjectProcessBuilder extends
        AbstractProjectProcessBuilder {

    @Override
    public void buildFeasibility() {
        processList.add("可行性分析过程");
    }

    @Override
    public void buildTechnicalDiscussion() {
        processList.add("技术交流过程");
    }

    @Override
    public void buildBid() {
        processList.add("投标过程");
    }

    @Override
    public void buildRequirement() {
        processList.add("需求调研和分析过程");
    }

    @Override
    public void buildDesign() {
        processList.add("设计过程");
    }

    @Override
    public void buildProgram() {
        processList.add("编码过程");
    }

    @Override
    public void buildTest() {
        processList.add("测试过程");
    }

    @Override
    public void buildDeployment() {
        processList.add("部署和实施过程");
    }

    @Override
    public void buildMaintenance() {
        processList.add("维护过程");
    }
}
