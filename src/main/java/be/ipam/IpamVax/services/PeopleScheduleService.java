package be.ipam.IpamVax.services;

import org.springframework.beans.factory.annotation.Autowired;

import be.ipam.IpamVax.repository.PeopleScheduleRepository;

public class PeopleScheduleService {
	@Autowired
	PeopleScheduleRepository peopleScheduleRepository;
}
