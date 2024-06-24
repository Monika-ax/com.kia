package com.auto.com.auto;

public class App{
	int c = 80; // Global variable
	
	public void show() {
		int a = 10; //Local variable
		//static int x = 100;
		System.out.println("Inside show method, a = " + a);
		System.out.println("Inside show method, c = " + c);
	}
	public void display() {
		int b = 20;
		System.out.println("Inside display method, b = " + b);
		// trying to access variable 'a' - generates an ERROR
//		System.out.println("Inside display method, a = " + a);
	}
	public static void main(String args[]) {
		App obj = new App();
		obj.show();
		obj.display();

	}
}