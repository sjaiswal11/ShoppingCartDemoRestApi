/**
 * 
 */
package com.shoppingcart.demo.ShoppingCartDemoRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.demo.ShoppingCartDemoRestApi.dao.OrderDAO;
import com.shoppingcart.demo.ShoppingCartDemoRestApi.model.OrderModel;

/**
 * @author smartiesgeeks
 *
 */

@RequestMapping("order")
@RestController
public class OrderController {

	@Autowired
	private OrderDAO orderDAO;
	
	@RequestMapping("placeorder")
	public OrderModel placeorder(OrderModel OrderModel) {
		return orderDAO.save(OrderModel);
		
	}
	
	@RequestMapping("getorder/{id}")
	public OrderModel getorder(@PathVariable("id") Integer id) {
		return orderDAO.get(id);
	}
	
	@RequestMapping("getallorder")
	public List<OrderModel> getAllOrder(){
		return orderDAO.getAll();
	}
	
	@RequestMapping("updateorder")
	public OrderModel updateorder(OrderModel OrderModel) {
		return orderDAO.update(OrderModel);
		
	}
	
	@RequestMapping("cancle/{id}")
	public void cancle(@PathVariable("id") Integer id) {
		orderDAO.delete(id);
		
	}
	
}
