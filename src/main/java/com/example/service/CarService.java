package com.example.service;

import com.example.model.Car;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author JE21485 - Santho on 12/20/17.
 */

public interface CarService {
    public List<Car> findUserAllcar();

}
