import java.util.*;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int a=5,b=3;
int s=sc.nextInt();
int sum=1,sub=2,div=3,mul=4;
if(s==sum) {
	int add=a+b;
	System.out.println(add+" ");
}
else if(s==sub) {
	int min=a-b;
	System.out.println(min+" ");
}
else if(s==div) {
	int divi=a/b;
	System.out.println(divi+" ");
}
else {
	int mult=a*b;
	System.out.println(mult+" ");
}
	}

}
