package com.shitikov.project.model.service;

import com.shitikov.project.model.entity.Car;
import com.shitikov.project.model.exception.ServiceException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CarService {
    boolean add(Map<String, String> parameters, String login) throws ServiceException;

    boolean remove(String carNumber) throws ServiceException;

    Optional<Car> findByNumber(String carNumber) throws ServiceException;

    List<Car> findAll() throws ServiceException;

    boolean updateParameters(String carNumber, Map<String, String> parameters) throws ServiceException;
}