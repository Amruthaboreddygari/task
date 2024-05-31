
public class Arrayduplication {
	public static boolean Duplicate(int[] x) {
			for(int i=0;i<x.length-1;i++) {
				for(int j=i+1;j<x.length;j++) {
			if(x[i]==x[j]) {
				return true;
			}
				}
		}
	return false;
	}
	public static void main(String[] args) {
		int[] x= {1,2,3,8,4,5};
		System.out.println(Duplicate(x));
	}

}
