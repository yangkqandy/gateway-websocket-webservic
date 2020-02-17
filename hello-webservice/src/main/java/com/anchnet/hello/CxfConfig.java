package com.anchnet.hello;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;   //private SpringBus bus;

    //  配置CXF服务发布，默认服务是在host:port/services/发布地址
    //访问地址 http://127.0.0.1:8080/Service/hello?wsdl
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,  new HelloServiceImpl());
        endpoint.publish("/hello");    //发布地址
        return endpoint;
    }
}

