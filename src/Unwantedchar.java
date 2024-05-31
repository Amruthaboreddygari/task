import java.util.Arrays;
public class Unwantedchar {
	private static String[] name(String[] arr,String regex) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i].replaceAll(regex, "");
		}
		return arr;
	}
	public static void main(String[] args) {
		String[] arr= {"amrutha","supraja456","shireesha789"};
		System.out.println(Arrays.toString(name(arr,"[a-f]")));
	}

}


