//what is single ton class how do you implement that 
package com.sreekanth.package1;

public class SingletonclassDemo {

	public static void main(String[] args) {
	
		
		Abc obj1=Abc.getInstance();
		
		Abc obj2=Abc.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj1);
		
	}

}


class Abc
{
	static Abc abc_obj=new Abc();
	
	
	private Abc()
	{
		System.out.println("this is the no-arg constructor");
	}
	void m1()
	{
	System.out.println("this is m1() of Abc class");
	}
	
	
	//method to get the instance of the class
	
	static Abc getInstance()
	{
		
		return abc_obj;
	}

}

/*
 * What is a singleton class and how do you design that?	"the class which you can create only one object even if you create the another object same object is referd,
design:
1.class should shave the static object variable created and asigned the class object
2.constructor should be private so that it can be acessable in other code.
3.singleton class is instantiated only through the static get instance method where it returns the class object."


*/


