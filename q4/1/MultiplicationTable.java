class multiplication{
	public static void main(String[] args){
		int[][] multiplicationTable;
		multiplicationTable  = new int [10][10];
		for(int i=1;i<=multiplicationTable.length;i++){
			for(int j=1;j<=multiplicationTable[i-1].length;j++){
				System.out.print(i*j);
			}
				System.out.println();
		}
	}	
}