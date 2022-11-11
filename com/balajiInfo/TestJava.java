package com.balajiInfo;

public class TestJava {

	public static void main(String[] args) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Hai Muni Welcome to help to get Good job in good Comapny as permenent job for 10 Years which is near to Electronic City");
		B a1=new B();
		//a1.v=100;
		System.out.println("====>"+a1.getData());
		
	}

}

class A {
	
	 int c=10;
}

class B extends A
{
       private int v=c+20;
      
      public int getData()
      {
    	  return v;
      }
}
