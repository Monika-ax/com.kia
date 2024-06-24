package com.auto.com.auto;

public class Variable {
	String name = "Monika";
	int age = 90;
	int salary;
	String depart;
	
	Variable(){
		super();
		
		System.out.println("Constructor");
	}
	public static void main(String[]arg) {
		Variable obj = new Variable();
		obj.test();
		obj.test1();
		
	}
	

   public void test(){
	   System.out.println(name);
	   System.out.println(age);
	   System.out.println(salary);
	   System.out.println(depart);}

   public void test1(){
	   System.out.println(name);
	   System.out.println(age);
	   System.out.println(salary);
	   System.out.println(depart);
	
	
	
}}