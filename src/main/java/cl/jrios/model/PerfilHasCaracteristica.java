package cl.jrios.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "perfil_has_caracteristica")
@IdClass(PerfilHasCaracteristicaPK.class)
public class PerfilHasCaracteristica {


	@Id
	private Perfil perfil_id;

	@Id
	private Caracteristica caracteristica_id;

	public Perfil getPerfil_id() {
		return perfil_id;
	}

	public void setPerfil_id(Perfil perfil_id) {
		this.perfil_id = perfil_id;
	}

	public Caracteristica getCaracteristica_id() {
		return caracteristica_id;
	}

	public void setCaracteristica_id(Caracteristica caracteristica_id) {
		this.caracteristica_id = caracteristica_id;
	}

	
}
