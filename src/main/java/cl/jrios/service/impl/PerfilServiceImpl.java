package cl.jrios.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jrios.model.Perfil;
import cl.jrios.repo.IPerfilRepo;
import cl.jrios.service.IPerfilService;

@Service
public class PerfilServiceImpl implements IPerfilService {

	@Autowired
	private IPerfilRepo repo;

	@Override
	public Perfil registrar(Perfil obj) {
		return repo.save(obj);
	}

	@Override
	public Perfil modificar(Perfil obj) {
		return repo.save(obj);
	}

	@Override
	public List<Perfil> listar() {
		return repo.findAll();
	}

	@Override
	public Perfil leerPorId(Integer id) {
		Optional<Perfil> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Perfil();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

	@Override
	public List<Perfil> listarPorRaza(Integer raza_id) {
		List<Perfil> lista = repo.findByRazaId(raza_id);
		return lista;
	}

}
