import java.util.*;

public class average {

	public static int calculateTotal(int mark1,int mark2,int mark3,int mark4,int mark5)
	{
		int total = mark1 + mark2 + mark3 + mark4 + mark5;
		return total;
	}
	public static float calculateAvg(int t) 
	{
		float avg=t/5;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		int mark4 = sc.nextInt();
		int mark5 = sc.nextInt();
		
		int resTotal=calculateTotal(mark1,mark2,mark3,mark4,mark5);
		System.out.println(resTotal);
		
		
	float resAvg=calculateAvg(resTotal);
		System.out.println(resAvg);

	}

}
