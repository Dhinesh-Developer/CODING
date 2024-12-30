package com.DhinesDeveloper;
// given an array of stock prices,at most one transaction is allowed 
//(i.e) buy one and sell one share of the stock, design an algo to find the max profit.
public class program14 {
	private static void getMaxProfit(int[] ar) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < min) min = ar[i];
			if((ar[i] - min)> max) max = ar[i]-min;
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int[] ar= {7,1,5,3,6,4};
		getMaxProfit(ar);
	}
// 5   
}
