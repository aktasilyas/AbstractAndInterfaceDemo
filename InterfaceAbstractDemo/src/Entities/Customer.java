package Entities;

import java.time.LocalDateTime;

import Abstract.IEntity;

public class Customer implements IEntity {

	private int Id;
	private String FirstName;
	private String LastName;
	private LocalDateTime DateOfBirth;
	private String nationalityId;
	public Customer(int id, String firstName, String lastName, LocalDateTime dateOfBirth, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public LocalDateTime getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
