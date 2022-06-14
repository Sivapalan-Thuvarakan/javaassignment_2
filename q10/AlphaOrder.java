import java.util.*;
class AlphaOrder{
	public static void main(String[] args){
		String[] words = {"Thuva","Thivi","Apple","Mango","Water"};
		System.out.println("Before sorting:");
		for(int i=0;i<words.length;i++){
			System.out.println(words[i]);
		}

		for(int i=0;i<words.length-1;i++){
			for(int j=i;j<words.length;j++){
				if(words[i].compareTo(words[j])>0){
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}

	       System.out.println("After sorting:");
		for(int i=0;i<words.length;i++){
			System.out.println(words[i]);
		}
	}
}