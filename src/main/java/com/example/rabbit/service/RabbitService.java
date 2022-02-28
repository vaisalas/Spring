package com.example.rabbit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.rabbit.domain.Rabbit;

@Service
public class RabbitService {
	
	private List<Rabbit> rabbit = new ArrayList<>();

	// CREATE
	public Rabbit createRabbit(Rabbit r) {
		this.rabbit.add(r);
		Rabbit created = this.rabbit.get(this.rabbit.size() - 1);
		return created;
	}

	// READ
	public List<Rabbit> getAllRabbit() {
		return this.rabbit;
	}

	public Rabbit getRabbit(Integer id) {
		return this.rabbit.get(id);
	}

	// UPDATE
	public Rabbit replaceRabbit(Integer id, Rabbit newRabbit) {
		Rabbit body = this.rabbit.set(id, newRabbit);
		return body;
	}

	// DELETE
	public void removeRabbit(@PathVariable Integer id) {
		this.rabbit.remove(id.intValue());
	}

}
