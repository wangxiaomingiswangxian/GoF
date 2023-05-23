package com.sample.gof23.service.structuralpattern.bridge;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 王贤 
 */
@Component
@RequiredArgsConstructor
public class BridgeClient  {

	private final Training action1;


	private final DevelopmentDep depart1;


	private final Meeting action2;


	private final FinanceDep depart2;


	private final Training action3;


	private final MarketDep depart3;
	
	public void scene1() {
		// 场景1：针对开发部的培训工作
		//AbstractAction action = new Training();
		//AbstractDepartment depart = new DevelopmentDep();
		depart1.setAbstractAction(action1);
		depart1.action("提高开发技能");
	}

	public  void scene2() {
		// 场景2：针对财务部的会议
		//AbstractAction action = new Meeting();
		//AbstractDepartment depart = new FinanceDep();
		depart2.setAbstractAction(action2);
		depart2.action("检查会计制度");
	}

	public  void scene3() {
		// 场景2：针对市场部的培训
		//AbstractAction action = new Training();
		//AbstractDepartment depart = new MarketDep();
		depart3.setAbstractAction(action3);
		depart3.action("沟通技巧");
	}
	
	public int run(String... args) {		
		scene1();
		scene2();
		scene3();
		return 0;
	}
	

}
