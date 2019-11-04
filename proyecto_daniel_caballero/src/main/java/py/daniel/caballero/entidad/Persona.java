package py.daniel.caballero.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Persona {
	@Id
	@GeneratedValue
	private Integer ci;


	public Persona() {
		this.ci=0;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}



}



