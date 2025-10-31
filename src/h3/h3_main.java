package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 210;
		int j = 102;
		int k = -10;

		if (i > j) {
			k = 1;

			if (i > 200) {
				k = 2;

				if (j > 100) {
					k = 3;
				}
			}
		} else if (i <= 200) {
			if (j <= 100) {
				k = 4;
			}
		}
		System.out.println("k =" + k);
	}
}