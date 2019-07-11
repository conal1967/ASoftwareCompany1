package com.AmazingSoftwareCompany1.bin;

public class Developer {
	public static void main(String[] args) {
		String developerLevel1;
		String developerLevel2;
		String developerLevel3;
		double hourlyRate;
	}
	
	/**
	 * 
	 */
	public Developer() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param developerLevel1
	 * @param developerLevel2
	 * @param developerLevel3
	 * @param hourRate
	 */
	public Developer(String developerLevel1, String developerLevel2, String developerLevel3, double hourRate) {
		super();
		this.developerLevel1 = developerLevel1;
		this.developerLevel2 = developerLevel2;
		this.developerLevel3 = developerLevel3;
		this.hourRate = hourRate;
	}
	@Override
	public String toString() {
		return "Developer [developerLevel1=" + developerLevel1 + ", developerLevel2=" + developerLevel2
				+ ", developerLevel3=" + developerLevel3 + ", hourRate=" + hourRate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developerLevel1 == null) ? 0 : developerLevel1.hashCode());
		result = prime * result + ((developerLevel2 == null) ? 0 : developerLevel2.hashCode());
		result = prime * result + ((developerLevel3 == null) ? 0 : developerLevel3.hashCode());
		long temp;
		temp = Double.doubleToLongBits(hourRate);
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
		Developer other = (Developer) obj;
		if (developerLevel1 == null) {
			if (other.developerLevel1 != null)
				return false;
		} else if (!developerLevel1.equals(other.developerLevel1))
			return false;
		if (developerLevel2 == null) {
			if (other.developerLevel2 != null)
				return false;
		} else if (!developerLevel2.equals(other.developerLevel2))
			return false;
		if (developerLevel3 == null) {
			if (other.developerLevel3 != null)
				return false;
		} else if (!developerLevel3.equals(other.developerLevel3))
			return false;
		if (Double.doubleToLongBits(hourRate) != Double.doubleToLongBits(other.hourRate))
			return false;
		return true;
	}
	String developerLevel1;
	String developerLevel2;
	String developerLevel3;
	double hourRate;
	public String getDeveloperLevel1() {
		return developerLevel1;
	}
	public void setDeveloperLevel1(String developerLevel1) {
		this.developerLevel1 = developerLevel1;
	}
	public String getDeveloperLevel2() {
		return developerLevel2;
	}
	public void setDeveloperLevel2(String developerLevel2) {
		this.developerLevel2 = developerLevel2;
	}
	public String getDeveloperLevel3() {
		return developerLevel3;
	}
	public void setDeveloperLevel3(String developerLevel3) {
		this.developerLevel3 = developerLevel3;
	}
	public double getHourRate() {
		return hourRate;
	}
	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

}
