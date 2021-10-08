package net.javaguides.springboot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "user")
public class User {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "tpno")
	private int tpno;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "nic")
	private String nic;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "repassword")
	private String repassword;
	
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="upid")
	private User_Profile userprofile;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "b_id", referencedColumnName = "id")
	List<Booking> bookings = new ArrayList<>();
	
	public User()
	{
		
	}
	
	
	public User(long id, String name, String address, int tpno, String email, String nic, String password,
			String repassword, User_Profile userprofile) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.tpno = tpno;
		this.email = email;
		this.nic = nic;
		this.password = password;
		this.repassword = repassword;
		this.userprofile = userprofile;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getNic() {
		return nic;
	}
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public List<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}


	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	
	public User_Profile getUserprofile() {
		return userprofile;
	}


	public void setUserprofile(User_Profile userprofile) {
		this.userprofile = userprofile;
	}
	
}
