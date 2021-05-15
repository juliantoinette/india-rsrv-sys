package com.gobus.system.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gobus.system.model.Bus;

import java.util.List;

/**
 * @author julia antoinette
 */

public interface BusRepository extends MongoRepository<Bus, String> {

}
