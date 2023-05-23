package com.sample.gof23.web;

import com.sample.gof23.service.behavioralpattern.chainofresponsibility.ChainOfResponsibilityClient;
import com.sample.gof23.service.behavioralpattern.command.CommandClient;
import com.sample.gof23.service.behavioralpattern.interpreter.InterpreterClient;
import com.sample.gof23.service.behavioralpattern.iterator.IteratorClient;
import com.sample.gof23.service.behavioralpattern.mediator.MediatorClient;
import com.sample.gof23.service.behavioralpattern.memento.MementoClient;
import com.sample.gof23.service.behavioralpattern.observer.ObserverClient;
import com.sample.gof23.service.behavioralpattern.state.StateClient;
import com.sample.gof23.service.behavioralpattern.strategy.StrategyClient;
import com.sample.gof23.service.behavioralpattern.template.TemplateClient;
import com.sample.gof23.service.behavioralpattern.visitor.VisitorClient;
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
public class BehavioralPatternController {

    private final ChainOfResponsibilityClient chainofresponsibilityClient;

    private final CommandClient commandClient;

    private final InterpreterClient interpreterClient;

    private final IteratorClient iteratorClient;

    private final MediatorClient mediatorClient;

    private final MementoClient mementoClient;

    private final ObserverClient observerClient;

    private final StateClient stateClient;

    private final StrategyClient strategyClient;

    private final TemplateClient templateClient;

    private final VisitorClient visitorClient;


    @GetMapping("chain-of-responsibility")
    public String chainOfResponsibilityClient() {
        chainofresponsibilityClient.run("chainOfResponsibilityClient");
        return "chainOfResponsibility is running OK;";
    }

    @GetMapping("command")
    public String commandClient() {
        commandClient.run("commandClient");
        return "command is running OK;";
    }

    @GetMapping("interpreter")
    public String interpreterClient() {
        interpreterClient.run("interpreterClient");
        return "interpreter is running OK;";
    }

    @GetMapping("iterator")
    public String iteratorClient() {
        iteratorClient.run("iteratorClient");
        return "iterator is running OK;";
    }

    @GetMapping("mediator")
    public String mediatorClient() {
        mediatorClient.run("mediatorClient");
        return "mediator is running OK;";
    }

    @GetMapping("memento")
    public String mementoClient() {
        mementoClient.run("mementoClient");
        return "memento is running OK;";
    }

    @GetMapping("observer")
    public String observerClient() {
        observerClient.run("observerClient");
        return "observer is running OK;";
    }

    @GetMapping("state")
    public String stateClient() {
        stateClient.run("stateClient");
        return "state is running OK;";
    }

    @GetMapping("strategy")
    public String strategyClient() {
        strategyClient.run("strategyClient");
        return "strategy is running OK;";
    }

    @GetMapping("template")
    public String templateClient() {
        templateClient.run("templateClient");
        return "template is running OK;";
    }

    @GetMapping("visitor")
    public String visitorClient() {
        visitorClient.run("visitorClient");
        return "visitor is running OK;";
    }

}