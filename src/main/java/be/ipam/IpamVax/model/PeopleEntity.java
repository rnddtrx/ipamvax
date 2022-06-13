package be.ipam.IpamVax.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="People")
public class PeopleEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long peopleId;
	String nationalNumber;
	String firstname;
	String lastname;
	Date dateOfBirth;
	String placeOfBirth;
	String countryOfBirth;
	String addressStreet;
	String addressNumber;
	String addressPostalCode;
	String addressCity;
	String password;
	//La relation de la db est décrite sur l'attribut people dans PeopleSchedule
	@OneToMany(mappedBy="people")
	Set<PeopleScheduleEntity> peopleSchedules;
}
