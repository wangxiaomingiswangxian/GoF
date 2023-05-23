package com.sample.gof23.service.creationalpattern.abstractfactory;

/**
 * @author 王贤
 */
public class PersonalComputer extends Computer {
    @Override
    public void doUse() {
        System.out.println("这是个人计算机的功能");
    }

}
