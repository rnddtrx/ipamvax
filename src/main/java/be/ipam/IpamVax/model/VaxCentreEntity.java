package be.ipam.IpamVax.model;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="VaxCentre")
public class VaxCentreEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long vaxCentreId;
	private String name;
	private String addressStreet;
	private String addressNumber;
	private String addressCity;	
	@OneToMany(mappedBy="vaxCentre")
	private Set<PeopleScheduleEntity> peopleSchedules;
}
