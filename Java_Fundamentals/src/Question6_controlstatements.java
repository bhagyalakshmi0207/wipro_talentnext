import java.util.*;
public class Question6_controlstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if(gender.equals("female")) {
			if(age>=1 && age <=58) {
				System.out.println("the percentage of interest is 8.2%");
			}else {
				System.out.println("the percentage of interest is 9.2%");
			}
		}
		if(gender.equals("male")) {
			if(age>=1 && age <=58) {
				System.out.println("the percentage of interest is 8.4%");
			}else {
				System.out.println("the percentage of interest is 10.5%");
			}
		}
		sc.close();
	}

}
