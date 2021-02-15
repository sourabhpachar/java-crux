import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int sum=0;
		while(n!=0) {
			int k=n%10;
			sum=sum*10+k;
			n=n/10;
		}
System.out.println(sum);
	}

}
