package com.sample.gof23.service.behavioralpattern.template;

/**
 * @author 王贤
 */
public interface ProjectProcess {

    /**
     * 可行性分析过程
     *
     * @param content 内容
     */
    void feasibilityProcess(String content);

    /**
     * 技术交流过程
     *
     * @param content 内容
     */
    void technicalDiscussionProcess(String content);

    /**
     * 投标过程
     *
     * @param content 内容
     */
    void bidProcess(String content);

    /**
     * 需求调研和分析过程
     *
     * @param content 内容
     */
    void requirementProcess(String content);

    /**
     * 设计过程
     *
     * @param content 内容
     */
    void designProcess(String content);

    /**
     * 编码过程
     *
     * @param content 内容
     */
    void programProcess(String content);

    /**
     * 测试过程
     *
     * @param content 内容
     */
    void testProcess(String content);

    /**
     * 部署和实施过程
     *
     * @param content 内容
     */
    void deploymentProcess(String content);

    /**
     * 维护过程
     *
     * @param content 内容
     */
    void maintenanceProcess(String content);

    /**
     * 做实际工作
     */
    void doActualWork();

    /**
     * 显示过程
     */
    void showProcess();

}
