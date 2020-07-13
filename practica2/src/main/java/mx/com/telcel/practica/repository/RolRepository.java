package mx.com.telcel.practica.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.practica.model.RolModel;


@Repository
public interface RolRepository extends JpaRepository<RolModel,Integer>{

	
	
}
