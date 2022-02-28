package com.example.rabbit.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbit.domain.Rabbit;
import com.example.rabbit.service.RabbitService;



@RestController 

public class RabbitController {
	
	private RabbitService service;
	
	

	@Autowired
	public RabbitController(RabbitService service) {
		super();
		this.service=service;
	}
	
	@PostMapping("/create")

	public ResponseEntity<Rabbit> createRabbit(@RequestBody Rabbit r) {
		Rabbit created = this.service.createRabbit(r);
		ResponseEntity<Rabbit> response = new ResponseEntity<Rabbit>(created, HttpStatus.CREATED);
		return response;
	}
	
	
	@GetMapping("/getAll") 
	public ResponseEntity<List<Rabbit>> getAllRabbit() {
		return ResponseEntity.ok(this.service.getAllRabbit());
	}
	
	
	@GetMapping("/get/{id}") 
	public Rabbit getRabbit(@PathVariable Integer id) {
		return this.service.getRabbit(id);
	}
	
	
	@PutMapping("/replace/{id}")
	public ResponseEntity<Rabbit> replaceRabbit(@PathVariable Integer id, @RequestBody Rabbit newRabbit) {
		Rabbit body = this.service.replaceRabbit(id, newRabbit);
		ResponseEntity<Rabbit> response = new ResponseEntity<Rabbit>(body, HttpStatus.ACCEPTED);
		return response;
	}
	
	@DeleteMapping("/remove/{id}") 
	public ResponseEntity<?> removeRabbit(@PathVariable Integer id) {
		this.service.removeRabbit(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
