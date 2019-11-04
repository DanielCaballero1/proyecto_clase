package py.daniel.caballero.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Proyecto {

	@Id
	private Integer codigo;
	private String descripcion;
	

	
	@ManyToOne 
	private Encargado encargado;
	
	public Proyecto() {
	this.codigo=0;
	this.descripcion="";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Encargado getEncargado() {
		return encargado;
	}

	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}



	
	
}
