package py.daniel.caballero.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Encargado {
	@Id
	private double salario;
	
	
	@OneToMany(mappedBy="encargado")
	private List<Proyecto> proyectos;


	public Encargado() {
		this.salario=0.0;
	}
}
