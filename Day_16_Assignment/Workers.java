package com.Day_16_compareto;


import java.util.Scanner;
import java.util.TreeSet;

public class Workers implements Comparable<Workers>{
	private int ID;
	private String NAME;
	
	private double SALARY;
	
	

	/**
	 * 
	 */
	public Workers() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	/**
	 * @param iD
	 * @param nAME
	 * @param sALARY
	 */
	public Workers(int iD, String nAME, double sALARY) {
		ID = iD;
		NAME = nAME;
		SALARY = sALARY;
	}
	


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNAME() {
		return NAME;
	}


	public void setNAME(String nAME) {
		NAME = nAME;
	}


	public double getSALARY() {
		return SALARY;
	}


	public void setSALARY(double sALARY) {
		SALARY = sALARY;
	}
	
	


	@Override
	public String toString() {
		return "Workers [ID=" + ID + ", NAME=" + NAME + ", SALARY=" + SALARY + "]";
	}


	@Override
	public int compareTo(Workers w) {
		if (this.SALARY>w.SALARY) {
			return 1;
		}else if(this.SALARY<w.SALARY) {
			return -1;
		}else
	
		return NAME.compareTo(w.NAME);
	}
	
	public static void main(String[] args) {
		
		int count=1;
		
		TreeSet<Workers> tSet=new TreeSet<>();
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
		System.out.println("ENTER THE WORKERS Details:" +(count++));
		System.out.println("ENTER THE WORKERS ID:");
		int id=scanner.nextInt();
		
		System.out.println("ENTER THE WORKERS NAME:");
		String name=scanner.next();
		
		System.out.println("ENTER THE WORKERS SALARY:");
		double sal=scanner.nextDouble();
		
		Workers worksWorkers=new Workers(id,name,sal);
		tSet.add(worksWorkers);
		
		System.out.println("DO YOU ADD MORE Workers: ");
		System.out.println("yes or no");
		
		String choiceString=scanner.next();
		
		if(choiceString.equalsIgnoreCase("no")){
			break;
		


		}
		}
		
		System.out.println("Workers DETAILS:");
		System.out.println("----------------------------");
		
		
		for(Workers g:tSet) {
			System.out.println((g));
		}
		
		}
}





//output:
/**
ENTER THE WORKERS Details:1
ENTER THE WORKERS ID:
123
ENTER THE WORKERS NAME:
JIDDESH
ENTER THE WORKERS SALARY:
7.2
DO YOU ADD MORE Workers:
yes or no
yes
ENTER THE WORKERS Details:2
ENTER THE WORKERS ID:
345
ENTER THE WORKERS NAME:
RAJESHREE
ENTER THE WORKERS SALARY:
7.0
DO YOU ADD MORE Workers:
yes or no
yes
ENTER THE WORKERS Details:3
ENTER THE WORKERS ID:
567
ENTER THE WORKERS NAME:
AKSHATA
ENTER THE WORKERS SALARY:
7.2
DO YOU ADD MORE Workers:
yes or no
no
Workers DETAILS:
-------------------------------------------------------
Workers [ID=345, NAME=RAJESHREE, SALARY=7.0]
Workers [ID=567, NAME=AKSHATA, SALARY=7.2]
Workers [ID=123, NAME=JIDDESH, SALARY=7.2]

*/
	
