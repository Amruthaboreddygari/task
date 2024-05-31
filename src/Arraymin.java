
public class Arraymin {
	public static int minimum(int[] x) {
		int min=x[0];
		for(int i=0;i<x.length;i++) {
			if(x[i]<min) {
			min=x[i];
			
			
			
			
		}
		}
		return min;
		
	}

	public static void main(String[] args) {
		int[] x= {4,53,54,8,2,9,67};
		System.out.println(minimum(x));

	}

}
