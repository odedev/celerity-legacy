package dev.odes.celerity.app.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.TimeZone;

@SpringBootApplication
@MapperScan(basePackages = {"dev.odes.celerity.core.**.mapper"})
@ComponentScan(basePackages = {"dev.odes.celerity.core.*"})
public class CelerityAppMainApplication {

	public static void main(String[] args) {
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		SpringApplication.run(CelerityAppMainApplication.class, args);
	}

}
