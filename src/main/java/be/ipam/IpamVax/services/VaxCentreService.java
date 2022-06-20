package be.ipam.IpamVax.services;

import static org.springframework.http.ResponseEntity.notFound;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import be.ipam.IpamVax.api.model.People;
import be.ipam.IpamVax.api.model.VaxCentre;
import be.ipam.IpamVax.hateoas.PeopleRepresentationModelAssembler;
import be.ipam.IpamVax.hateoas.VaxCentreRepresentationModelAssembler;
import be.ipam.IpamVax.model.PeopleEntity;
import be.ipam.IpamVax.model.VaxCentreEntity;
import be.ipam.IpamVax.repository.VaxCentreRepository;

@Service
public class VaxCentreService {
	@Autowired
	VaxCentreRepository vaxCentreRepository;
	
	
	VaxCentreRepresentationModelAssembler assembler;
	
	public VaxCentreService(){
		this.assembler = new VaxCentreRepresentationModelAssembler(this);
	}
	
	
	public ResponseEntity<VaxCentre> createPeople(VaxCentre vaxcentre) {
		VaxCentreEntity ve = toEntity(vaxcentre);
		ve = vaxCentreRepository.save(ve);
		return Optional.of(ve).map(assembler::toModel).map(ResponseEntity::ok).orElse(notFound().build());
		
	}
	
	public ResponseEntity<VaxCentre> getVaxCentreByID(long peopleId){
		Optional<VaxCentreEntity>  ve= vaxCentreRepository.findById(peopleId);
		return Optional.of(ve.get()).map(assembler::toModel).map(ResponseEntity::ok).orElse(notFound().build());
	}
	
	private VaxCentreEntity toEntity(VaxCentre vaxcentre) {
		VaxCentreEntity ve = new VaxCentreEntity();
		if(vaxcentre.getVaxCentreId() != null)
			ve.setVaxCentreId(vaxcentre.getVaxCentreId().longValue());
		ve.setAddressCity(vaxcentre.getAddressStreet());
		ve.setAddressStreet(vaxcentre.getAddressStreet());
		ve.setAddressNumber(vaxcentre.getAddressNumber());
		ve.setName(vaxcentre.getName());
		return ve; 
	}
	
	
}
