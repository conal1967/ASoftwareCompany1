package com.AmazingSoftwareCompany1;
import java.time.LocalDate;
public class Holiday {
	public static void main(String[] args) {
	
	}
	int startDate;
	int endDate;
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public int getEndDate() {
		return endDate;
	}
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Holiday [startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	/**
	 * @param startDate
	 * @param endDate
	 */
	public Holiday(int startDate, int endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	/**
	 * 
	 */
	public Holiday() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

