package com.sample.gof23.service.behavioralpattern.chainofresponsibility;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class ChainOfResponsibilityClient {


    private final SuperManOne superMan1 = new SuperManOne();

    private final SuperManTwo superMan2 = new SuperManTwo();

    private final SuperManThree superMan3 = new SuperManThree();

    private final PrimaryMan primaryMan = new PrimaryMan();


    public int run(String... args) {


        //形成一个闭环的链
        superMan1.setSuccessorSuperMan(superMan2);
        superMan2.setSuccessorSuperMan(superMan3);
        superMan3.setSuccessorSuperMan(superMan1);

        //设置提问者的问题和答案
        primaryMan.setThisAnswer("ANSWER");

        //让superMan1能回答这个答案
        superMan1.setAnswer("ANSWER1");

        //让superMan2能回答这个答案
        superMan2.setAnswer("ANSWER2");

        //让superMan3能回答这个答案
        superMan3.setAnswer("ANSWER");
        superMan1.answerTheQuestion(primaryMan);
        return 0;
    }


}
