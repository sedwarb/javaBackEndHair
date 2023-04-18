package com.hairdressing.repository;

import com.hairdressing.model.Workers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends CrudRepository <Workers, Long > {
}
