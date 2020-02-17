## 启动顺序：

1.eureka 1025

2.config 1026

3.gateway 8888

4.bullet-websocket 5678

5.hello-webservice 5679

验证websocket

http://127.0.0.1:5678/index.html
查看项目 buulet-websocket 中/resources/static/index.html
请求地址通过gateway http://127.0.0.1:8888";


验证webservice

http://127.0.0.1:8888/hello/Service/hello?wsdl



