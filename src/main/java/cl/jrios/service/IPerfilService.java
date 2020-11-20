package cl.jrios.service;

import java.util.List;

import cl.jrios.model.Perfil;

public interface IPerfilService extends ICRUD<Perfil> {
	public List<Perfil> listarPorRaza(Integer raza_id) ;
}
