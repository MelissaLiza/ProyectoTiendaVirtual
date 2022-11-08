package com.tienda.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/producto")
public class ProductController {
	
	@Autowired
	private ProductService serviceProducto;
	
	
	@GetMapping("/listarProductos")
	
	public ResponseEntity<List<Product>> listarTodos() throws Exception{
		List<Product> lista=serviceProducto.listar();
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
	
	@GetMapping("/buscarProductoPorID/{codigo}")
	public ResponseEntity<Product> buscarPorID(@PathVariable("codigo") Integer cod) throws Exception{
		Product bean=serviceProducto.buscar(cod);
		if(bean==null)
			throw new NotFoundException();
		
		return new ResponseEntity<>(bean,HttpStatus.OK); 
	}
	
	@PostMapping("/registrarProducto")
	public ResponseEntity<Product> registrarProducto(@RequestBody Product pro) throws Exception{
		Product m=serviceProducto.registrar(pro);
		
		return new ResponseEntity<>(m,HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizarProducto")
	public ResponseEntity<Product> actualizarProducto(@RequestBody Product pro) throws Exception{
		Product bean=serviceProducto.buscar(pro.getId());
		if(bean==null)
			throw new NotFoundException();
		else
			bean=serviceProducto.actualizar(pro);
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminarProductoPorID/{codigo}")
	public ResponseEntity<Void> eliminarProductoPorID(@PathVariable("codigo") Integer cod) throws Exception{
		Product bean=serviceProducto.buscar(cod);
		if(bean==null)
			throw new NotFoundException();
		else
			serviceProducto.eliminar(cod);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
