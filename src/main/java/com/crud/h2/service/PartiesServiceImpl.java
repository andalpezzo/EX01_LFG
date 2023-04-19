package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.PartiesDAO;
import com.crud.h2.dto.Parties;

@Service
public class PartiesServiceImpl implements PartiesService{
	
	//Utilizamos los metodos de la interface PartiesDAO, es como si instaciaramos.
	@Autowired
	PartiesDAO partiesDAO;
	
	@Override
	public List<Parties> listarParties() {
		
		return partiesDAO.findAll();
	}

	@Override
	public Parties guardarParty(Parties party) {
		
		return partiesDAO.save(party);
	}

	@Override
	public Parties partyXID(Long id) {
		
		return partiesDAO.findById(id).get();
	}
	
	@Override
	public List<Parties> listarPartiesNombre(String nombre) {
		
		return partiesDAO.findByNombre(nombre);
	}
	
	@Override
	public Parties actualizarParty(Parties party) {
		
		return partiesDAO.save(party);
	}

	@Override
	public void eliminarParty(Long id) {
		
		partiesDAO.deleteById(id);
		
	}

	public List<Parties> findByGameNombre(String nombre) {
		
		return partiesDAO.findByGameNombre(nombre);
	}
}
