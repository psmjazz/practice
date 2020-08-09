//package com.example.demo;
//
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//import org.springframework.validation.ValidationUtils;
//
//public class EventValidator implements Validator{
//
//	@Override
//	public boolean supports(Class<?> clazz) {
//		// TODO Auto-generated method stub
//		return MyEvent.class.equals(clazz);
//	}
//
//	@Override
//	public void validate(Object target, Errors errors) {
//		// TODO Auto-generated method stub
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "othermessage");
//	}
//
//}
