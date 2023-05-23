package com.sample.gof23.web;

import com.sample.gof23.service.structuralpattern.adapter.AdapterClient;
import com.sample.gof23.service.structuralpattern.bridge.BridgeClient;
import com.sample.gof23.service.structuralpattern.composite.CompositeClient;
import com.sample.gof23.service.structuralpattern.decorator.DecoratorClient;
import com.sample.gof23.service.structuralpattern.facade.FacadeClient;
import com.sample.gof23.service.structuralpattern.flyweight.FlyweightClient;
import com.sample.gof23.service.structuralpattern.proxy.ProxyClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王贤
 */
@RestController
@RequestMapping("gof23")
@RequiredArgsConstructor
public class Gof23StructuralPatternSource {

    private final AdapterClient adapterClient;

    private final BridgeClient bridgeClient;

    private final CompositeClient compositeClient;

    private final DecoratorClient decoratorClient;

    private final FacadeClient facadeClient;

    private final FlyweightClient flyweightClient;

    private final ProxyClient proxyClient;


    @GetMapping("adapter")
    public String adapterClient() {
        adapterClient.run("adapterClient");
        return "adapter is running OK;";
    }

    @GetMapping("bridge")
    public String bridgeClient() {
        bridgeClient.run("bridgeClient");
        return "bridge is running OK;";
    }

    @GetMapping("composite")
    public String compositeClient() {
        compositeClient.run("compositeClient");
        return "composite is running OK;";
    }

    @GetMapping("decorator")
    public String decoratorClient() {
        decoratorClient.run("decoratorClient");
        return "decorator is running OK;";
    }

    @GetMapping("facade")
    public String facadeClient() {
        facadeClient.run("facadeClient");
        return "facade is running OK;";
    }

    @GetMapping("flyweight")
    public String flyweightClient() {
        flyweightClient.run("flyweightClient");
        return "flyweight is running OK;";
    }

    @GetMapping("proxy")
    public String proxyClient() {
        proxyClient.run("proxyClient");
        return "proxy is running OK;";
    }


}