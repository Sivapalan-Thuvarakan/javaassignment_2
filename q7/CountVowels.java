import java.util.Scanner;
class CountVowels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word to count vowels and consonants?");
		String word=sc.nextLine();
		int vowel_counter=0;int consonent_counter=0;
		for(int i=0;i<word.length();i++){
			char al=word.charAt(i);
		
		switch(al){
		  case 'A'|'a':
			vowel_counter=vowel_counter+1;
			break;

		  case 'E'|'e':
			vowel_counter=vowel_counter+1;
			break;

		  case 'I'|'i':
			vowel_counter=vowel_counter+1;
			break;
		  
                  case 'O'|'o':
			vowel_counter=vowel_counter+1;;
			break;

                  case 'U'|'u':
			vowel_counter=vowel_counter+1;
			break;
		
		   default:
			consonent_counter=consonent_counter+1;
		}

		}
		System.out.print("Vowel:"+vowel_counter+" and Consonets:"+consonent_counter);

	}
}