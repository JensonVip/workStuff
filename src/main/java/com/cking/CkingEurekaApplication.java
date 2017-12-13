package com.cking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册服务器
 * @author Jenson
 * 2017年11月17日 上午8:30:16
 */
@EnableEurekaServer
@SpringBootApplication
public class CkingEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CkingEurekaApplication.class, args);
	}
}
