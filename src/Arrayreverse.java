
public class Arrayreverse {
	
	public static void rev(int[] x) {
		int rev[]=new int[x.length];
	for(int i=0;i<x.length;i++) {
		rev[i]=x[x.length-1-i];
	
		
		System.out.print(rev[i]+" ");
	}
	}

	public static void main(String[] args) {
	   int x[]= {1,2,3,4,5,6};
		rev(x);
		}

	}


