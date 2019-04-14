/**
 * 
 */
package com.shoppingcart.demo.ShoppingCartDemoRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.demo.ShoppingCartDemoRestApi.model.OrderModel;

/**
 * @author smartiesgeeks
 *
 */
public interface OrderRepository extends JpaRepository<OrderModel, Integer> {

}
