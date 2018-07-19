package com.kalaiworld.klabs.projectxapi.repository;

import com.kalaiworld.klabs.projectxapi.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {

}
