package week10.learningarrays;

public class MultiDArray {

	public static void main(String[] args) {
		byte[][][] values = new byte[3][3][3];
		values[1][0][0] = 15;
		values[1][1][2] = 12;
		
		for(byte x = 0; x < values.length; x++) {
			for(byte y = 0; y < values[x].length; y++) {
				for(byte z = 0; z < values[x][y].length; z++) {
					System.out.println(values[x][y][z]);
				}
			}
		}
		
	}
	
}
