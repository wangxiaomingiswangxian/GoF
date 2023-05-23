package com.sample.gof23.service.creationalpattern.prototype;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 王贤
 */
@Component
public class CompanyBaseIntroduction extends AbstractPrototype {
    private Map<String, String> introductionMap = new HashMap<>();

    public CompanyBaseIntroduction() {
    }

    public CompanyBaseIntroduction(Map<String, String> map) {
        introductionMap = map;
    }

    @Override
    public AbstractPrototype cloneMyself() {
        addSomeIntroduction("公司介绍", "这是公司基本介绍");
		return new CompanyBaseIntroduction(introductionMap);
    }

    @Override
    public void addSomeIntroduction(String topic, String content) {
        introductionMap.put(topic, content);
    }

    @Override
    public void deleteSomeIntroduction(String key) {
		introductionMap.remove(key);
    }

    public void addIntroductionMap(Map<String, String> map) {
        introductionMap.putAll(map);
    }

    public Map<String, String> getIntroductionMap() {
        return introductionMap;
    }

    @Override
    public void showIntroduction() {
        Iterator<String> it = introductionMap.keySet().iterator();
        String key, value;
        while (it.hasNext()) {
            key = it.next();
            value = introductionMap.get(key);
            System.out.println("key: " + key + "; value: " + value);
        }
    }

}
