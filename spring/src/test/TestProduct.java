package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Product;

public class TestProduct {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });

        Product product = (Product) context.getBean("product");

        System.out.println(product.getName());
        System.out.println(product.getValue());
    }
}
