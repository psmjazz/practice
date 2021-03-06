package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AppRunner implements ApplicationRunner{

	@Autowired
	Validator validator;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(validator.getClass());
		MyEvent event = new MyEvent();
//		EventValidator eventValidator = new EventValidator();
		Errors errors = new BeanPropertyBindingResult(event, "event");
		
		validator.validate(event, errors);
		System.out.println(errors.hasErrors());
		
		errors.getAllErrors().forEach(e->{
			System.out.println("eeeeeeeeeeeeeeeeee");
			Arrays.stream(e.getCodes()).forEach(System.out::println);
			System.out.println();
		});
	}
	
}
