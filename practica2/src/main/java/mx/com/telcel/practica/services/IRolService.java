package mx.com.telcel.practica.services;


import java.util.List;

import mx.com.telcel.practica.model.RolModel;


public interface IRolService {
	
	RolModel save(RolModel rol);
	
	RolModel update(RolModel rol);
	
	boolean delete(RolModel rol);
	
	List<RolModel> getAll();
	
	RolModel findById(int id);

}
