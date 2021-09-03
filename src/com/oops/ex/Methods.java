package com.oops.ex;


public class Methods {

	//access_specifier return_Type name_of_method(if_any_arguments_or_parameters){ .... }
	
	//access_specifier =public/private/protected/default
	
	//return_type = void, int, long,short,float,double,boolean,String, array, object
	
	//argumnest/parameters = int firstNumber, long l, String s, object obj, b
	
	public void addingTwoNumbers() {
		int a = 20220202;
		int b = 203432344;
		int c = a+b;
		System.out.println(" addition of 2 numbers in addingTwoNumbers() is "+c);
	}
	
	int addingTwoNumbersUsingIntdataType() {
		int a = 20220202;
		int b = 203432344;
		int c = a+b;
		return c;
	}
	
	protected void displayAmountCedit(int amount) {
		int totalAmount = amount;
		System.out.println("I am from displaymethod "+totalAmount);
	}
	
	int addingTwoNumbersWithParamerets(int firstNum, int secondNum) {
		int a = firstNum; //128232344
		int b = secondNum;//112232333
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Methods methods = new Methods();
		methods.addingTwoNumbers();
		int totalCredit=methods.addingTwoNumbersUsingIntdataType();
		methods.displayAmountCedit(totalCredit);
		System.out.println("_______________________________________");
		int tt =methods.addingTwoNumbersWithParamerets(128232344, 112232333);
		methods.displayAmountCedit(tt);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		methods.displayAmountCedit(methods.addingTwoNumbersWithParamerets(128232344, 112232333));
		int bb= (int)methods.addingTwoNumb(totalCredit, tt);
		System.out.println(bb);
		boolean bbbb = methods.checkHighnum();
		System.out.println(bbbb);
	}
	
	float addingTwoNumb(int firstNum, int secondNum) {
		int a = firstNum; //128232344
		int b = secondNum;//112232333
		int c = a+b;
		return c;
	}
	
	boolean checkHighnum() {
		int a = 100;
		int b = 20;
		boolean bb=a<b;
		return bb;
	}

}
