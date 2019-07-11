package com.AmazingSoftwareCompany1.bin;

public class manager {
	public static void main(String[] args) {
	int numberOfStaff;
	double salary;
	double bonus;
	}
	private double bonus;
	private double salary;
	private int numberOfStaff;
	/**
	 * 
	 */
	public manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param numberOfStaff
	 * @param salary
	 * @param bonus
	 */
	public manager(int numberOfStaff, double salary, double bonus) {
		super();
		this.numberOfStaff = numberOfStaff;
		this.salary = salary;
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "manager [numberOfStaff=" + numberOfStaff + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numberOfStaff;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		manager other = (manager) obj;
		if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
			return false;
		if (numberOfStaff != other.numberOfStaff)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	public int getNumberOfStaff() {
		return numberOfStaff;
	}
	public void setNumberOfStaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
