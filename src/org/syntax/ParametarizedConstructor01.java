package org.syntax;

public class ParametarizedConstructor01 {
	String a;
	int b;		
	ParametarizedConstructor01(String str, int n){
		 a=str;
		 b=n;
	}
	public static void main(String[] args) {
		ParametarizedConstructor01 p = new ParametarizedConstructor01("vij",810);
		System.out.println(p.a);
		System.out.println(p.b);
	}
}
