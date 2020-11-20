package cl.jrios.service;

import java.util.List;

import cl.jrios.model.Perfil;

public interface IPerfilService extends ICRUD<Perfil> {
	public List<Perfil> listarPorRaza(Integer raza_id);
	public List<Perfil> listarPorEdad(Integer edad);
	public List<Perfil> listarPorGenero(Integer genero);
}
