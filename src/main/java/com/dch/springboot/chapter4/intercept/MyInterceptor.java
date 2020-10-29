package com.dch.springboot.chapter4.intercept;

import com.dch.springboot.chapter4.invoke.Invocation;

import java.net.SocketTimeoutException;

public class MyInterceptor implements Interceptor {
    @Override
    public boolean before() {
        System.out.println("-----------Before 方法执行-----------");
        return true;
    }

    @Override
    public void after() {
        System.out.println("------------after 方法执行------------");

    }

    @Override
    public Object around(Invocation invocation) throws Exception {
        Object object = invocation.proceed();
        System.out.println("------------around after------------");
        return object;
    }

    @Override
    public void afterReturning() {
        System.out.println("-----------afterReturning------------");
    }

    @Override
    public void afterThrowing() {
        System.out.println("------------afterThrowing------------");
    }

    @Override
    public boolean useAround() {
        return true;
    }
}
