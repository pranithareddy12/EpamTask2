package cleancodedemo;
/*
 * Calculator Program
 *  1.addition of numbers.
 *  2.multiplication of numbers.
 *  3.division of number.
 * */
public class Calculator {
	
	//Addition
	public double addition(double... a){
		double sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
	
	//Multiplication
	public double multiplication(double... a){
		double product=1;
		for(int i=0;i<a.length;i++){
			product*=a[i];
		}
		return product;
	}
	
	//Division
	public double division(double number1,double number2){
		if(number2==0)
			return 0;
		return ( number1 / number2 );
	}

}
