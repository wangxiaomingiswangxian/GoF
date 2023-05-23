package com.sample.gof23.service.creationalpattern.abstractfactory;

/**
 * @author 王贤
 */
public interface Company {

    /**
     * 生产电脑
     *
     * @param parameter 参数
     * @return 电脑
     */
    Computer buildComputer(String parameter);

    /**
     * 生产电话
     *
     * @param parameter 参数
     * @return 电话
     */
    Telephone buildTelephone(String parameter);

}
