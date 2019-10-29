package py.daniel.caballero.conf;

import javax.servlet.Filter;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends 
AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AppWebConfiguration.class, JPAConfiguration.class};
	}

	@Override 
	protected Class<?>[] getServletConfigClasses() { 
		// TODO Auto-generated method stub
		return new Class[] {};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};//inicio del proyecto
	}
	
	// Tener habilitado en el EntityManager durante las requisiciones.
	//paquete javax.servlet.Filter 
	 	 	@Override 
	 	 	protected Filter[] getServletFilters() {  	 	return new Filter[]{ 
	 	 	new OpenEntityManagerInViewFilter()}; 
	 	 	} 

	
}

