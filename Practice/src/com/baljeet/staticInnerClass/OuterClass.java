package com.baljeet.staticInnerClass;

public class OuterClass {
	private int o=30;
private	static int p=40;
	public void display3(){
		System.out.println("display3");
	}
	public static void display4(){
		System.out.println(p);
	}
	public OuterClass(){
		
	}
	public static OuterClass getObject(){
		return new OuterClass();
	}
	public static class InnerClass{
		private int m=10;
		private static int n=20;
		public void display1(OuterClass ref){
			System.out.println(m);
			display4();
			System.out.println(p);
			System.out.println(ref.o);
		}
		
        public static void display2(){
			System.out.println(n);
		}
		
		
	}
	InnerClass in=new InnerClass();
}



