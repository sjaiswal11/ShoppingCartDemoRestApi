/**
 * 
 */
package com.shoppingcart.demo.ShoppingCartDemoRestApi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppingcart.demo.ShoppingCartDemoRestApi.model.OrderModel;
import com.shoppingcart.demo.ShoppingCartDemoRestApi.repository.OrderRepository;

/**
 * @author smartiesgeeks
 *
*/

@Repository
public class OrderDAO {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public OrderModel save(OrderModel OrderModel) {
		return orderRepository.saveAndFlush(OrderModel);
		
	}
	
	public OrderModel get(Integer id) {
		return orderRepository.getOne(id);
	}
	
	public List<OrderModel> getAll(){
		return orderRepository.findAll();
	}
	
	public OrderModel update(OrderModel OrderModel) {
		return orderRepository.saveAndFlush(OrderModel);
		
	}
	
	public void delete(Integer id) {
		orderRepository.deleteById(id);
		
	}
	


}
