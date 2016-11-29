package ar.edu.unlam.pb2clubNoHomeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ClubDeLosNoHomeros {
	private TreeSet<Cliente> losClientes;
	/*Comparator<Cliente> clientesPorEdad = new Comparator<Cliente>() {

		public int compare(Cliente cliente, Cliente otroCliente) {
			return cliente.getEdad().compareTo(otroCliente.getEdad());
		}
		
	
		
	};*/
		
	public ClubDeLosNoHomeros(){
		this.losClientes = new TreeSet<Cliente>();
	}
	
	public void entranClientes(Cliente cliente){
		this.losClientes.add(cliente);
	}
	
	public TreeSet<Cliente> getLosClientes(){
		return this.losClientes;
	}
	
	public TreeSet<Cliente> mostrarClientesPorEdad(){
		TreeSet<Cliente> porEdad = new TreeSet<Cliente>( new Comparator<Cliente>() {

			public int compare(Cliente cliente, Cliente otroCliente) {
				return cliente.getEdad().compareTo(otroCliente.getEdad());
			}
			
		
			
		});
		porEdad.addAll(this.losClientes);
		
		return porEdad;
	}
}
