package com.tienda.proveedores;

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
@RequestMapping("/proveedores")
public class ProveedoresController {
	
	@Autowired
	private ProveedoresService serviceCliente;
	
	
	@GetMapping("/listarProveedores")
	
	public ResponseEntity<List<Proveedores>> listarTodos() throws Exception{
		List<Proveedores> lista=serviceCliente.listar();
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
	
	@GetMapping("/buscarProveedoresPorID/{codigo}")
	public ResponseEntity<Proveedores> buscarPorID(@PathVariable("codigo") Integer cod) throws Exception{
		Proveedores bean=serviceCliente.buscar(cod);
		if(bean==null)
			throw new NotFoundException();
		
		return new ResponseEntity<>(bean,HttpStatus.OK); 
	}
	
	@PostMapping("/registrarProveedores")
	public ResponseEntity<Proveedores> registrarProvee(@RequestBody Proveedores cli) throws Exception{
		Proveedores m=serviceCliente.registrar(cli);
		
		return new ResponseEntity<>(m,HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizarProveedores")
	public ResponseEntity<Proveedores> actualizarProvee(@RequestBody Proveedores cli) throws Exception{
		Proveedores bean=serviceCliente.buscar(cli.getPROV_ID());
		if(bean==null)
			throw new NotFoundException();
		else
			bean=serviceCliente.actualizar(cli);
		
		return new ResponseEntity<>(bean,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminarProveedoresPorID/{codigo}")
	public ResponseEntity<Void> eliminarProveePorID(@PathVariable("codigo") Integer cod) throws Exception{
		Proveedores bean=serviceCliente.buscar(cod);
		if(bean==null)
			throw new NotFoundException();
		else
			serviceCliente.eliminar(cod);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
