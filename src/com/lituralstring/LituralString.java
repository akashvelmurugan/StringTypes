package com.lituralstring;

public class LituralString {
	public static void main(String[] args) {

		String stringFirst="java";

		String stringSecond="phython";

		System.out.println(stringFirst);

		String concat = stringFirst.concat(stringSecond);
		
		System.out.println(System.identityHashCode(stringFirst));
		System.out.println("concat"+System.identityHashCode(concat));
		System.out.println(System.identityHashCode(stringFirst));
		System.out.println(stringFirst);
	
	}
}
