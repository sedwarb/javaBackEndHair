package com.hairdressing.repository;

import com.hairdressing.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <Users, Long> {
}
