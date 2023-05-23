package com.sample.gof23.service.structuralpattern.composite;

/**
 * @author 王贤
 */
public class Workshop extends AbstractOrganization {

    public Workshop(String name) {
        super(name);
        organizationType = "Workshop";
    }

    public Workshop() {
        organizationType = "Workshop";
    }

    @Override
    public void add(AbstractOrganization c) {
        System.out.println("这是叶子节点，下面没有内容");
    }

    @Override
    public void showOrganizationStructure(String parentName) {
        String organizationName = this.getOrganizationName();
        System.out.println(parentName + organizationName);
    }

}
