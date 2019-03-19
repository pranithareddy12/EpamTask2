package cleancodedemo;
/*
 * Estimate house construction cost
 * based on various materials*/

public class HouseCost {
	public double CalCost(double area,String standard){
		double cost=0;
		if(standard.equals("standard")){
			 cost=area * 1200;
		}
		else if(standard.equals("abovestandard"))
		{
			cost=area * 1500;
		}
		else if(standard.equals("highstandard"))
		{
			cost=area * 1800;
		}
		else{
			cost=area*2500;
		}
		return cost;
	}
}
