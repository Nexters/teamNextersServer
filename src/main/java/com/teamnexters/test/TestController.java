package com.teamnexters.test;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/tt/{id}")
	public TestDto getUser(@PathVariable int id){

		TestDto test = new TestDto();

		test.setId(id);
		test.setMessage("hello");

		return test;
	}
}
