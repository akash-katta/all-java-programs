package com.oops;

public class HomeLoan extends LoanImpl {
	@Override
	public double getLoanROI() {
		double roi = 6.5;
		int cibil=getCibilScore();
		if(cibil >=300 && cibil<=559) {
			System.out.println("high risk");
			roi = roi + 4.0;
		}else if(cibil >=550 && cibil<=699) {
			System.out.println("moderate risk");
			roi = roi + 2.0;
		}else if(cibil >=700 && cibil<=990) {
			System.out.println("excellent");
			roi= roi+0.5;
		}else {
			System.out.println("invalid cibil information");
			roi = roi+10;
		}
		return roi;
	}
	void getHomeLoanDocInfo() {
		System.out.println("all Home loan documents verifird successfully");
	}
	public static void main(String[] args) {

		System.out.println("Home Loan Banking");
		HomeLoan hl = new HomeLoan();

		double salary = hl.getCustomerSalary();
		int age = hl.getcustomrAge();
		int cibil = hl.getCibilScore();

		if (salary >= 60000.00 && age >= 25 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("basic details validated chech personal details");
			if (hl.isPhoneValid() && hl.isAdhaarValid() && hl.isPanValid()) {
				System.out.println("details are good and Home loan got approved!!");
				System.out.println("your roi is: " + hl.getLoanROI());
				hl.getHomeLoanDocInfo();
			} else {
				System.out.println("something went wrong");
			}
		} else {
			System.out.println("not eligible for Home loan");
		}
	}

	}


