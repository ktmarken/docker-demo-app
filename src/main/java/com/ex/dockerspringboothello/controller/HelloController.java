package com.ex.dockerspringboothello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.dockerspringboothello.model.Hello;
import com.ex.dockerspringboothello.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@PostMapping
	public Hello create(@RequestBody Hello hello) {
		return helloService.create(hello);
	}
	
	@GetMapping
	public List<Hello> findAll() {
		return helloService.findAll();
	}
	
	@GetMapping("/{id}")
	public Hello find(@PathVariable String id) {
		return helloService.find(id);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable String id) {
		helloService.delete(id);
		return "Hello deleted.";
	}
}
