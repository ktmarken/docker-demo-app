package com.ex.dockerspringboothello.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ex.dockerspringboothello.model.Hello;

@Repository
public class HelloRepository {

	private List<Hello> repository;
	
	{
		repository.add(new Hello("0", "hello"));
		repository.add(new Hello("1", "world"));
		repository.add(new Hello("2", "docker"));
	}
	
	public Hello create(Hello hello) {
		repository.add(hello);
		return hello;
	}
	
	public Hello find(String id) {
		return repository.get(Integer.parseInt(id));
	}
	
	public List<Hello> findAll(){
		return repository;
	}
	
	public void delete(String id) {
		repository.remove(Integer.parseInt(id));
	}
}
