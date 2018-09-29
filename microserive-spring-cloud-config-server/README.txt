请求地址 ：
http://localhost:8888/microserive-spring-cloud-config-server-application.yml  
http://localhost:8888/master/foobar-dev.yml

http://localhost:8888/foobar-dev.yml
注意 ：1.其中 microserive-spring-cloud-config-server 也可以是别的路径如果找不到 ，会找默认git中的application.yml 
	2.git上的文件名最好不要包含-（http://localhost:8888/foobar-dev.yml 其中foobar=application， dev=profile）
访问方式
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties

application是SpringApplication的spring.config.name,(一般来说'application'是一个常规的Spring Boot应用),
profile是一个active的profile(或者逗号分隔的属性列表),
label是一个可选的git标签(默认为"master")。