package com.sample.gof23.service.behavioralpattern.chainofresponsibility;

/**
 * @author 王贤
 */
public class SuperManThree extends AbstractSuperMan {
    private boolean isAnswer = false;

    @Override
    public void answerTheQuestion(PrimaryMan man) {
        if (man.question(answer)) {
            System.out.println("SuperManThree回答正确。");
        } else {
            if (isAnswer) {
                System.out.println("大家都不能回答这个问题。");
            } else {
                isAnswer = true;
                if (successorSuperMan != null) {
                    System.out.println("SuperManThree不会回答问题，提交下一个。");
                    successorSuperMan.answerTheQuestion(man);
                }
            }
        }
    }

}
