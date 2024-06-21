package function;
import java.util.Scanner;
public class Printgivenname {
public static void PrintName(String name) {
	System.out.println(name);
	 
}
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String name=sc.next();

PrintName(name);
	}

}
