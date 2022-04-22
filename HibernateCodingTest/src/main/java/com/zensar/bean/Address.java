package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Address {
	@Id
int addressId;
	@Column
String cityName;
	@Column
String pinCode;
	@OneToOne
	@MapsId
	@PrimaryKeyJoinColumn(name="Employee_Id")
Employee employee;

public int getAddressId() {
	return addressId;
}

public void setAddressId(int addressId) {
	this.addressId = addressId;
}

public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}

public String getPinCode() {
	return pinCode;
}

public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

@Override
public String toString() {
	return "Address [addressId=" + addressId + ", cityName=" + cityName + ", pinCode=" + pinCode + ", employee="
			+ employee + "]";
}

public Address(int addressId, String cityName, String pinCode, Employee employee) {
	super();
	this.addressId = addressId;
	this.cityName = cityName;
	this.pinCode = pinCode;
	this.employee = employee;
}

public Address() {
	super();
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + addressId;
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
	if (addressId != other.addressId)
		return false;
	return true;
}

}
