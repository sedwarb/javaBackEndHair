package com.hairdressing.repository;

import com.hairdressing.model.Entries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntriesRepository extends CrudRepository <Entries, Long> {
}
