/**
 * 
 */
package com.shoppingcart.demo.ShoppingCartDemoRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.demo.ShoppingCartDemoRestApi.dao.ProductDAO;
import com.shoppingcart.demo.ShoppingCartDemoRestApi.model.ProductModel;

/**
 * @author smartiesgeeks
 *
 */
@RequestMapping("product")
@RestController
public class ProductController {

	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("save")
	public ProductModel save(ProductModel productModel) {
		return productDAO.save(productModel);
		
	}
	
	@RequestMapping("get/{id}")
	public ProductModel get(@PathVariable("id") Integer id) {
		return productDAO.get(id);
	}
	
	@RequestMapping("getall")
	public List<ProductModel> getAll(){
		return productDAO.getAll();
	}
	
	@RequestMapping("update")
	public ProductModel update(ProductModel productModel) {
		return productDAO.update(productModel);
		
	}
	
	@RequestMapping("delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		productDAO.delete(id);
		
	}
	
}
