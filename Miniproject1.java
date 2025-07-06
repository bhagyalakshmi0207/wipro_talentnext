package MiniProject_1;
import java.util.*;
public class Miniproject1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] EmpNo=new int[n];
		String[] EmpName=new String[n];
		int[] Basic=new int[n];
		char[] DesignationCode=new char[n];
		String[] Department=new String[n];
		int[] HRA=new int[n];
		int[] IT=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Details of Employees: "+(i+1)+" : ");
			System.out.println("Emp No: ");
			EmpNo[i]=sc.nextInt();
			sc.nextLine(); //From integer to string moving
			
			System.out.println("Emp Name: ");
			EmpName[i]=sc.nextLine();
			
			System.out.println("Department: ");
			Department[i]=sc.nextLine();
			
			System.out.println("Basic: ");
			Basic[i]=sc.nextInt();
			
			System.out.println("Desgnation Code: ");
			DesignationCode[i]=sc.next().charAt(0);
			
			System.out.println("HRA: ");
			HRA[i]=sc.nextInt();
			
			System.out.println("IT: ");
			IT[i]=sc.nextInt();
			
		}
		System.out.println("Enter Emp Id: ");
		int id=sc.nextInt();
		boolean index=false;
		for(int i=0;i<n;i++) {
			 	if(EmpNo[i]==id) {
			 		index=true;
			 		int da=0;
			 		String desig="";
			 	switch(DesignationCode[i]) {
			 	case 'e':desig="Engineer";
			 	da=20000;
			 	break;
			 	case 'c':desig="Consultant";
			 	da=32000;
			 	break;
			 	case 'k':desig="Clerk";
			 	da=12000;
			 	break;
			 	case 'r':desig="Receptionist";
			 	da=15000;
			 	break;
			 	case'm':desig="Manager";
			 	da=40000;
			 	break;
			 	default:
			 		desig="Unknown";
			 		da=0;
			 		break;
			 	}
			 	int salary=Basic[i]+HRA[i]+da-IT[i];
			 	System.out.println("\nEmp No. \t Emp Name  \t Department \t Designation \t Salary");
			 	System.out.println(EmpNo[i]+ " \t "+ EmpName[i] +" \t \t " +Department[i] +" \t \t "+desig+"  \t " +salary);
			 	break;
			}

		}if(!index) {
			System.out.println("Their is no emp id: "+id);
		}
		
		
	}

}
