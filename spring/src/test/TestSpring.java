package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    Category c;
    @Test
    public void Test(){
        System.out.println(c.getName());
    }
//    public static void main(String[] args) {
////        ApplicationContext context = new ClassPathXmlApplicationContext(
////                new String[] { "applicationContext.xml" });
////
////        Category c = (Category) context.getBean("c");
//
//        System.out.println(c.getName());
//    }
}

