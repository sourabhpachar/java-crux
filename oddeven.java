import java.util.Scanner;

public class oddeven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int a = sc.nextInt();
	
	if(a%2==0) {
		System.out.println("no is even");
	}
	else {
		System.out.println("the no is odd");
	}
}
}
