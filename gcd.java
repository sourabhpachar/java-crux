import java.util.*;
public class gcd {
public static int gcd1(int r1, int r2) {
	 if(r2==0) {
		 System.out.println(r1);
	 }
	 else {
		int r=r1%r2;
		r1=r2;
		gcd1(r1,r);
	 }
	 return r1;
 }
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b= sc.nextInt();
	if(a>b) {
		gcd1(a,b);
	}
	else
		gcd1(b,a);

	}

}
