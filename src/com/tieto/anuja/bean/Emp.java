package com.tieto.anuja.bean;

import java.math.BigInteger;

public class Emp {
private int id;
private String name;
private String Password;
private BigInteger Mobile;
private int amount;
private String referral;
public String getReferral() {
	return referral;
}
public void setReferral(String referral) {
	this.referral = referral;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return Password;
}
public void setPassword(String Password) {
	this.Password = Password;
}
public BigInteger getMobile() {
	return Mobile;
}
public void setMobile(BigInteger Mobile) {
	this.Mobile = Mobile;
}

}
