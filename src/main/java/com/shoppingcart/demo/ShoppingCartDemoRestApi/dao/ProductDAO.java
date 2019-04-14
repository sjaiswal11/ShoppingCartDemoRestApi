/**
 * 
 */
package com.shoppingcart.demo.ShoppingCartDemoRestApi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppingcart.demo.ShoppingCartDemoRestApi.model.ProductModel;
import com.shoppingcart.demo.ShoppingCartDemoRestApi.repository.ProductRepository;

/**
 * @author smartiesgeeks
 *
 */
@Repository
public class ProductDAO {
	@Autowired
	private ProductRepository productRepository;

	public ProductModel save(ProductModel productModel) {
		return productRepository.saveAndFlush(productModel);
		
	}
	
	public ProductModel get(Integer id) {
		return productRepository.getOne(id);
	}
	
	public List<ProductModel> getAll(){
		return productRepository.findAll();
	}
	
	public ProductModel update(ProductModel productModel) {
		return productRepository.saveAndFlush(productModel);
		
	}
	
	public void delete(Integer id) {
		productRepository.deleteById(id);
		
	}
	
	
}
