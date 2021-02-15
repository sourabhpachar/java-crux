import java.util.Scanner;

public class nthfibonnacino {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int sum;
		int count=1;
		while(count<=n+1)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			 
			count++;
			
		}
	}

}
