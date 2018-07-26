package week3.learningaccessmodifier.package1;

//if public is removed. Welcome.java will be able to access
//because it is in the same package
public class ThankYou {

	public static void printWholeMsg() {
		System.out.println("Hello and");
		printThankYou();
	}
	
	// if access modifier is private
	// other classes will not be access this method.
	public static void printThankYou() {
		System.out.println("Thank You");
	}
	
}
