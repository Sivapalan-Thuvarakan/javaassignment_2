import java.util.Scanner;
class Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calculate factor");
		int number = sc.nextInt();
		System.out.print("Factors of "+number+" are :");
		for(int i=1;i<=number;i++){
			if(number%i == 0){
				System.out.print(i+",");
			}
		}
	}	
}