package com.example.service;

import com.example.model.Car;
import com.example.repository.CarRepository;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JE21485 - Santho on 12/20/17.
 */
@Service("carService")
public class CarServiceimpl implements CarService {

    @Autowired
    private CarRepository carRepository;
    @Override
    public List<Car> findUserAllcar() {
        return   carRepository.findAllByColourNotNull();

    }
}
