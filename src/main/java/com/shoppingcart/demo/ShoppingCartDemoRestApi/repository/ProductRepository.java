/**
 * 
 */
package com.shoppingcart.demo.ShoppingCartDemoRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.demo.ShoppingCartDemoRestApi.model.ProductModel;

/**
 * @author smartiesgeeks
 *
 */
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

}
