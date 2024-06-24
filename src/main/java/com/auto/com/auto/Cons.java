package com.auto.com.auto;

public class Cons{
	String ename;
	int emid;
	String depart;
	Double salary;

	
    public Cons(){}
	Cons(String name, int id, String D, Double Salary){
		ename = name;
		emid = id;
		depart = D;
		salary = Salary;
	}
		public static void main(String[]args) {
			Cons Rahul = new Cons("Rahul", 1, "QA", 50000.0);
			Rahul.testing();
			
			Cons Meera = new Cons("Meera", 2, "Dev", 60000.0);
		Meera.testing1();
		
		Cons BB = new Cons("bb", 3, "PC", 700000.0);
		BB.testing2();
		
			
			
		}
		public void testing() {
			System.out.println(ename);
			System.out.println(emid);
			System.out.println(depart);
			System.out.println(salary);
		}
		public void testing1() {
			System.out.println(ename);
			{System.out.println(emid);
			System.out.println(depart);
			System.out.println(salary);
		}
			public void testing2() {
				System.out.println(ename);
				System.out.println(emid);
				System.out.println(depart);
				System.out.println(salary);	
	}
	
}
