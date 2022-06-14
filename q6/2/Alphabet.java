import java.util.Scanner;
class Alphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet?");
		char al=sc.next().charAt(0);
		
		switch(al){
		  case 'A'|'a':
			System.out.println("Entered Alphabet is a vowel");
			break;

		  case 'E'|'e':
			System.out.println("Entered Alphabet is a vowel");
			break;

		  case 'I'|'i':
			System.out.println("Entered Alphabet is a vowel");
			break;
		  
                  case 'O'|'o':
			System.out.println("Entered Alphabet is a vowel");
			break;

                  case 'U'|'u':
			System.out.println("Entered Alphabet is a vowel");
			break;
		
		   default:
			System.out.println("Entered Alphabet is not a vowel");
		}

	}
}