package com.sample.gof23.service.creationalpattern.factorymethod;

/**
 * @author 王贤
 */
public interface Product {

    /**
     * 产品类型
     *
     * @return 产品类型
     */
    String getProductType();

    /**
     * 产品功能
     */
    void doUse();

}
