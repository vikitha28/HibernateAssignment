package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

int bankId;
@Column
String accountId;
public int getBankId() {
	return bankId;
}
public void setBankId(int bankId) {
	this.bankId = bankId;
}
public String getAccountId() {
	return accountId;
}
public void setAccountId(String accountId) {
	this.accountId = accountId;
}
@Override
public String toString() {
	return "BankAccount [bankId=" + bankId + ", accountId=" + accountId + "]";
}
public BankAccount(int bankId, String accountId) {
	super();
	this.bankId = bankId;
	this.accountId = accountId;
}
public BankAccount() {
	super();
}
public BankAccount(String accountId) {
super();
this.accountId = accountId;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
	result = prime * result + bankId;
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
	BankAccount other = (BankAccount) obj;
	if (accountId == null) {
		if (other.accountId != null)
			return false;
	} else if (!accountId.equals(other.accountId))
		return false;
	if (bankId != other.bankId)
		return false;
	return true;
}

}
