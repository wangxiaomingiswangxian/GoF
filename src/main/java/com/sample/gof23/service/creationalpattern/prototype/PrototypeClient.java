package com.sample.gof23.service.creationalpattern.prototype;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
@RequiredArgsConstructor
public class PrototypeClient {
    private final CompanyBaseIntroduction company;

	public int run() {
		AbstractPrototype departA = company.cloneMyself();
        departA.addSomeIntroduction("部门A介绍", "这是部门A介绍的内容");
        AbstractPrototype departB = departA.cloneMyself();
        departB.deleteSomeIntroduction("部门A介绍");
        departB.addSomeIntroduction("部门B介绍", "这是部门B介绍的内容");
        departB.showIntroduction();
        return 0;

    }


}
