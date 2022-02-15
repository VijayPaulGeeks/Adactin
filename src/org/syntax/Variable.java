package org.syntax;

public class Variable {
    int a=10;//instance variable
   static int c=30; //static variable 

  public static void main(String args[]) {
	  int b=20; //local variable
	  
	  Variable v = new Variable();
	  System.out.println("instance variable =" +v.a);
	  System.out.println("local variable = " +b);
	  System.out.println("static variable = "+c);
}
}