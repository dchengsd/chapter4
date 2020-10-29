package com.dch.springboot.chapter4.intercept;


import com.dch.springboot.chapter4.invoke.Invocation;

public interface Interceptor {

    //事前方法
    public boolean before();

    //事后方法
    public void after();

    /**
     * 取代原有数据方法
     * @param invocation
     * @return 原有实践返回对象
     * @throws Exception
     */

    //环绕方法
    public Object around(Invocation invocation) throws Exception;

    //事后返回方法
    public void afterReturning();

    //事后异常方法
    public void afterThrowing();

    //是否使用around方法
    public boolean useAround();

}
