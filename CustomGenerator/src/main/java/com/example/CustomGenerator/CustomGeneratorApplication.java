package com.example.CustomGenerator;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.CustomGenerator.entity.CustomGenerator;

@SpringBootApplication
public class CustomGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(CustomGeneratorApplication.class, args);
		CustomGeneratorRepository bean = ctxt.getBean(CustomGeneratorRepository.class);
		CustomGenerator generator = new CustomGenerator();
		generator.setEmpName("Neerkathalingam");
		generator.setJoiningDate(new Date());
		CustomGenerator savedEntity = bean.save(generator);
		System.out.println(savedEntity);
		ctxt.close();
	}

}
