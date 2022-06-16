import java.util.*;
class DifferDate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Date (21/01/2022):");
		String Date1 = sc.nextLine();
		
		System.out.println("Enter End Date (21/01/2022):");
		String Date2 = sc.nextLine();

		String[] _startDate = Date1.split("/");
		String[] _endDate = Date2.split("/");

		
		int[] startDate = Arrays.stream(_startDate)
                        .mapToInt(Integer::parseInt)
                        .toArray();

		int[] endDate = Arrays.stream(_endDate)
                        .mapToInt(Integer::parseInt)
                        .toArray();

		int date_differ=0;int month_differ=0;int year_differ=0;
		
		if(endDate[0]>=startDate[0] && endDate[1]>=startDate[1]){
			date_differ=endDate[0]-startDate[0];
			month_differ=endDate[1]-startDate[1];
			year_differ=endDate[2]-startDate[2];

			System.out.println("1");
		}
		else if(endDate[0]>=startDate[0] && endDate[1]<=startDate[1]){
			date_differ=endDate[0]-startDate[0];
			month_differ=(endDate[1]+12)-startDate[1];
			year_differ=(endDate[2]-1)-startDate[2];
			System.out.println("2");
		}
		
		else if(endDate[0]<=startDate[0] && endDate[1]>=startDate[1]){
			date_differ=(endDate[0]+31)-startDate[0];
			month_differ=(endDate[1]-1)-startDate[1];
			year_differ=(endDate[2])-startDate[2];
			System.out.println("3");
		}

		else{
			date_differ=(endDate[0]+31)-startDate[0];
			month_differ=(endDate[1]+12)-startDate[1];
			year_differ=(endDate[2]-1)-startDate[2];

			System.out.println("4");
		}
		

		System.out.println("Difference between "+Date1+" & "+Date2+" is "+year_differ+" years,"+month_differ+"months,and "+date_differ+" days");
		
	}
}