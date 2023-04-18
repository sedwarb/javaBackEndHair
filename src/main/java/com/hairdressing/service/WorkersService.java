package com.hairdressing.service;

import com.hairdressing.model.Workers;

import java.util.ArrayList;
import java.util.Optional;

public interface WorkersService {
    ArrayList<Workers> getAllWorkers();
    Optional<Workers> getWorkersById(Long id);
    Workers saveWorkers(Workers workers);
    Boolean deleteWorkersById(Long id);
}
