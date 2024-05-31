
public class Commonnumbers {
	public static String common(int[] a, int[] b) {
		int m=0;
		java.lang.String s="";
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
				s=s.concat(a[i]+" ");
				}
			}
		}
		
		return s;
	}
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int[] b= {2,4,5,6,7};
	System.out.println(common(a,b));
	
}
}
