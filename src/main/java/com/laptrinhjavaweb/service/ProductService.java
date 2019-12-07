package com.laptrinhjavaweb.service;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ProductService extends BaseService {
	@Autowired EntityManager entityManager;
	
	public ProductService() {
	}
	
	public List<Tuple> display(){
		String jpql = "select a, b from Image a, Product b where a.product.ProductId = b.ProductId";
		
		@SuppressWarnings("unchecked")
		List<Tuple> result = (List<Tuple>) executeListQuery(jpql,  Tuple.class, Collections.EMPTY_MAP);
		return result;
	}
}
