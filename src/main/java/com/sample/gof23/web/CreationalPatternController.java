package com.sample.gof23.web;

import com.sample.gof23.service.creationalpattern.abstractfactory.AbstractFactoryClient;
import com.sample.gof23.service.creationalpattern.builder.BuilderClient;
import com.sample.gof23.service.creationalpattern.factorymethod.FactoryMethodClient;
import com.sample.gof23.service.creationalpattern.prototype.PrototypeClient;
import com.sample.gof23.service.creationalpattern.singleton.SingletonClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建型模式
 * @author 王贤
 */
@RestController
@RequestMapping("gof23")
@RequiredArgsConstructor
public class CreationalPatternController {

    private final FactoryMethodClient factoryMethodClient;
    private final AbstractFactoryClient abstractFactoryClient;
    private final BuilderClient builderClient;
    private final PrototypeClient prototypeClient;
    private final SingletonClient singletonClient;

    @GetMapping("factory-method")
    public String factoryMethodClient() {
        factoryMethodClient.run();
        return "factoryMethod is running OK;";
    }

    @GetMapping("abstract-factory")
    public String abstractFactoryClient() {
        abstractFactoryClient.run();
        return "abstractFactory is running OK;";
    }


    @GetMapping("builder")
    public String builderClient() {
        builderClient.run();
        return "builder is running OK;";
    }


    @GetMapping("prototype")
    public String prototypeClient() {
        prototypeClient.run();
        return "prototype is running OK;";
    }


    @GetMapping("singleton")
    public String singletonClient() {
        singletonClient.run();
        return "singleton is running OK;";
    }
}
