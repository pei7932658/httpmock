package com.cyc.httpmock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@ServletComponentScan
@Slf4j
public class HttpMockApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HttpMockApplication.class);
	}

	public static void main(String args[]) {
		SpringApplication.run(HttpMockApplication.class, args);
		log.info(">>>>>>>>>>>>>>>>>>>>>>httpmock 启动成功!<<<<<<<<<<<<<<<<<<<<<<<<<");
		
	}

}
