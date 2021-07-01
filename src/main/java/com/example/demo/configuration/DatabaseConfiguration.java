package com.example.demo.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource") 
	// spring boot에서 자동으로  configuration 파일을 불러올 수 있음 
	// 사용할 프로퍼티를 prefix = "이 경로" 에서 찾겠다는 의미
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	
	}
}
