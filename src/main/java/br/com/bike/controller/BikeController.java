package br.com.bike.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bike.model.Bike;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {

	@Autowired
	private BikeRepository bikeRepository;
	
	@GetMapping
	public List<Bike> list(){
		return bikeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Bike> getBike(@PathVariable Long id) {
		return bikeRepository.findById(id);
	}
	
	@PostMapping
	public Bike saveBike(@RequestBody Bike bike) {
		return bikeRepository.save(bike);
	}
	
}
