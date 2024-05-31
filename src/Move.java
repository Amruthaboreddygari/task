import java.util.Arrays;

public class Move {
	static int[] moveZero(int[] x,int s) {
		int nonZeroIndex = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != s) {
				x[nonZeroIndex++] = x[i];
			}
		}
		for (int i = nonZeroIndex; i < x.length; i++) {
			x[i] = s;
		}
		return x;

	}

	public static void main(String[] args) {
		int[] x = { 54, 0, 2, 4, 0, 1, 3 };
		System.out.println(Arrays.toString(moveZero(x,0)));

	}

}
