import java.util.*;

public class Question3_controlstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine().trim(); //Removes leading and trailing spaces from a string
		if(a.isEmpty()) {
			System.out.println("No Values");
		}else {
			String[] s=a.trim().split(" ");
			System.out.println(String.join(",", s));
		}
		sc.close();
		
		

    }

}
