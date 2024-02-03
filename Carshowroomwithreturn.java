package javabasics;

import java.util.Scanner;

public class Carshowroomwithreturn {
	static Scanner input=new Scanner(System.in);
	static String [] car= {"tataHArrier","toyotaInnova","MG Hectorplus","Hyundai Alcazar","Mahindra XUV400"};
	static int [] price= {154900,1999000,1779800,1677500,1599000};
	static int [] waiting= {3,5,8,4,12};
	public static String selectedThecar(int x) {
		return car[x-1];
	}
	public static int priceselected(int x) {
		return price[x-1];
	}
	public static int waitingperiodofcar(int x) {
		return waiting[x-1];
	}

	public static void main(String[] args) {
		
		System.out.println("Enter your profilename");
		String name=input.next();
		if (name.equalsIgnoreCase("kiran")) {
			System.out.println("Enter your password");
			String password=input.next();
			if (password.equals("king")) {
				System.out.println("please select the top performing car");
				for (int i=0;i<5;i++) {
					System.out.println((i+1)+" "+car[i]);
				}
				int x=input.nextInt();
				String carname=selectedThecar(x);
				System.out.println("You have selected "+carname);
				int priceofcar=priceselected(x);
				System.out.println("The price of "+carname+" is "+priceofcar);	
				int waitingper=waitingperiodofcar(x);
				System.out.println("Waiting period of the"+carname+" is "+waitingper);	
				}else {
				System.out.println("Incorrect password");
			}
			
		}else {
			System.out.println("Incorrect profiename");
		}
		System.out.println("changes done");
		

	}

}
