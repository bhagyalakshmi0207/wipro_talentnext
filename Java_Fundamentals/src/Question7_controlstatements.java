import java.util.*;

public class Question7_controlstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		System.out.println(s.toLowerCase());
		char ch=sc.next().charAt(0);
		if(Character.isLowerCase(ch)) {
			char upper=Character.toUpperCase(ch);
			System.out.println(upper);
		}else if(Character.isUpperCase(ch)){
			char lower=Character.toLowerCase(ch);
			System.out.println(lower);
		}
		else {
			System.out.println("Alphabet");
		}
		
		sc.close();

	}

}
