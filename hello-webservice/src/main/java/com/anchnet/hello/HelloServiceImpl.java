package com.anchnet.hello;

import javax.jws.WebService;

//@WebService表示该类是一个服务类，需要发布其中的public的方法
@WebService(serviceName = "HelloService",      // 该webservice服务的名称,与接口中指定的name一致,对外发布的服务名
        targetNamespace = "http://hello.anchnet.com/",   //名称空间，通常使用接口包名反转
        endpointInterface = "com.anchnet.hello.HelloService")  //服务接口全路径

public class HelloServiceImpl implements HelloService {

    @Override
    public String hello_world(String myname) {
        //Thread.currentThread().sleep(2000);
        return "hello_world ," + myname;
    }
}