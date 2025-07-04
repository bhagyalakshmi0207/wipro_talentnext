import java.util.*;
public class Question5_controlstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
			System.out.println("alphabet");
		}else if(ch>='0' && ch<='9') {
			System.out.println("number");
		}else {
			System.out.println("Special Character");
		}
sc.close();
	}

}
