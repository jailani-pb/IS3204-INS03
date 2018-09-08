package week9.learningarrays;

import java.util.Scanner;

public class ParallelArray {

	public static void main(String[] args) {
		byte maxUser = 10;
		String[] usernames = new String[maxUser];
		String[] passwords = new String[maxUser];
		
		Scanner userInput = new Scanner(System.in);
		String input = "";
		boolean stop = false;
		byte menuLevel = 0;
		byte numberRegistered = 0;
		boolean loggedIn = false;
		while(stop == false) {
			switch(menuLevel) {
			case 0:
				System.out.println("Welcome to Account Management");
				System.out.println("(1) Register");
				System.out.println("(2) Login");
				System.out.println("(3) Quit");
				System.out.println("Type the option number:");
				input = userInput.nextLine();
				try {
					byte optionNumber = Byte.parseByte(input);
					if(optionNumber >= 1 && optionNumber <= 3) {
						menuLevel = optionNumber;
					} else {
						System.out.println("Invalid input.");
						System.out.println("Must be between 1-3");
					}
				} catch(Exception e) {
					System.out.println("Invalid Input.");
					System.out.println("It has to be number.");
				}
				break;
				
			case 1:
				System.out.println("Registration menu");
				if(numberRegistered > 9) {
					System.out.println("Unable to register.");
					System.out.println("It is full.");
				} else {
					System.out.println("Key in username:");
					String usernameInput = userInput.nextLine();
					System.out.println("Key in password:");
					String passwordInput = userInput.nextLine();
					usernames[numberRegistered] = usernameInput;
					passwords[numberRegistered] = passwordInput;
					numberRegistered++;
					System.out.println("You are registered.");
				}
				menuLevel = 0;
				break;
				
			case 2:
				System.out.println("Login menu");
				System.out.println("Username:");
				String usernameInput = userInput.nextLine();
				System.out.println("Password:");
				String passwordInput = userInput.nextLine();
				for(int i = 0; i < usernames.length; i++) {
					if(usernameInput.equals(usernames[i])) {
						if(passwordInput.equals(passwords[i])) {
							System.out.println("You are logged in.");
							loggedIn = true;
							break;
						}
					}
				}
				if(loggedIn == false) {
					System.out.println("Invalid username or password.");
				}
				menuLevel = 0;
				break;
				
			case 3:
				System.out.println("Quiting the app");
				stop = true;
				break;
				
			default:
				break;
			}
		}
	}
	
}
