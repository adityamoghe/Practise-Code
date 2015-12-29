package com.yash.search.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ProductService
 */
@Stateless
@LocalBean
public class ProductService implements ProductServiceLocal {

   
    public ProductService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Object displayList() {
		// TODO Auto-generated method stub
		return null;
	}
    
    

}
