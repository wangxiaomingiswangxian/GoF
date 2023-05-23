package com.sample.gof23.service.creationalpattern.singleton;

/**
 * @author 王贤
 */
public class ServiceManager {

    private final SaleMan saleMan;

    public ServiceManager() {
        final SaleMan saleMan1 = new SaleMan();
        saleMan1.setName("小刘");
        saleMan1.setService("小刘的服务");
        this.saleMan = saleMan1;
    }

    public SaleMan getSaleManService() {
        return saleMan;
    }

}
