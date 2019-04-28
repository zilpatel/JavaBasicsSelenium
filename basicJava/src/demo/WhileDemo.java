package demo;

import java.util.Scanner;

public class WhileDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	correctPin = 1234;
	int tries = 0;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please Enter the Pin");
	int enteredPin = keyboard.nextInt();
	tries ++;
	while((enteredPin != correctPin) && tries < 3) {
		System.out.println("The Pin you entered is Incorect.Please try Again");
		enteredPin = keyboard.nextInt();
		tries ++;
	}
	if((tries <= 3) && (correctPin == enteredPin) ) {System.out.println("Welcome to LORDS Bank");}
	else {System.out.println("Your Card is Blocked");}
	}
	

}
