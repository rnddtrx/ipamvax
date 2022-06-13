package be.ipam.IpamVax.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import be.ipam.IpamVax.api.model.People;
import be.ipam.IpamVax.hateoas.PeopleRepresentationModelAssembler;
import be.ipam.IpamVax.model.PeopleEntity;
import be.ipam.IpamVax.repository.PeopleRepository;

import static org.springframework.http.ResponseEntity.notFound;

@Service
public class PeopleService {
	
	@Autowired
	PeopleRepository peopleRepository;
	
	
	PeopleRepresentationModelAssembler assembler;
	
	public PeopleService(){
		this.assembler = new PeopleRepresentationModelAssembler(this);
	}
	
	
	public ResponseEntity<People> createPeople(People people) {
		PeopleEntity pe = toEntity(people);
		pe = peopleRepository.save(pe);
		return Optional.of(pe).map(assembler::toModel).map(ResponseEntity::ok).orElse(notFound().build());
		
	}
	
	public ResponseEntity<People> getUserByID(long peopleId){
		Optional<PeopleEntity>  pe= peopleRepository.findById(peopleId);
		return Optional.of(pe.get()).map(assembler::toModel).map(ResponseEntity::ok).orElse(notFound().build());
	}
	
	private PeopleEntity toEntity(People people) {
		PeopleEntity pe = new PeopleEntity();
		pe.setFirstname(people.getFirstname());
		pe.setLastname(people.getLastname());
		pe.setCountryOfBirth(people.getCountryOfBirth());
		pe.setNationalNumber(people.getNationalNumber());
		pe.setAddressCity(people.getAddressCity());
		pe.setAddressPostalCode(people.getAddressPostalCode());
		pe.setAddressStreet(people.getAddressStreet());
		pe.setAddressNumber(people.getAddressNumber());
		if(people.getPassword()!="" && people.getPassword()!=null) {
			String pw = new BCryptPasswordEncoder().encode(people.getPassword());  
		    pe.setPassword(pw);
		}
		return pe; 
	}
	
	public PeopleEntity findByNatNum(String natNum) {
		return peopleRepository.findByNationalNumber(natNum);
	}
	

}
