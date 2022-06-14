import java.util.Scanner;
class FactorialNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial number:");
		int number = sc.nextInt();
		int  factorialNumber=1;
		for(int i=number;i>0;i--){
			factorialNumber=factorialNumber*i;
		}
		System.out.println("Factorial Number for "+number+"is :"+factorialNumber);
		
	}	
}