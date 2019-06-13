package com.epb.epod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EpodWsApplication {
//public class FnbWsApplication extends SpringBootServletInitializer { // for war

	public static void main(String[] args) {
		SpringApplication.run(EpodWsApplication.class, args);
	}
}
