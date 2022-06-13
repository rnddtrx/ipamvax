package be.ipam.IpamVax.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import be.ipam.IpamVax.api.PeopleApi;
import be.ipam.IpamVax.api.model.People;
import be.ipam.IpamVax.services.PeopleService;

@RestController
public class PeopleController implements PeopleApi  {
	
	@Autowired
	PeopleService peopleService;

	@Override
	public ResponseEntity<People> createUser(@Valid People people) {
		return peopleService.createPeople(people);
	}

	@Override
	public ResponseEntity<Void> deletePeopleById(Integer peopleId) {
		// TODO Auto-generated method stub
		return PeopleApi.super.deletePeopleById(peopleId);
	}

	@Override
	public ResponseEntity<People> getPeopleById(Integer peopleId) {
		return peopleService.getUserByID((long)peopleId);
	}

	@Override
	public ResponseEntity<Void> updateUser(Integer peopleId, @Valid People people) {
		// TODO Auto-generated method stub
		return PeopleApi.super.updateUser(peopleId, people);
	}

}
