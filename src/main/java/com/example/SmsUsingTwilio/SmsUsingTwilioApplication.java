package com.example.SmsUsingTwilio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.*;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SmsUsingTwilioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsUsingTwilioApplication.class, args);
	}

}
