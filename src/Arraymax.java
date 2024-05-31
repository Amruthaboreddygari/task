
public class Arraymax {
	static int[] x= {10,34,56,87,89,223,23};
	 public static int maximum() {
		 int max=x[0];
		 for(int i=1;i<x.length;i++) 
			 if(x[i]>max)
				 max=x[i];
		 return max;
		 
		 
	 }

	public static void main(String[] args) {
      
       System.out.println(maximum());

	}

}
