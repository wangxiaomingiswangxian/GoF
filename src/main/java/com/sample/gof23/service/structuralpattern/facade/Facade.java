package com.sample.gof23.service.structuralpattern.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class Facade {

    private final Visit visit = new Visit();

    private final Post post = new Post();

    private final Inspection inspection = new Inspection();

    private final DoWork doWork = new DoWork();

    public void operate(String operation) {
        if ("visit".equalsIgnoreCase(operation)) {
            visit.operate();
        } else if ("post".equalsIgnoreCase(operation)) {
            post.operate();
        } else if ("inspection".equalsIgnoreCase(operation)) {
            inspection.operate();
        } else if ("doWork".equalsIgnoreCase(operation)) {
            doWork.operate();
        } else {
            System.out.println("没有对应事项，不能工作。");
        }

    }

}
