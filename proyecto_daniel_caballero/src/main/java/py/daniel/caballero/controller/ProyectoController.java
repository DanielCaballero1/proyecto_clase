package py.daniel.caballero.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.daniel.caballero.dao.ProyectoDAO;
import py.daniel.caballero.entidad.Proyecto;


@RestController
@Transactional
@RequestMapping("/proyecto")
public class ProyectoController {

	
	
	@Autowired
	public ProyectoDAO ProyectoDAO;

	//Verbo POST es registrar o guardar
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, value="/{guardar}")										//Convertir de JSON a Java
	public ResponseEntity<Proyecto> guardar(@RequestBody Proyecto Proyecto){

		ProyectoDAO.guardar(Proyecto);


		return new ResponseEntity<Proyecto>(Proyecto, HttpStatus.OK); 

	}


	//Verbo GET es para consulta
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE, value="/{id}")										//Convertir de JSON a Java
	public ResponseEntity<Proyecto> buscarProyecto(@PathVariable Integer id){

		Proyecto Proyecto = ProyectoDAO.buscar(id);

		if(Proyecto==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		//Retorna el Proyecto encontrado
		return new ResponseEntity<Proyecto>(Proyecto, HttpStatus.OK); 

	}


	//Verbo DELETE es para eliminar
	@RequestMapping(method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE, value="eliminar/{id}")										//Convertir de JSON a Java
	public ResponseEntity<Proyecto> eliminarProyecto(@PathVariable Integer id){

		Proyecto Proyecto = ProyectoDAO.buscar(id);

		if(Proyecto==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		ProyectoDAO.eliminar(Proyecto);
		//Retorna la eliminacion correcta
		return new ResponseEntity<Proyecto>(HttpStatus.OK); 

	}
	
	//Listar todos los Proyectos
	//Verbo GET es para consulta
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE,value="/lista")										//Convertir de JSON a Java
	public ResponseEntity<List<Proyecto>> buscarProyectos(){

		List<Proyecto> Proyectos = ProyectoDAO.getLista();
 		
		
		//Retorna el Proyecto encontrado
		return new ResponseEntity<List<Proyecto>>(Proyectos, HttpStatus.OK); 

	}		


}