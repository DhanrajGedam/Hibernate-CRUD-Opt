import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int eId;
	private String eName;
	private int eAge;
	private String eEmail;
	@CreationTimestamp
	private Date objCreationTime;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public Date getObjCreationTime() {
		return objCreationTime;
	}
	public void setObjCreationTime(Date objCreationTime) {
		this.objCreationTime = objCreationTime;
	}
	
}
