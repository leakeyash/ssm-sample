package aspect;

import java.time.LocalTime;

public class ExecutionTimeAspect {
    public void startExecuting(){
        System.out.println("start executing:"+ LocalTime.now());
    }
    public void endExecuting(){
        System.out.println("end executing:"+ LocalTime.now());
    }
}
