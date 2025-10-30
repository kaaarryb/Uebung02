package h2;

public class h2_main {
	public static void main(String[] args) {
		int i = 25;
		int j = 7;
		int k = 16;
		int min;
		int max;
		
		min = i;
		if (j < min) {
			min = j;
		}
		if (k < min) {
			min =k;
		}
		
		max = i;
		if (j > max) {
			max = j;
		}
		if (k > max) {
			max = k;
		}
		
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}
	

}
