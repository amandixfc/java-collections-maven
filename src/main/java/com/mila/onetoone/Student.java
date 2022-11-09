package com.mila.onetoone;

public class Student {
	
	private Integer id; //Integer enlloc de int per a treballar amb HashMap
	private String name;
	private String surname;
	private String course;
	// 1 to 1 relation
	private Address address;
	
	public Student(Integer id, String name, 
			String surname, String course, Address address) {
		// podem cridar mètodes de validació i llençar excepcions
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.course = course;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", course=");
		builder.append(course);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
	
}
