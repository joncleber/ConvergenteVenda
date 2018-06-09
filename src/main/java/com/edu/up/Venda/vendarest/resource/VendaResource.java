package com.edu.up.Venda.vendarest.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.up.Venda.vendarest.model.Venda;
import com.edu.up.Venda.vendarest.repository.VendaRepository;

@RestController
@RequestMapping("/vendas")
public class VendaResource {
	
	@Autowired
	private VendaRepository vr;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Venda> listaVendas()
	{
		Iterable<Venda> listaVenda = vr.findAll();
		return listaVenda;
		
	}
	
	@PostMapping
	public Venda cadastrarCliente(@RequestBody @Valid Venda venda)
	{
		
		return vr.save(venda);
	}
	
	@DeleteMapping
	public Venda deletarCliente(@RequestBody Venda venda )
	{
		vr.delete(venda);
		return venda;
				
	}

}
