package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebServiceCjcConsumerTask2Application {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceCjcConsumerTask2Application.class, args);
	}
	
	@Bean
	public RestTemplate rt() {
		RestTemplate rs = new RestTemplate();
		return rs;
	}

}
