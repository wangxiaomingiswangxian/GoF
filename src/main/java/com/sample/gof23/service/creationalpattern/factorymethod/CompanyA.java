package com.sample.gof23.service.creationalpattern.factorymethod;

import org.springframework.stereotype.Service;

/**
 * @author 王贤
 */
@Service
public class CompanyA implements Company {

    @Override
    public Product buildProduct(String parameter) {
        if ("A".equals(parameter)) {
            return new ProductA();
        } else if ("B".equals(parameter)) {
            return new ProductB();
        } else {
            return null;
        }
    }

}
