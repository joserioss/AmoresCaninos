package cl.jrios.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jrios.model.Caracteristica;
import cl.jrios.repo.ICaracteristicaRepo;
import cl.jrios.service.ICaracteristicaService;

@Service
public class CaracteristicaServiceImpl implements ICaracteristicaService{
	
	@Autowired
	private ICaracteristicaRepo repo;

	@Override
	public Caracteristica registrar(Caracteristica obj) {
		return repo.save(obj);
	}

	@Override
	public Caracteristica modificar(Caracteristica obj) {
		return repo.save(obj);
	}

	@Override
	public List<Caracteristica> listar() {
		return repo.findAll();
	}

	@Override
	public Caracteristica leerPorId(Integer id) {
		Optional<Caracteristica> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Caracteristica();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
