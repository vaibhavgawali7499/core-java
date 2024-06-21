package arraypractice;

public class Pr_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]numbers= {12,67,23,7,34};
int sum=0;
Double average;
for(int number:numbers) {
	sum+=number;
}
int arrayLength=numbers.length;
average=((double)sum/(double)arrayLength);
	System.out.println("average:"+average);
System.out.println("sum:"+sum);
	}

}
