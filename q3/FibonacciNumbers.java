import java.util.Scanner;
class  FibonacciNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate FibonacciNumber:");
		int number=sc.nextInt();
		int num1=0;
		int num2=1;
		int lastsum=0;
		int i=2;
		 System.out.print(num1+","+num2);
		do{
			lastsum=num1+num2;
			System.out.print(","+lastsum);
			num1=num2;
			num2=lastsum;
			i++;
		}while(i<number);
		
	}	
}