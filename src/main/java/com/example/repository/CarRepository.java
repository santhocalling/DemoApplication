package com.example.repository;

import com.example.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JE21485 - Santho on 12/20/17.
 */
@Repository("carRepository")
public interface CarRepository extends JpaRepository<Car, Integer> {

    List<Car> findAllByColourNotNull();
}
