package Exercise;

import java.util.Scanner;

public class Voteridentify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=70;
		if(a>90){
			System.out.println("GRADE IS s "+a);}
			else if(a>80){
				System.out.println("GRADE IS A "+a);
				}
			else if(a>=70){
				System.out.println("GRADE IS B "+a);
			}
			else if(a<50){
				System.out.println("grade is U "+a);
			}
		TASK();
		
		
		// TODO Auto-generated method stub

	}


public static void TASK(){
	Scanner TASK=new Scanner(System.in);
	int s=TASK.nextInt();
	System.out.println("voters age");
	if(s<18){
		System.out.println("NOT ELIGIBLE FOR VOTE "+s);
	}
	else if(s>18){
		System.out.println("ELIGIBLE FOR VOTE "+s);
	}
	else if(s>60){
		System.out.println("THIS ARE SENIOR CITYSION");
	}
}
	
}
