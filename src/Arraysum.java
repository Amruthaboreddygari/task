
public class Arraysum {
      static int[] x= {34,56,74,67,12};
		public static int sum() {
		int sum=x[0];
		for(int i=1;i<x.length;i++) 
			sum=sum+x[i];
		 return sum;
		}
			
		public static void main(String[] args) {
		System.out.println(sum());

	}

}
