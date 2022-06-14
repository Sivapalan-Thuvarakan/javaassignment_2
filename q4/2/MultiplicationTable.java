class multiplication{
	public static void main(String[] args){
		int[][] multiplicationTable;
		multiplicationTable  = new int [10][10];
		int i=1;
		while(i<=multiplicationTable.length){
			int j=1;
			while(j<=multiplicationTable[i-1].length){
				System.out.print(i*j);
				j++;
			}
				System.out.println();
			i++;
		}
	}	
}