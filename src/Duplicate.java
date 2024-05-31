
public class Duplicate {
	public static int duplicate(int[] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.out.println(x[j]);

				}
			}

		}
		return 0;

	}

	public static void main(String[] args) {
		int[] x = { 1, 3, 2, 6, 2,2,2, 9 };
		duplicate(x);

	}

}
