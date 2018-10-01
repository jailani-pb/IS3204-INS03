package week12.learningstrings;

public class ReplacingString {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		String replacedPRA = pra.replace(" ", "#");
		System.out.println(replacedPRA);
		System.out.println(pra);
		
		String replacedFirstPRA = pra.replaceFirst(" ", "#");
		System.out.println(replacedFirstPRA);
		System.out.println(pra);
		
		String replacedPRA2 = pra.replaceAll(" ", "#");
		System.out.println(replacedPRA2);
		System.out.println(pra);
		
		String replacedPRA3 = pra.replaceAll("[amn]", "#");
		System.out.println(replacedPRA3);
		System.out.println(pra);
	}
	
}
