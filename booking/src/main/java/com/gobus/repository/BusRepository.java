/**
 * 
 */
package com.gobus.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.gobus.data.Bus;

/**
 * @author prabhu.selvakumar
 *
 */
public interface BusRepository extends MongoRepository<Bus, Long> {

	Bus findFirstByBusId(String Id);

	Bus findByBusIdAndBusNumber(String Id, String busNumber);

	// Supports native JSON query string
//	@Query("{busID:'?0'}")
//	Bus findCustomByBusId(String BusId);
//
//	@Query("{busId: { $regex: ?0 } })")
//	List<Bus> findCustomByRegExBusId(String BusId);

}
