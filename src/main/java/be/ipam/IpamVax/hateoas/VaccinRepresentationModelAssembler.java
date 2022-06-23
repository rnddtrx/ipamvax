package be.ipam.IpamVax.hateoas;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.math.BigDecimal;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

import be.ipam.IpamVax.api.controller.VaccinController;
import be.ipam.IpamVax.api.model.Vaccin;
import be.ipam.IpamVax.model.VaccinEntity;
import be.ipam.IpamVax.services.VaccinService;


public class VaccinRepresentationModelAssembler extends RepresentationModelAssemblerSupport<VaccinEntity, Vaccin>{

	VaccinService vaxcentreService;

	public VaccinRepresentationModelAssembler(VaccinService vaxCentreSer) {
		super(VaccinController.class,Vaccin.class);
		this.vaxcentreService=vaxCentreSer;
	}
	
	@Override
	public Vaccin toModel(VaccinEntity entity) {
		Vaccin resource = createModelWithId(entity.getVaccinId(), entity);
		resource.removeLinks();
		BeanUtils.copyProperties(entity, resource);
		resource.setVaccinId(new BigDecimal(entity.getVaccinId()));
	      	    
	    resource.add(linkTo(methodOn(VaccinController.class).getVaccinById((int) (long) entity.getVaccinId())).withSelfRel());

	    return resource;
	}

	
}
