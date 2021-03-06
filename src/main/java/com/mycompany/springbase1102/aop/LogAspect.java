
package com.mycompany.springbase1102.aop;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)//數字越小越先被執行
public class LogAspect {
    @Pointcut(value = "execution(* com.mycompany.springbase1102.aop.*.*(..))")
    public void cut() {
        
    }
    //(Advice)
    //@Before(value = "execution(public int com.mycompany.springbase1102.aop.CalcImpl.add(int , int ))")//切入點表達式
    @Before(value = "cut()")
    public static void before(JoinPoint joinPoint) {
        
        //獲取方法名稱
        String methName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.printf("方法名稱: %s , 方法參數: %s\n", methName, Arrays.toString(args));
    }
    
    @After(value = "cut()")
    public static void after() {
        System.out.println("後置通知:");
    }
    
    //獲取返回值
    @AfterReturning(value = "cut()", returning = "result")
    public void afterReturning(Object result) {
        System.out.printf("返回通知: result= %s\n", result);
    }
    
    @AfterThrowing(value = "cut()", throwing = "ex")
    public void afterThrowing(Exception ex) {
        System.out.printf("例外通知: ex= %s\n", ex);
    }
    
}
