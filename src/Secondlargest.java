import java.util.Arrays;

public class Secondlargest {
	public static int large(int[] x) {
		int temp = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}

			}

		}
		for (int i = 0; i < x.length; i++) {
			if (x[x.length - 1 - i] < x[x.length - 1]) {
				
				return x[x.length - 1 - i];
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		int[] x = { 12, 34, 65, 23, 90 };
		System.out.println(large(x));

	}

}
