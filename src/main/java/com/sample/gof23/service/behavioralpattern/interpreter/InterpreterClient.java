package com.sample.gof23.service.behavioralpattern.interpreter;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王贤
 */
@Component
public class InterpreterClient {


    private final Project project1 = new Project();

    private final FinancialDepExpression financialDepExpression = new FinancialDepExpression();

    private final MarketDepExpression marketDepExpression = new MarketDepExpression();

    private final TechnicalDepExpression technicalDepExpression = new TechnicalDepExpression();


    public int run(String... args) {


        project1.setProjectName("ProjectA");
        List<AbstractExpression> expressList = new ArrayList<>();

        expressList.add(financialDepExpression);
        expressList.add(marketDepExpression);
        expressList.add(technicalDepExpression);

        for (AbstractExpression abstractExpression : expressList) {
            abstractExpression.interpret(project1);
        }
        return 0;
    }

}
