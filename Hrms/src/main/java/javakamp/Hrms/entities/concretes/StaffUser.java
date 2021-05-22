package javakamp.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "StaffUsers")
@Data
public class StaffUser {

	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "positionId")
	private int positionId;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	public StaffUser() {
		
	}

	public StaffUser(int userId, int positionId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.positionId = positionId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
