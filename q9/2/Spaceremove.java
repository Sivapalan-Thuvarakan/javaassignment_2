import java.util.*;
class Spaceremove{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("please list a sentece with space?");
		String word=sc.nextLine();
		String word_with_out_space=word.replaceAll("\\s","");
		System.out.print(word_with_out_space);
	}
}