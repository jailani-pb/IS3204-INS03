package week13.learningregex;

public class CharacterClasses {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		System.out.println(pra);
		// Replace letter a to #
		System.out.println(pra.replaceAll("a", "#"));
		// Replace letter a, i or o to #
		System.out.println(pra.replaceAll("[aio]", "#"));
		// Replace any characters except a, i or o to #
		System.out.println(pra.replaceAll("[^aio]", "#"));
		// Replace letters a, m until t or z to #
		System.out.println(pra.replaceAll("[am-tz]", "#"));
		// Replace word Programming to #
		System.out.println(pra.replaceAll("Programming", "#"));
		// Replace digits to #
		System.out.println(pra.replaceAll("[0-9]", "#"));
		// Replace non-digits to #
		System.out.println(pra.replaceAll("[^0-9]", "#"));
		// Replace letters between A until Z to #
		System.out.println(pra.replaceAll("[A-Z]", "#"));
		// Replace all letters A until Z or digits 0 until 9 to #
		System.out.println(pra.replaceAll("[A-Z0-9]", "#"));
		// Replace all letters between d until o to #
		System.out.println(pra.replaceAll("[d-o]", "#"));
		// Replace all letters between H until Q to #
		System.out.println(pra.replaceAll("[H-Q]", "#"));
		// Replace all digits between 3 until 7 or 9 to #
		System.out.println(pra.replaceAll("[3-79]", "#"));
		// Replace all letters a until k except for c or g to #
		System.out.println(pra.replaceAll("[abd-fh-k]", "#"));
		System.out.println(pra.replaceAll("[a-k&&[^cg]]", "#"));
	}
	
}


