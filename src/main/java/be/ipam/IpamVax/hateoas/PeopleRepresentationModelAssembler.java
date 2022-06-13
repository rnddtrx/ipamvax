package be.ipam.IpamVax.hateoas;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

import be.ipam.IpamVax.api.controller.PeopleController;
import be.ipam.IpamVax.api.model.People;
import be.ipam.IpamVax.model.PeopleEntity;
import be.ipam.IpamVax.services.PeopleService;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.math.BigDecimal;

public class PeopleRepresentationModelAssembler extends RepresentationModelAssemblerSupport<PeopleEntity, People> {

	PeopleService peopleService;

	public PeopleRepresentationModelAssembler(PeopleService peopleSer) {
		super(PeopleController.class,People.class);
		this.peopleService=peopleSer;
	}
	
	@Override
	public People toModel(PeopleEntity entity) {
		People resource = createModelWithId(entity.getPeopleId(), entity);
		resource.removeLinks();
		BeanUtils.copyProperties(entity, resource);
		resource.setPeopleId(new BigDecimal(entity.getPeopleId()));
	      	    
	    resource.add(linkTo(methodOn(PeopleController.class).getPeopleById((int) (long) entity.getPeopleId())).withSelfRel());
	    return resource;
	}

}
