package javakamp.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employers")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User{


	@Column(name="company_name")
	private String companyName;

	@Column(name="website")
	private String website;
	
	@Column(name="telephone_number")
	private int telephoneNumber;
  
	@Column(name="system_verification")
	private boolean systemVerification;
	
	@Column(name="email_verification")
	private boolean emailVerification;
}
