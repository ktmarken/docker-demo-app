package com.ex.dockerspringboothello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.dockerspringboothello.model.Hello;
import com.ex.dockerspringboothello.repository.HelloRepository;

@Service
public class HelloService {

	@Autowired
	private HelloRepository helloRepository;
	
	public Hello create(Hello hello) {
		return helloRepository.create(hello);
	}
	
	public Hello find(String id) {
		return helloRepository.find(id);
	}
	
	public List<Hello> findAll() {
		return helloRepository.findAll();
	}
	
	public void delete(String id) {
		helloRepository.delete(id);
	}
}
