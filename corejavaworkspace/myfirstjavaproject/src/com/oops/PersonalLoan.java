package com.oops;

public class PersonalLoan extends LoanImpl {

	void getPersonalLoanDocInfo() {
		System.out.println("all personal loan documents verifird successfully");
	}
	public static void main(String[] args) {

		System.out.println("Personal Loan Banking");
		PersonalLoan pl = new PersonalLoan();

		double salary = pl.getCustomerSalary();
		int age = pl.getcustomrAge();
		int cibil = pl.getCibilScore();

		if (salary >= 90000.00 && age >= 26 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("basic details validated chech personal details");
			if (pl.isPhoneValid() && pl.isAdhaarValid() && pl.isPanValid()) {
				System.out.println("details are good and loan got approved!!");
				System.out.println("your roi is: " + pl.getLoanROI());
				pl.getPersonalLoanDocInfo();
			} else {
				System.out.println("something went wrong");
			}
		} else {
			System.out.println("not eligible for loan");
		}
	}

}
