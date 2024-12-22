package com.dk.java;
class Car{
	int cost;
	String name;
	String brand;
	void detail(int cost,String name) {
		this.cost = cost;
		this.name = name;
		System.out.println(cost+" "+name);
	}
}
public class program1 {

	public static void main(String[] args) {
		Car c = new Car();
		c.detail(12,"kia");

	}

}
