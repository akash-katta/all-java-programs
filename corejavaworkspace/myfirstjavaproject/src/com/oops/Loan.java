package com.oops;

public interface Loan {
	public abstract boolean isPhoneValid();

	public abstract boolean isAdhaarValid();

	public abstract boolean isPanValid();

	public abstract double getLoanROI();

	public abstract int getCibilScore();

	public abstract double getCustomerSalary();

	public abstract int getcustomrAge();
}
