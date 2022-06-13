package be.ipam.IpamVax.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import be.ipam.IpamVax.model.PeopleEntity;

public interface PeopleRepository extends CrudRepository<PeopleEntity, Long> {
	
	//Derived query
	PeopleEntity findByNationalNumber(String nationalNumber);
	
}
