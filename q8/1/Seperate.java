import java.util.*;
class Seperate{
	public static void main(String[] args){
		ArrayList<String> fruits = new ArrayList<String>();
		String fruit="";
		int i;
		int counter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please list fruits with using coma?");
		String word=sc.nextLine();
		i=counter;
		while(i<word.length())
		{
			
			if(word.charAt(i)!=','){
				fruit=fruit+word.charAt(i);
				counter=counter+1;
			}
			else{
				fruits.add(fruit);
				fruit="";
			}
			i++;
			
		}
		fruits.add(fruit);
		for(String x:fruits) {
			System.out.println(x);
		}
	}
}