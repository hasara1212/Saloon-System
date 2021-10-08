package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addfacility")
public class AddFacilities {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long facilityid;
	
	@Column(name = "des")
	private String des;
	
	@Column(name = "timetaken")
	private String timetaken;
	
	@Column(name = "servicetype")
	private String servicetype;
	
	@Column(name = "mincharge")
	private int mincharge;
	
	@Column(name = "maxcharge")
	private int maxcharge;
	
	public AddFacilities() {
		
		
	}
	
	
	public AddFacilities(String des, String timetaken, String servicetype, int mincharge, int maxcharge) {
		super();
		this.des = des;
		this.timetaken = timetaken;
		this.servicetype = servicetype;
		this.mincharge = mincharge;
		this.maxcharge = maxcharge;
	}
	
	
	public long getFacilityid() {
		return facilityid;
	}
	public void setFacilityid(long facilityid) {
		this.facilityid = facilityid;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getTimetaken() {
		return timetaken;
	}
	public void setTimetaken(String timetaken) {
		this.timetaken = timetaken;
	}
	public String getServicetype() {
		return servicetype;
	}
	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}
	public int getMincharge() {
		return mincharge;
	}
	public void setMincharge(int mincharge) {
		this.mincharge = mincharge;
	}
	public int getMaxcharge() {
		return maxcharge;
	}
	public void setMaxcharge(int maxcharge) {
		this.maxcharge = maxcharge;
	}
	
	
	
	

	
	
	
}
