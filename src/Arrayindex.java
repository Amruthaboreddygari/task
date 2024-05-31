
public class Arrayindex {

	public static int index() {
		int[] x = { 23, 45, 67, 84, 34, 89 };
		int tv = 67;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == tv) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(index());
	}

}
