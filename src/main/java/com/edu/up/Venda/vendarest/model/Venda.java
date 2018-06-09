package com.edu.up.Venda.vendarest.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	private int Quantidade;
	
	private Date DataVenda;
	
	private Double ValorCompra;
	
	private Double ValorTotal;
	
	private String NomeProduto;
	
	private String ID_Produto;
	
	private String NomeCliente;
	
	private String ID_Cliente;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public Date getDataVenda() {
		return DataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		DataVenda = dataVenda;
	}

	public Double getValorCompra() {
		return ValorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		ValorCompra = valorCompra;
	}

	public Double getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		ValorTotal = valorTotal;
	}

	public String getNomeProduto() {
		return NomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}

	public String getID_Produto() {
		return ID_Produto;
	}

	public void setID_Produto(String iD_Produto) {
		ID_Produto = iD_Produto;
	}

	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	public String getID_Cliente() {
		return ID_Cliente;
	}

	public void setID_Cliente(String iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
}
