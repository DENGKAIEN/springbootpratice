package com.example.pratice;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraticeApplication {

	public static void main(String[] args) {

		//SpringApplication.run(PraticeApplication.class, args);

		SpringApplication app= new SpringApplication(PraticeApplication.class);

		app.setBannerMode(Banner.Mode.OFF);//关闭Spring 横幅
		app.run(args);
	}

}
