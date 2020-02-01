package org.registrogastos.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.registrogastos.model.Gasto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class GastoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Gasto gasto){
		manager.persist(gasto);
	}
	
}
