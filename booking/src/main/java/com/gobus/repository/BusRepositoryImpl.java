/**
 * 
 */
package com.gobus.repository;

import com.gobus.data.Bus;
import com.mongodb.client.result.UpdateResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * @author prabhu.selvakumar
 *
 */
public class BusRepositoryImpl implements BusRepositoryCustom {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public int updateBus(String busId, String busNumber) {

		Query query = new Query(Criteria.where("busId").is(busId));
		Update update = new Update();
		update.set("busNumber", busNumber);

		UpdateResult result = mongoTemplate.updateFirst(query, update, Bus.class);

		if (result != null && result.getUpsertedId() != null)
			return 1;
		else
			return 0;
	}

}
