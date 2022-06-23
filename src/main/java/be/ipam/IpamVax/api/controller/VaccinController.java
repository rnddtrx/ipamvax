package be.ipam.IpamVax.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import be.ipam.IpamVax.api.VaccinApi;
import be.ipam.IpamVax.api.model.Vaccin;
import be.ipam.IpamVax.api.model.VaxCentre;
import be.ipam.IpamVax.services.VaccinService;
import be.ipam.IpamVax.services.VaxCentreService;

@RestController
public class VaccinController implements VaccinApi{

	@Autowired
	VaccinService vaccinService;
	
	@Override
	public ResponseEntity<Vaccin> createVaccin(@Valid Vaccin vaccin) {
		return vaccinService.createVaccin(vaccin);
	}
	
	@Override
	public ResponseEntity<Void> deleteVaccinById(Integer vaccinId) {
		// TODO Auto-generated method stub
		return VaccinApi.super.deleteVaccinById(vaccinId);
	}

	@Override
	public ResponseEntity<Vaccin> getVaccinById(Integer vaccinId) {
		return vaccinService.getVaxCentreByID((long)vaccinId);
	}
	
	@Override
	public ResponseEntity<Void> updateVaccin(Integer vaccinId, @Valid Vaccin vaccin) {
		// TODO Auto-generated method stub
		return VaccinApi.super.updateVaccin(vaccinId, vaccin);
	}

	
}
