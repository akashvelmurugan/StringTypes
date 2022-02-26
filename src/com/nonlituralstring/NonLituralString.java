package com.nonlituralstring;

public class NonLituralString {
	public static void main(String[] args) {

		StringBuilder buffer= new StringBuilder("java");
		System.out.println(System.identityHashCode(buffer));
		
		StringBuilder append = buffer.append("phython");
		System.out.println("append"+System.identityHashCode(append));

		
	}
}
