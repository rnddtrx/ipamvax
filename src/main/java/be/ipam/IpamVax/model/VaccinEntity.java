package be.ipam.IpamVax.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Vaccin")
public class VaccinEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long vaccinId;
	private String name;
	private int ageMin;
	private int doseMin;
	private Boolean booster;	
}
