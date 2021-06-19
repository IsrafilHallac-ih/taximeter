package taximeter;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int kilometer;
		double mileage=2.20;
		
		int minimumAmount=20;
		int openingFree=10;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kilometers To Travel :"  );
		kilometer=scan.nextInt();
		System.out.println(kilometer*mileage+openingFree);
		if (minimumAmount<=20) {
			System.out.println("Minimum Amount Payable :" + minimumAmount);
		}  
			
		}
		
		}

