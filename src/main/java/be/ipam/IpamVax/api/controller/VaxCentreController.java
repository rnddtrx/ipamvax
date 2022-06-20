package be.ipam.IpamVax.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import be.ipam.IpamVax.api.VaxCentreApi;
import be.ipam.IpamVax.api.model.VaxCentre;
import be.ipam.IpamVax.services.VaxCentreService;

@RestController
public class VaxCentreController implements VaxCentreApi  {

	@Autowired
	VaxCentreService vaxCentreService;
	
	@Override
	public ResponseEntity<VaxCentre> createVaxCentre(@Valid VaxCentre vaxCentre) {

		return vaxCentreService.createPeople(vaxCentre);

	}

	@Override
	public ResponseEntity<Void> deleteVaxCentreById(Integer vaxCentreId) {
		// TODO Auto-generated method stub
		return VaxCentreApi.super.deleteVaxCentreById(vaxCentreId);
	}

	@Override
	public ResponseEntity<VaxCentre> getVaxCenterById(Integer vaxCentreId) {
		return vaxCentreService.getVaxCentreByID((long)vaxCentreId);
	}

	@Override
	public ResponseEntity<Void> updateVaxCentre(Integer vaxCentreId, @Valid VaxCentre vaxCentre) {
		// TODO Auto-generated method stub
		return VaxCentreApi.super.updateVaxCentre(vaxCentreId, vaxCentre);
	}

}
