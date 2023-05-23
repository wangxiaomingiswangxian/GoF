package com.sample.gof23.service.creationalpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王贤
 */
public abstract class AbstractProjectProcessBuilder {
    List<String> processList = new ArrayList<>();

    /**
     * 可行性分析过程
     */
    public void buildFeasibility() {
    }

    /**
     * 技术交流过程
     */
    public void buildTechnicalDiscussion() {
    }


	/**
	 * 投标过程
	 */
    public void buildBid() {
    }


	/**
	 * 需求调研和分析过程
	 */
    public void buildRequirement() {
    }


	/**
	 * 设计过程
	 */
    public void buildDesign() {
    }


	/**
	 * 编码过程
	 */
    public void buildProgram() {
    }


	/**
	 * 测试过程
	 */
	public void buildTest() {
    }


	/**
	 * 部署和实施过程
	 */
    public void buildDeployment() {
    }


	/**
	 * 维护过程
	 */
    public void buildMaintenance() {
    }


    public void showProcess() {
		for (String s : processList) {
			System.out.print(s + "  ");
			System.out.println();
		}
    }

}
