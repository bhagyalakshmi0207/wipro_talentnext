import java.util.*;
public class Question2_controlstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		sc.close();
	}

}
