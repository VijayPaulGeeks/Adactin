package org.syntax;

public class DefaultConstructor01 {
	String name;
	int rno;
	DefaultConstructor01(){ //DefaultConstructor
		name="abc";
		rno=345;
		
	}
	public static void main(String[] args) {
		DefaultConstructor01 s1 = new DefaultConstructor01();
		System.out.println(s1.name);
		System.out.println(s1.rno);
	}

}
