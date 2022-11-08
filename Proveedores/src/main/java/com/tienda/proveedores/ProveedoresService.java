package com.tienda.proveedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProveedoresService extends CRUDImpl<Proveedores,Integer>{

	
	@Autowired
	private ProveedoresDAO repo;
	
	@Override
	public JpaRepository<Proveedores, Integer> getRepository() {
		return repo;
	}

}
