/**
 * 
 */
package com.shoppingcart.demo.ShoppingCartDemoRestApi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author smartiesgeeks
 *
 */
@Entity
public class OrderModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	
	private String emailId;
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="id")
	private List<ProductOrderModel> productList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<ProductOrderModel> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductOrderModel> productList) {
		this.productList = productList;
	}
	
	
}
