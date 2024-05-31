
public class closest {
	public static int close(int[] x,int n) {
		if(x==null || x.length==0) {
			
	 return 0;
	}
	int nearest=x[0];
	int mindiff=Math.abs(x[0]-n);
	for(int i=0;i<x.length;i++) {
		int currentdiff=Math.abs(x[i]-n);
		if(currentdiff<mindiff) {
			mindiff=currentdiff;
			nearest=x[i];
		}
	}
	return nearest;
	}

	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,-9};
		System.out.println(close(x,-5));
		

	}

}
