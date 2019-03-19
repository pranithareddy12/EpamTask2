package cleancodedemo;
/*
 * Program to Calculate
 *  Simple and CompoundInterest I
 * */

public class InterestDemo {
	
	//simple Interest
	public double simpleInterest(double principal,double rate,int years){
	  double simple_interest=(principal * rate * years)/100;
	  return Math.round(simple_interest * 100.0)/100.0;
	}
	
	//compound interest
	public double compoundInterest(double principal,double rate,int years){
		double compound_interest;
		compound_interest=principal * Math.pow((1+(rate/100)), years);
		return Math.round(compound_interest * 100.0)/100.0;
	}
}
