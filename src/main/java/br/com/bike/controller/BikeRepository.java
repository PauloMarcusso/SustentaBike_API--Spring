package br.com.bike.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bike.model.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{

}
