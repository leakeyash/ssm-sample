package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Product;
import service.ProductService;

public class TestProductService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });

        ProductService productService = (ProductService) context.getBean("productService");

        productService.doSomeService();
        productService.doAnotherService();
    }
}
