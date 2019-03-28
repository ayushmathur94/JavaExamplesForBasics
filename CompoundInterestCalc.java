package coreBasics;

public class CompoundInterestCalc {

	/*
	   Compound interest formula (including principal):
               A = P(1+r/n) power(nt)
	 */
	
	public static void main(String[] args) {
		
		double amount;
		double principal = 10000;
		double rate = .01;
		int day;
		
		
		for (day =1; day<=20; day++){
			amount = principal*Math.pow(1 + rate, day);
					System.out.println(day + " " + amount);
		}
		
	/* amount = principal * (1+rate) power time
	 * amount = principal * (1+rate)^time
	 */
		
		
	}
	
	
}
