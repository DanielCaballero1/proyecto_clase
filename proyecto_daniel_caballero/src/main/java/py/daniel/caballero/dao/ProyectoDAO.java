package py.daniel.caballero.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import py.daniel.caballero.entidad.Proyecto;

public class ProyectoDAO extends DAOGenerico<Proyecto>{

	@PersistenceContext
	private EntityManager manager;
	

	public ProyectoDAO() {
		super(Proyecto.class);
		
	}

	@Override
	protected EntityManager getEntityManager() {
		
		
		return manager;
	}

	
	
}
