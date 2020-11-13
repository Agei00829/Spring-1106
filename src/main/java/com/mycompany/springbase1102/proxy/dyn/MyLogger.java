
package com.mycompany.springbase1102.proxy.dyn;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.springframework.jmx.export.assembler.MethodNameBasedMBeanInfoAssembler;


public class MyLogger {
    public static void before(Class cls, String methodName, Object[] args) {
        System.out.printf("before log: %s %s %s \n", cls, methodName, Arrays.toString(args));
    }
    
    public static void end(Class cls, String methodName, Object result) {
        System.out.printf("end log: %s %s %s \n", cls, methodName, result);
    }
}
