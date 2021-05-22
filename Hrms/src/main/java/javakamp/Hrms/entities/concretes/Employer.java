package javakamp.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Employers")
@Data
public class Employer {

	@Id
	@GeneratedValue
	@Column(name="userId")
	private int userId;
	
	@Column(name="companyName")
	private String companyName;

	@Column(name="website")
	private String website;
	
	@Column(name="telephoneNumber")
	private int telephoneNumber;
  
	@Column(name="systemVerification")
	private boolean systemVerification;
	
	@Column(name="emailVerification")
	private boolean emailVerification;
}
