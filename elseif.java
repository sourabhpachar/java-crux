import java.util.Scanner;

public class elseif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		if(age<=11) {
			System.out.println("child");
		}
		else if(age>=12  && age<=19) {
			System.out.println("teenager");
		}
		else {
			System.out.println("adult");
		}

	}
}
