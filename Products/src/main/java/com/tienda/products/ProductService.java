package com.tienda.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends CRUDImpl<Product,Integer>{

	
	@Autowired
	private ProductDAO repo;
	
	@Override
	public JpaRepository<Product, Integer> getRepository() {
		return repo;
	}

}
