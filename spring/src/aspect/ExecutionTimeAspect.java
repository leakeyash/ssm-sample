package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Aspect
@Component
public class ExecutionTimeAspect {
    @Before(value = "execution(* service.ProductService.doAnotherService(..)) or execution(* service.ProductService.doSomeService(..))")
    public void startExecuting(){
        System.out.println("start executing:"+ LocalTime.now());
    }
    @After(value = "execution(* service.ProductService.doAnotherService(..))")
    public void endExecuting(){
        System.out.println("end executing:"+ LocalTime.now());
    }
}
