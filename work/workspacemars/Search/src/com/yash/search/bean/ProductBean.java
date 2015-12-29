package com.yash.search.bean;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.yash.search.domain.Product;

@ManagedBean
@RequestScoped
public class ProductBean {
	
	 

	Set<String> productSet = new HashSet<>();
	 Set<String> vendorSet = new HashSet<>();
	 Set<String> citySet = new HashSet<>();
	Product product= new Product();
	
	
	public Set<String> getProductSet() {
		return productSet;
	}

	public void setProductSet(Set<String> productSet) {
		this.productSet = productSet;
	}

	public Set<String> getVendorSet() {
		return vendorSet;
	}

	public void setVendorSet(Set<String> vendorSet) {
		this.vendorSet = vendorSet;
	}

	public Set<String> getCitySet() {
		return citySet;
	}

	public void setCitySet(Set<String> citySet) {
		this.citySet = citySet;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	@PostConstruct
	
	public void init(){
		List <Product> list = new ArrayList<Product>();
		
		list.add(new Product("Mobile" , "LG " , " Indore "));
		list.add(new Product("Mobile" , "APPLE" , " Indore "));
		list.add(new Product("Mobile" , "Samsung " , " Pune "));
		list.add(new Product("Mobile" , "LG " , " Mumbai "));
        
		list.add(new Product("Tv" , "Samsung " , " Indore "));
		list.add(new Product("Tv" , "Samsung " , " Mumbai "));
        list.add(new Product("Tv" , "LG " , " Delhi "));
        list.add(new Product("Tv" , " Micromax" , " Indore "));
        list.add(new Product("Tv" , "Philips " , " Indore "));
        list.add(new Product("Tv" , "LG " , " Indore "));
        
        list.add(new Product("Microwave" , "LG " , " Pune "));
        list.add(new Product("Microwave" , "Philips " , " Indore "));
        list.add(new Product("Microwave" , "Samsung" , " Mumbai "));
        list.add(new Product("Microwave" , "LG " , " Indore "));
		

		for(Product li  : list){
			
			productSet.add(li.getProductItems());
			vendorSet.add(li.getVendor());
			citySet.add(li.getCity());
		
		}
            
	}

	public String getProductFromList(){
		return null;
	}
	
	

	
}
