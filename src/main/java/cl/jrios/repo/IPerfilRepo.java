package cl.jrios.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import cl.jrios.model.Perfil;

public interface IPerfilRepo extends JpaRepository<Perfil, Integer>{

	List<Perfil> findByRazaId(@Param("raza_id") Integer raza_id);

}
