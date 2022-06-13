package be.ipam.IpamVax.repository;

import org.springframework.data.repository.CrudRepository;

import be.ipam.IpamVax.model.PeopleEntity;

public interface PeopleScheduleRepository extends CrudRepository<PeopleEntity, Long> {

}
