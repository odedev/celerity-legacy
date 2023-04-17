package dev.odes.celerity.app.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"dev.odes.celerity.core.*"})
@ComponentScan(basePackages = {"dev.odes.celerity.core.*"})
public class CelerityAppMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CelerityAppMainApplication.class, args);
	}

}
