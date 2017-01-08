version 1.0:
	使用Spring模板创建的spring web app工程（legend project）
	
version 2.0
	使用Spring security。
	spring security 3.0.2可以匹配spring 3.2.3	

version 3.0
	指定定制的login页面.
	
version 4.0
	-- 在spring security中配置用户权限，使用表达式。
		不可以使用access='ROLE_USER'，修改为hasRole等表达式来处理。
	-- 数据库schema设计中，把authentication的roler提取到新的table
		CREATE TABLE `user_role` (
		  `userid` bigint(20) NOT NULL,
		  `rolename` varchar(255) NOT NULL,
		  `id` bigint(20) NOT NULL AUTO_INCREMENT,
		  PRIMARY KEY (`id`)
		) 
		指定的rolename和spring security中的role名称匹配。
		
	-- spring security配置中的authorities-by-username-query对应修改。
		--http 配置中添加 use-expressions="true" 
		
	测试：
		在spring security配置中，指定的