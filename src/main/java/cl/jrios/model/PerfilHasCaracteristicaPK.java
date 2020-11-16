package cl.jrios.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class PerfilHasCaracteristicaPK implements Serializable {

	private static final long serialVersionUID = -6183531511777867847L;

	@ManyToOne
	@JoinColumn(name = "perfil_id", nullable = false)
	private Perfil perfil_id;

	@ManyToOne
	@JoinColumn(name = "caracteristica_id", nullable = false)
	private Caracteristica caracteristica_id;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caracteristica_id == null) ? 0 : caracteristica_id.hashCode());
		result = prime * result + ((perfil_id == null) ? 0 : perfil_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PerfilHasCaracteristicaPK other = (PerfilHasCaracteristicaPK) obj;
		if (caracteristica_id == null) {
			if (other.caracteristica_id != null)
				return false;
		} else if (!caracteristica_id.equals(other.caracteristica_id))
			return false;
		if (perfil_id == null) {
			if (other.perfil_id != null)
				return false;
		} else if (!perfil_id.equals(other.perfil_id))
			return false;
		return true;
	}
	
	
	
}
