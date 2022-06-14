import java.util.*;
class Seperate{
	public static void main(String[] args){
		//ArrayList<String> fruits = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("please list fruits with using coma?");
		String word=sc.nextLine();
		String[] fruits=word.split(",");
		
		for(String x:fruits) {
			System.out.println(x);
		}
	}
}