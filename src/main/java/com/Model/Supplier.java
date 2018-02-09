package com.Model;


import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
public class Supplier 
{
@Id
private String sid;
private String supplierName;
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}


}
