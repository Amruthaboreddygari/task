import java.util.Arrays;

public class Missarray {
	public static void missingelements(int[] x) {
		Arrays.sort(x);
		int big=x[x.length-1];
		int[] missingnumbers=new int[big];
		int k=0;
		for(int i=0;i<big;i++) {
			if(k<x.length && i==x[k]) {
				k++;
			}
			else {
				missingnumbers[i]=i;
			}
		}
		System.out.println("Missing numbers:");
		for(int i:missingnumbers) {
			if(i!=0) {
				System.out.print(i+" ");
			}
		}
		
	}
	

	public static void main(String[] args) {
	  int[] x= {12,19,11,13};
	  missingelements(x);

	}

}
