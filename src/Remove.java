import java.util.Arrays;

public class Remove {
	static int[] removearr(int[] a, int x) {
		int count=0;
		for(int i:a){
			if(i==x) {
				count++;
			}}
			int[] b=new int[a.length-count];
			int d=0;
			for(int j:a) {
				if(j!=x) {
					b[d++]=j;
					
				}
			}
			return b;
		
	}

	public static void main(String[] args) {
		int[] a= {23,45,24,78,9,24,65};
		System.out.println(Arrays.toString(removearr(a,24)));
       
	}

}
