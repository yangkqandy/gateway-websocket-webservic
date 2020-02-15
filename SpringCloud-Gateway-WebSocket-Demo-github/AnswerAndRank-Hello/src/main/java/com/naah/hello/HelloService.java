package com.naah.hello;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "HelloService",                                      //暴露服务名称。
        targetNamespace = "http://hello.naah.com/")//命名空间,一般是接口(interface)的包名倒序

public interface HelloService {

    @WebResult(name = "String", targetNamespace = "")
    public String hello_world(@WebParam(name = "myname") String myname);
}
