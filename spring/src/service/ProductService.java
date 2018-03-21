package service;

import org.springframework.stereotype.Component;

@Component("productService")
public class ProductService {
    public void doSomeService(){
        System.out.println("doSomeService");
    }
    public void doAnotherService(){
        System.out.println("doAnotherService");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
