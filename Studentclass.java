package oop_in_java;

public class Studentclass {
	
String name;
int rollno;
float marks;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentclass s1=new Studentclass();
		s1.name="vaibhav";
		s1.rollno=78;
		s1.marks=78.00f;
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.marks);
		
		Studentclass s2=new Studentclass();
		s2.name="vishal";
		s2.rollno=67;
		s2.marks=77.00f;
		System.out.println(s2.name);
		System.out.println(s2.rollno);
		System.out.println(s2.marks);


	}

}
