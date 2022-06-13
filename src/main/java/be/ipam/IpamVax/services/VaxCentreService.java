package be.ipam.IpamVax.services;

import org.springframework.beans.factory.annotation.Autowired;

import be.ipam.IpamVax.repository.VaxCentreRepository;

public class VaxCentreService {
	@Autowired
	VaxCentreRepository vaxCenterRepository;
}
