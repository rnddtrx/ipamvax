package be.ipam.IpamVax.services;

import static org.springframework.http.ResponseEntity.notFound;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import be.ipam.IpamVax.api.model.Vaccin;
import be.ipam.IpamVax.hateoas.VaccinRepresentationModelAssembler;
import be.ipam.IpamVax.model.VaccinEntity;
import be.ipam.IpamVax.repository.VaccinRepository;

@Service
public class VaccinService {
	@Autowired
	VaccinRepository vaccinRepository;
	
	
	VaccinRepresentationModelAssembler assembler;
	
	public VaccinService(){
		this.assembler = new VaccinRepresentationModelAssembler(this);
	}
	
	
	public ResponseEntity<Vaccin> createVaccin(Vaccin vaccin) {
		VaccinEntity ve = toEntity(vaccin);
		ve = vaccinRepository.save(ve);
		return Optional.of(ve).map(assembler::toModel).map(ResponseEntity::ok).orElse(notFound().build());
		
	}
	
	public ResponseEntity<Vaccin> getVaxCentreByID(long vaccinId){
		Optional<VaccinEntity>  ve= vaccinRepository.findById(vaccinId);
		return Optional.of(ve.get()).map(assembler::toModel).map(ResponseEntity::ok).orElse(notFound().build());
	}
	
	private VaccinEntity toEntity(Vaccin vaccin) {
		VaccinEntity ve = new VaccinEntity();
		if(vaccin.getVaccinId() != null)
			ve.setVaccinId(vaccin.getVaccinId().longValue());
		ve.setName(vaccin.getName());
		ve.setAgeMin(vaccin.getAgeMin());
		ve.setBooster(vaccin.getBooster());
		ve.setDoseMin(vaccin.getDoseMin());
		return ve; 
	}

}
