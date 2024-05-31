import java.util.Arrays;
public class Rotate {
	static int[] rotatearr(int[] x,int n) {
		 for(int i = 0; i < n; i++){    
	            int  last; 
	            last=x[x.length-1];
		 
	            for(int j=x.length-1;j>0;j--) {
	            	x[j]=x[j-1];
	            }
	            x[0]=last;
		 }
		 return x;

	}
	

	public static void main(String[] args) {
		int[] x= {1,2,3,4,5};
		System.out.println(Arrays.toString(rotatearr(x,2)));
		    
	}

}
