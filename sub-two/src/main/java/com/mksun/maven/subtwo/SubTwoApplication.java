package com.mksun.maven.subtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.mksun.maven.subone"})
public class SubTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubTwoApplication.class, args);
	}

}
