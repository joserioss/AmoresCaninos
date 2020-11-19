package cl.jrios.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jrios.model.Raza;
import cl.jrios.repo.IRazaRepo;
import cl.jrios.service.IRazaService;

@Service
public class RazaServiceImpl implements IRazaService {

	@Autowired
	private IRazaRepo repo;

	@Override
	public Raza registrar(Raza obj) {
		return repo.save(obj);
	}

	@Override
	public Raza modificar(Raza obj) {
		return repo.save(obj);
	}

	@Override
	public List<Raza> listar() {
		return repo.findAll();
	}

	@Override
	public Raza leerPorId(Integer id) {
		Optional<Raza> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Raza();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
