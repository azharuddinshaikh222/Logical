package com.strng;

public interface IFruit {

	public String TYPE="Apple";
	
	class Fruit implements IFruit
	{
		public static void main(String[] args) {
			
			System.out.println(Fruit.TYPE);
		}
	}
	
}
