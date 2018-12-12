package com.analysis.schema;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试自定义schema<br/>
 *
 * @author pengc
 * @see com.analysis.schema
 * @since 2018/12/12
 */
public class TestSpringSchema {

    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml/application.xml");
        People people = (People) context.getBean("agan");
        System.out.println("名称》"+people.getName());
    }

}
