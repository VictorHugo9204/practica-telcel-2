package mx.com.telcel.practica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.telcel.practica.exception.TelcelException;
import mx.com.telcel.practica.model.RolModel;
import mx.com.telcel.practica.repository.RolRepository;



@Service 
public class RolService implements IRolService{
	
	@Autowired
	public RolRepository repository;

	@Override
	public RolModel save(RolModel rol) {
		return repository.save(rol);
	}

	@Override
	public RolModel update(RolModel rol) {
		return repository.save(rol);
	}

	@Override
	public boolean delete(RolModel rol) {
		repository.delete(rol);
		return true;
	}

	@Override
	public List<RolModel> getAll() {
		return repository.findAll();
	}


	@Override
	public RolModel findById(int id)  throws TelcelException {
		
		Optional<RolModel> rol = repository.findById(id);
		
		if(rol.isPresent()) {
			return rol.get();
		}else {
			throw new TelcelException("No se encontro el rol");
		}	
	}
}
