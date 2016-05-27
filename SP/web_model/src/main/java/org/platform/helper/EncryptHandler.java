package org.platform.helper;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.platform.myAnnotation.AESAnnotion;

/**
 * Created by liuzhongshuai on 16/5/27.
 * 用于自动对特定的方法加密
 */
@Aspect
public class EncryptHandler {



  /*  @Before("anyMethod() && args(name)")
    public void doAccessCheck(String name){
        System.out.println(name);
        System.out.println("前置通知");
    }

    @AfterReturning("anyMethod()")
    public void doAfter(){
        System.out.println("后置通知");
    }

    @After("anyMethod()")
    public void after(){
        System.out.println("最终通知");
    }

    @AfterThrowing("anyMethod()")
    public void doAfterThrow(){
        System.out.println("例外通知");
    }*/

    @Around(value = "execution(* org.platform.service.stu..* (..)) && @annotation(log)")
    public Object doBasicProfiling(ProceedingJoinPoint pjp, AESAnnotion log) throws Throwable{

        System.out.print(pjp.getArgs()[0]);
        System.out.println("进入环绕通知"+"注解类型是"+log.type());
        Object object = pjp.proceed();//执行该方法
        System.out.println("退出方法");
        return object;

    }



}
