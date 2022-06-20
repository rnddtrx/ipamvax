package be.ipam.IpamVax.hateoas;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.math.BigDecimal;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

import be.ipam.IpamVax.api.controller.VaxCentreController;
import be.ipam.IpamVax.api.model.People;
import be.ipam.IpamVax.api.model.VaxCentre;
import be.ipam.IpamVax.model.PeopleEntity;
import be.ipam.IpamVax.model.VaxCentreEntity;
import be.ipam.IpamVax.services.PeopleService;
import be.ipam.IpamVax.services.VaxCentreService;

public class VaxCentreRepresentationModelAssembler extends RepresentationModelAssemblerSupport<VaxCentreEntity, VaxCentre>{

	VaxCentreService vaxcentreService;

	public VaxCentreRepresentationModelAssembler(VaxCentreService vaxCentreSer) {
		super(VaxCentreController.class,VaxCentre.class);
		this.vaxcentreService=vaxCentreSer;
	}
	
	@Override
	public VaxCentre toModel(VaxCentreEntity entity) {
		VaxCentre resource = createModelWithId(entity.getVaxCentreId(), entity);
		resource.removeLinks();
		BeanUtils.copyProperties(entity, resource);
		resource.setVaxCentreId(new BigDecimal(entity.getVaxCentreId()));
	      	    
	    resource.add(linkTo(methodOn(VaxCentreController.class).getVaxCenterById((int) (long) entity.getVaxCentreId())).withSelfRel());

	    return resource;
	}

}
