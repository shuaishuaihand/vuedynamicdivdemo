package com.hand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@Controller
@SpringBootApplication
@MapperScan("com.hand.hand.mapper")
/*@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})*/
public class VuetreeselectdemodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VuetreeselectdemodemoApplication.class, args);
	}

	@RequestMapping("/")
	public String toIndex(){
		return "index";
	}
}
