package test;

public class sample {
	String name=("rahul");
	 static int id=520;
	 void display() {
		 System.out.println("is my bro");
	 }
	 static void display1() {
		 System.out.println("his id is");
	 }
	 public static void main(String[] args) {
		 sample s1=new sample();
		 System.out.println(s1.name);
		 System.out.println(sample.id);
		 sample.display1();
		 s1.display();
		 
	 }
	

}