package com.sl.ms.ordermanagement1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class OrderManagement1Application {
	private final static  Logger logger = LoggerFactory.getLogger(OrderManagement1Application.class.getName());
	
	
	public static void main(String[] args) {
		logger.info("inside OrderManagement1Application class");
		SpringApplication.run(OrderManagement1Application.class, args);
	}

}
