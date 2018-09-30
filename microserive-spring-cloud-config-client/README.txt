注意事项：
1 client 启动时候加载配置文件的顺序是  本地 bootstrap.yml --> 远程（git config server 中的配置 ） --〉 本地application.yml
	所以需要预先加载的应该放在bootstrap.yml
2 client 
	config-client的spring.application.name必须和自己的配置文件名相匹配。
	例如配置文件为：
	foobar-dev.yml
	这个时候对应的config-cleint的spring.application.name=foobar
	这个时候对应的config-cleint的spring.cloud.config.profile=dev
3 注意
	yml 中的：后面一定要一个空格然后再赋值