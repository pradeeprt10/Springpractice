package com.practice.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.practice.dao")
public class Config {

  @Bean(name = "dtsource")
	public DriverManagerDataSource getDataSource() {		
		DriverManagerDataSource dtsource = new DriverManagerDataSource();		
		dtsource.setDriverClassName("org.springframework.jdbc.datasource.DriverManagerDataSource");
		dtsource.setUrl("jdbc:mysql://localhost:3306/db");
		dtsource.setUsername("root");
		dtsource.setPassword("password");		
		return dtsource;
	}
  @Bean(name = "template") 
public JdbcTemplate getTemplate() {
	
	JdbcTemplate tmplate = new JdbcTemplate();
	tmplate.setDataSource(getDataSource());
	return tmplate;
	
}
  
  

}
