import java.util.*;
class Spaceremove{
	public static void main(String[] args){
		String word_with_out_space="";
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please list a sentece with space?");
		String word=sc.nextLine();
		while(i<word.length())
		{
			
			if(word.charAt(i)!=' '){
				word_with_out_space=word_with_out_space+word.charAt(i);
			}
			i++;
			
		}
		System.out.print(word_with_out_space);
	}
}