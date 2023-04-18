package com.hairdressing.service;

import com.hairdressing.model.Workers;
import com.hairdressing.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class WorkerServiceImpl implements WorkersService {

    @Autowired
    WorkerRepository workerRepository;

    @Override
    public ArrayList<Workers> getAllWorkers() {
        return (ArrayList<Workers>) workerRepository.findAll();
    }

    @Override
    public Optional<Workers> getWorkersById(Long id) {
        return workerRepository.findById(id);
    }

    @Override
    public Workers saveWorkers(Workers workers) {
        return workerRepository.save(workers);
    }

    @Override
    public Boolean deleteWorkersById(Long id) {
        try{
            Optional<Workers> workers = getWorkersById(id);
            workerRepository.delete(workers.get());
            return true;
        }catch (Exception e){return false;}
    }
}
