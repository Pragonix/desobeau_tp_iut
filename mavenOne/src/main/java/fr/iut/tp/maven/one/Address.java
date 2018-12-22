package fr.iut.tp.maven.one;

public class Address {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + zipCode;
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
		Address other = (Address) obj;
		if (number != other.number)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}
	private int number;
	private String street;
	private int zipCode;
	
	public Address(int number, String street, int zipCode) {
		this.setNumber(number);
		this.setStreet(street);
		this.setZipCode(zipCode);
		
	}
	public Address() {
		this.setNumber(8);
		this.setStreet("rue de Paris");
		this.setZipCode(77970);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
