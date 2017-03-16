package com.infy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
	@Autowired
	OrderRepsitory orderRepository;
	
	
	
	@RequestMapping("/update")
	 public Map<String, Object> update(@RequestParam String orderId, @RequestParam String status) {
		Order order = orderRepository.findOne(orderId);
		order.setStatus(status);;
		order = orderRepository.save(order);
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("orders", order);
	     return dataMap;
	 }
	 @RequestMapping("/readone")
	 public Map<String, Object> read(@RequestParam Double price) {
	  //Order order = orderRepository.findOne(orderId);
	  Order order1 = orderRepository.findByPrice(price);
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("orders", order1);
	  return dataMap;
	 }
	@CrossOrigin
	@RequestMapping("/reports")
	public Map<String, Object> getReports()
	{
		List<Order> orders = orderRepository.findAll();
		Map<String, Object> dataMap = new HashMap<String, Object>();
		/*orders.add(new Order(2151, "Completed", "03/10/2017", new Float(39.58)));
		orders.add(new Order(2152, "Completed", "03/10/2017", new Float(39.58)));
		orders.add(new Order(897556, "Hold", "02/28/2017", new Float(09.25)));
		orders.add(new Order(8755, "Completed", "01/18/2017", new Float(98.00)));
		orders.add(new Order(98, "Completed", "01/25/2017", new Float(2.87)));
		orders.add(new Order(54826, "Pending", "03/05/2017", new Float(56.23)));*/
		
		dataMap.put("orders", orders);
		return dataMap;
	}


}
