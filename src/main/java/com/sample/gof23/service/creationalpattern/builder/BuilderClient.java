package com.sample.gof23.service.creationalpattern.builder;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class BuilderClient {
    private final ProjectA project1;

    public int run() {
        project1.construct();
        project1.showProcess();
        return 0;
    }

}
