import java.util.*;
import java.text.*;

class TimeIntervals{
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Time (18:00:00):");
		String start_time=sc.nextLine();
		
		System.out.println("Enter ending Time (18:00:00):");
		String end_time=sc.nextLine();


		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

		Date date1=simpleDateFormat.parse(start_time);
		Date date2=simpleDateFormat.parse(end_time);

		long differenceInMillideconds = Math.abs(date2.getTime()-date1.getTime());
		long differenceInHours=	(differenceInMillideconds/(60*60*1000))%24;
		long differenceInMinutes=(differenceInMillideconds/(60*1000))%60;
		long differenceInSeconds=(differenceInMillideconds/(1000))%60;
		
		System.out.println("Time Diffrence:"+differenceInHours+":"+differenceInMinutes+":"+differenceInSeconds);
	}
}