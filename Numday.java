package arraypractice;
import java.util.Scanner;

public class Numday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("input num:");
int day=sc.nextInt();
System.out.println(getDayName( day));

	}
	public static String getDayName(int day) {
		
		String dayName="";
		switch(day) {
		case 1:dayName="monday";break;
		case 2:dayName="tuesday";break;
		case 3:dayName="wednesday";break;
		case 4:dayName="thursday";break;
		case 5:dayName="friday";break;
		case 6:dayName="saturday";break;
		case 7:dayName="sunday";break;
		default:dayName="Invalid day range";
		

		}
	return dayName;
	}

}
