package com.sample.gof23.service.structuralpattern.proxy;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class Agency extends AbstractOrganization {

    private Corporation corporation;
    @Override
    public void request() {
        if (corporation == null) {
            corporation = new Corporation();
        }
        corporation.request();
    }
}
