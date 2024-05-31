
public class Firstlastindex {

	public static void main(String[] args) {
		int[] x= {1,2,3,6,8,9,3};
		int n=3;
		int first=-1;
		int last=-1;
		for(int i=0;i<x.length;i++) {
			if(x[i]==n && first==-1) {
				first=i;
			}
			if(x[i]==n && first!=-1) {
				last=i;
			}
		}
		System.out.println("first index: " +first);
		System.out.println("last index: " +last);

 
	}

}
