package javakamp.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "JoobSeekers")
@Data
public class JoobSeeker {
	
	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "nationalIdentity")
	private String nationalIdentity;
	
	@Column(name = "yearOfBirth")
	private String yearOfBirth;
	
	@Column(name = "emailVerification")
	private boolean emailVerification;
	
	@Column(name = "mernisVerification")
	private boolean mernisVerification;
	
	public JoobSeeker() {
		
	}

	public JoobSeeker(int userId, String firstName, String lastName, String nationalIdentity, String yearOfBirth,
			boolean emailVerification, boolean mernisVerification) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.yearOfBirth = yearOfBirth;
		this.emailVerification = emailVerification;
		this.mernisVerification = mernisVerification;
	}

}
