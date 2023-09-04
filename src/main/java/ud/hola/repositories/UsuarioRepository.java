package ud.hola.repositories;

import org.springframework.stereotype.Repository;

import ud.hola.models.UsuarioModel;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UsuarioRepository extends CrudRepository <UsuarioModel, Long>{
    
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
