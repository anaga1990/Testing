package com.runtime.polymoorphism;

public class RateOfIntrestForLoans {
	public static void main(String[] args) {
		 RBI rbi =new SBI();
		 rbi.carLoan();
		 rbi.houseLoan();
		 
		 rbi = new PNB();
		 rbi.carLoan();
		 rbi.houseLoan();
		
		 rbi=new CNRB();
		 rbi.carLoan();
		 rbi.houseLoan();
		 
		 SBI sbi = new SBI();
		 sbi.carLoan();
	}

}
