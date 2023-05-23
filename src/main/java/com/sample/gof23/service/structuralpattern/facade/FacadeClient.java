package com.sample.gof23.service.structuralpattern.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class FacadeClient {

    private final Facade facade;

    public int run(String... args) {

        // 向前台要求访客
        facade.operate("visit");
        // 向前台提交邮品
        facade.operate("post");
        // 领导过来视察
        facade.operate("inspection");
        // 员工上班
        facade.operate("doWork");
        // study是没有对应的工作接口
        facade.operate("study");
        return 0;

    }


}
