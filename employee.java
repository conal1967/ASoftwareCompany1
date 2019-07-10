package com.AmazingSoftwareCompany1;
import java.time.LocalDate;
public class employee {
	
	int uniqueId;
	String Name;
	String department;
	int dateStarted;
	/**
	 * 
	 */
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param uniqueId
	 * @param name
	 * @param department
	 * @param dateStarted
	 * @param phoneNumber
	 * @param monthlyPay
	 */
	public employee(int uniqueId, String name, String department, int dateStarted, String phoneNumber,
			double monthlyPay) {
		super();
		this.uniqueId = uniqueId;
		Name = name;
		this.department = department;
		this.dateStarted = dateStarted;
		this.phoneNumber = phoneNumber;
		this.monthlyPay = monthlyPay;
	}
	@Override
	public String toString() {
		return "employee [uniqueId=" + uniqueId + ", Name=" + Name + ", department=" + department + ", dateStarted="
				+ dateStarted + ", phoneNumber=" + phoneNumber + ", monthlyPay=" + monthlyPay + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + dateStarted;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		long temp;
		temp = Double.doubleToLongBits(monthlyPay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + uniqueId;
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
		employee other = (employee) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (dateStarted != other.dateStarted)
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (Double.doubleToLongBits(monthlyPay) != Double.doubleToLongBits(other.monthlyPay))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (uniqueId != other.uniqueId)
			return false;
		return true;
	}
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(int dateStarted) {
		this.dateStarted = dateStarted;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getMonthlyPay() {
		return monthlyPay;
	}
	public void setMonthlyPay(double monthlyPay) {
		this.monthlyPay = monthlyPay;
	}
	String phoneNumber;
	double monthlyPay;

}

