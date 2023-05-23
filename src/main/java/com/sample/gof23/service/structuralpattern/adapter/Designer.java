package com.sample.gof23.service.structuralpattern.adapter;

import org.springframework.stereotype.Component;

/**
 * @author 王贤
 */
@Component
public class Designer {

    private String designerName;
    private String works = null;
    private String designs = null;

    public Designer() {
    }

    public Designer(String name) {
        designerName = name;
    }

    public String getFinishWork() {
        designToWorks();
        return works;
    }

    public void setDesign(String design) {
        designs = design;
    }

    public void designToWorks() {
        System.out.println("————按照需求分析设计转化为具体工作————");
        works = designs + getName() + "按照需求设计内容，完成工作。";
    }

    public String getName() {
        return designerName;
    }

    public void setName(String name) {
        this.designerName = name;
    }

    public String getWorks() {
        return works;
    }

    public String getDesigns() {
        return designs;
    }

    public void setDesigns(String designs) {
        this.designs = designs;
    }

}
