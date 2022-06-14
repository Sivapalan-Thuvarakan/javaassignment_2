class ReverseNumber{
	public static void main(String[] args){
		int number=4567;
		int reverse=0;
		while(number!=0){
			int remainder=number%10;//7,6,5,4
			reverse=reverse*10+remainder;//7,76,765,7654
			number=number/10;//456,45,4,0
		}
		System.out.println("Reverse of given number = "+reverse);
	}	
}