package be.ipam.IpamVax.repository;

import org.springframework.data.repository.CrudRepository;

import be.ipam.IpamVax.model.VaccinEntity;


public interface VaccinRepository extends CrudRepository<VaccinEntity, Long> {

}
