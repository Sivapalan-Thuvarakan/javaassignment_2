import java.util.*;
class TimeIntravals{

	static int convertTimeTosec(double time){
		int time_hours=(int) time;
		double time_minutes=(time-time_hours)*100;
		int time__minutes=(int) time_minutes;

		return (time_hours*3600)+(time__minutes*60);
	}

	static void calculateTimeDiffer(double time1,double time2){
		

		int time1_sec=convertTimeTosec(time1);

		int time2_sec=convertTimeTosec(time2);

		int time_diff_mins=(time2_sec - time1_sec)/60;
		
		int hours_diff=time_diff_mins/60;
		int min_diff=(time_diff_mins-(hours_diff*60));
		
		System.out.println("time diffrence between "+time1+" and "+time2+" :"+hours_diff+"hours and "+min_diff+" minutes");
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time 1(starting time) one in 24 hours format");
		Double time1=sc.nextDouble();
		
		System.out.println("Enter Time 2(ending time) one in 24 hours format");
		Double time2=sc.nextDouble();

		calculateTimeDiffer(time1,time2);

	}
}