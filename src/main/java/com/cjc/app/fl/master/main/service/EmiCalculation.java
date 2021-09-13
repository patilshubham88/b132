package com.cjc.app.fl.master.main.service;

public class EmiCalculation 
{
	public double emiCalculation(double r, double t, double p)
	{

				double emi;
			
				r = r / (12 * 100); // one month interest
				t = t * 12; // one month period
				emi = (p * r * (double)Math.pow(1 + r, t))
						/ (double)(Math.pow(1 + r, t) - 1);
			
				return emi;
			
			
		
	}

}
