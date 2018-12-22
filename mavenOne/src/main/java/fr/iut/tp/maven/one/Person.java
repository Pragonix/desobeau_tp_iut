package fr.iut.tp.maven.one;

public class Person {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((residenceAddress == null) ? 0 : residenceAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (residenceAddress == null) {
			if (other.residenceAddress != null)
				return false;
		} else if (!residenceAddress.equals(other.residenceAddress))
			return false;
		return true;
	}
	private String name;
	private int age;
	private Address residenceAddress;
	
	public Person(String name, int age, Address residenceAddress) {
		this.setName(name);
		this.setAge(age);
		this.setResidenceAddress(residenceAddress);
		
	}
	
	public Person() {
		this.setName("Philipe");
		this.setAge(25);
		this.residenceAddress = new Address();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getResidenceAddress() {
		return residenceAddress;
	}
	public void setResidenceAddress(Address residenceAddress) {
		this.residenceAddress = residenceAddress;
	}
	
	
	
}
