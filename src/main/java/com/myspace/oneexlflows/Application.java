package com.myspace.oneexlflows;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.time.temporal.ChronoUnit;

public class Application implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private Long days;
	private java.lang.Boolean approval;

	private String toBeDate;

	private String extendedDate;

	private java.lang.Boolean budgetApproval;

	private java.lang.Integer budget;

	public Application() {
	}

	public java.lang.Boolean getApproval() {
		return this.approval;
	}

	public void setApproval(java.lang.Boolean approval) {
		this.approval = approval;
	}

	public java.lang.Long getDays() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date1 = LocalDate.parse(this.toBeDate, dtf);
		LocalDate date2 = LocalDate.parse(this.extendedDate, dtf);
		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		System.out.println("No. of Days" + daysBetween);
		// this.days = daysBetween;
		return daysBetween;
		// return this.days;
	}

	public void setDays(java.lang.Long days) {
		this.days = days;
	}

	public java.lang.String getToBeDate() {
		return this.toBeDate;
	}

	public void setToBeDate(java.lang.String toBeDate) {
		this.toBeDate = toBeDate;
	}

	public java.lang.String getExtendedDate() {
		return this.extendedDate;
	}

	public void setExtendedDate(java.lang.String extendedDate) {
		this.extendedDate = extendedDate;
	}

	public java.lang.Boolean getBudgetApproval() {
		return this.budgetApproval;
	}

	public void setBudgetApproval(java.lang.Boolean budgetApproval) {
		this.budgetApproval = budgetApproval;
	}

	public java.lang.Integer getBudget() {
		return this.budget;
	}

	public void setBudget(java.lang.Integer budget) {
		this.budget = budget;
	}

	public Application(java.lang.Long days, java.lang.Boolean approval,
			java.lang.String toBeDate, java.lang.String extendedDate,
			java.lang.Boolean budgetApproval, java.lang.Integer budget) {
		this.days = days;
		this.approval = approval;
		this.toBeDate = toBeDate;
		this.extendedDate = extendedDate;
		this.budgetApproval = budgetApproval;
		this.budget = budget;
	}

}