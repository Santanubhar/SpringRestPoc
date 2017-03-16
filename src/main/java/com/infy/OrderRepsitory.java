package com.infy;
import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OrderRepsitory extends MongoRepository<Order, String>{
	Order findByPrice(Double price);
}
