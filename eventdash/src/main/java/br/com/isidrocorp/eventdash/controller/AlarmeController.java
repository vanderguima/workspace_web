package br.com.isidrocorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.AlarmeDAO;
import br.com.isidrocorp.eventdash.model.Alarme;
@RestController
public class AlarmeController {
	
	// O autowired é responsávl por buscar o objeto que faz a implementação da interface e criar a
	// instanciação do objeto, sem a necessidade de dar new
	
	@Autowired
	private AlarmeDAO dao;
	
	// metodo que retorna todos os alarmes gravados no banco
	
	@GetMapping("/alarmes")
	public ArrayList<Alarme> recuperarTodos(){
		// basicamente ele conecta no banco e faz um select
		
		ArrayList<Alarme> lista;
		lista = (ArrayList<Alarme>) dao.findAll();
		return lista;
		
	}
}