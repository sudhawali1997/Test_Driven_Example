package com.example;

public class Calculator {

	public static int add(String text) 
	{
		
		if(!text.equals("")){
			
			if(containsNegative(splitNunbers(text))) 
			{
				throw new IllegalArgumentException("can not add negative numbers");
			}
			return sumOfString(text);
		
		}else {
			return 0;
		}
	}

	private static int sumOfString(String text) {
		int sum=0;
		String[] splitNunbers = splitNunbers(text);
		for(int i=0;i<splitNunbers.length;i++) {
			sum=sum+stringToInt(text);
		}
		return sum;
	}

	private static boolean containsNegative(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(stringToInt(arr[i])<0)
			{
				return true;
		}
		}
		return false;
	}

	private static int stringToInt(String string) {
		
		return Integer.parseInt(string);
	}

	private static String[] splitNunbers(String text) {
		
		return text.split(",");
	}}


