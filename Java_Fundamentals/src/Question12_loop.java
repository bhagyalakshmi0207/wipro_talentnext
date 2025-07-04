import java.util.*;
public class Question12_loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(prime(n)) {
			System.out.println("prime");
		}else {
			System.out.println("not");
			
		}
		sc.close();
	}
	static boolean prime(int n) {
		if(n <2) return false;
		for(int i=2;i*i<=n;i++) {
			if(n % i==0) return false;
		}return true;
	}
}
