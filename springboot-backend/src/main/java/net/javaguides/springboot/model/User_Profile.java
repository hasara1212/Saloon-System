package net.javaguides.springboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userprofile")
public class User_Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long proid;
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String address;
	private int tpno;
	private String email;
	private int nic;
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="userprofile")
	private User user;
	
	public User_Profile()
	{
		
	}
	
	
	public User_Profile(String name, Gender gender, String address, int tpno, String email, int nic, String password) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.tpno = tpno;
		this.email = email;
		this.nic = nic;
		this.password = password;
	}
	
	
	public long getProid() {
		return proid;
	}
	public void setProid(long proid) {
		this.proid = proid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTpno() {
		return tpno;
	}
	public void setTpno(int tpno) {
		this.tpno = tpno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNic() {
		return nic;
	}
	public void setNic(int nic) {
		this.nic = nic;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User getUser()
	{
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
}
