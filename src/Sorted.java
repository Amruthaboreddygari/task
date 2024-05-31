import java.util.Arrays;

public class Sorted {
	
	static int[]  srtarray(int[] a,int []b) {
	
		int[]c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
				   int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
				
				
			}
			
		}

//		System.out.println(Arrays.toString(c));
		return c;
	}

	public static void main(String[] args) {
		int[]  a= {3,6,13,23,67};
		int[]  b= {2,4,6,8};
		
		System.out.println(Arrays.toString(srtarray(a,b)));
	}

}
